use Test::More tests=>6;
use_ok 'Selenium::Remote::Driver';

use Data::Dumper;


my $driver = new Selenium::Remote::Driver(
    'remote_server_addr' => 'localhost',
    'port' => "4444",
    'browser_name' => 'phantomjs',

    extra_capabilities => {
        'phantomjs.cli.args' => ['--webdriver-logfile=/tmp/phantomjsdriver.log']
    }
); 

ok $driver->get('http://www.google.com');
is $driver->get_title(), 'Google';
$driver->quit();
