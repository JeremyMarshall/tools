import os
import sys
import httplib
import base64
import json
import new
import unittest
import os
from selenium import webdriver

# it's best to remove the hardcoded defaults and always get these values
# from environment variables

browsers = [{"platform": os.environ["TEST_PLATFORM"],
             "browserName": os.environ["TEST_BROWSER"]}]


def on_platforms(platforms):
    def decorator(base_class):
        module = sys.modules[base_class.__module__].__dict__
        for i, platform in enumerate(platforms):
            d = dict(base_class.__dict__)
            d['desired_capabilities'] = platform
            name = "%s_%s" % (base_class.__name__, i + 1)
            module[name] = new.classobj(name, (base_class,), d)
    print (decorator)
    return decorator


@on_platforms(browsers)
class SauceSampleTest(unittest.TestCase):
    def setUp(self):
        self.desired_capabilities['name'] = self.id()

        sauce_url = os.environ["TEST_URL"] + '/wd/hub'
        self.driver = webdriver.Remote(
            desired_capabilities=self.desired_capabilities,
            command_executor=sauce_url
        )
        self.driver.implicitly_wait(30)

    def test_sauce(self):
        self.driver.get('http://saucelabs.com/test/guinea-pig')
        assert "I am a page title - Sauce Labs" in self.driver.title
        comments = self.driver.find_element_by_id('comments')
        comments.send_keys('Hello! I am some example comments.'
                           ' I should be in the page after submitting the form')
        self.driver.find_element_by_id('submit').click()

        commented = self.driver.find_element_by_id('your_comments')
        assert ('Your comments: Hello! I am some example comments.'
                ' I should be in the page after submitting the form'
                in commented.text)
        body = self.driver.find_element_by_xpath('//body')
        assert 'I am some other page content' not in body.text
        self.driver.find_elements_by_link_text('i am a link')[0].click()
        body = self.driver.find_element_by_xpath('//body')
        assert 'I am some other page content' in body.text

    def tearDown(self):
        self.driver.quit()
