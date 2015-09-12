import os
from selenium import webdriver

sauce_url = os.environ["TEST_URL"]

desired_capabilities = {
    'platform': os.environ["TEST_PLATFORM"],
    'browserName': os.environ["TEST_BROWSER"]
}

driver = webdriver.Remote(desired_capabilities=desired_capabilities,
                          command_executor=sauce_url)
driver.implicitly_wait(10)

driver.get('http://google.com')
assert "Google" in driver.title
driver.quit()

from sauceclient import SauceClient

sauce_client = SauceClient("JeremyM", "880f1a08-8d30-4c5d-b379-596a9f72f40e")

sauce_client.jobs.update_job(driver.session_id, passed=True)
