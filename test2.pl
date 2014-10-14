use Test::More tests=>6;
use_ok 'Selenium::Remote::Driver';

#ignore version unless you have multiple versions of a browser
#ok $ENV{TEST_VERSION};

#my $parms = [remote_server_addr=>'localhost', port=>4444, browser_name>='chrome',
my $parms = [remote_server_addr=>'JeremyM:c55c193d-99f3-4f45-a87f-85a409bc9d5e\@ondemand.saucelabs.com:', port=>80, browser_name>='chrome',
             proxy => { 'proxyType' => 'system' }];


my $driver = new_ok('Selenium::Remote::Driver' => $parms);
  
ok $driver->get('http://www.google.com');
is $driver->get_title(), 'Google';
$driver->quit();
