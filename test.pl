use Test::More tests=>6;
use_ok 'Selenium::Remote::Driver';

ok $ENV{TEST_BROWSER};
ok $ENV{TEST_PLATFORM};
#ignore version unless you have multiple versions of a browser
#ok $ENV{TEST_VERSION};

my $browser  = $ENV{TEST_BROWSER};
my $platform = $ENV{TEST_PLATFORM};

my $parms = [remote_server_addr=>'localhost:4444',
#my $parms = [remote_server_addr=>'JeremyM:c55c193d-99f3-4f45-a87f-85a409bc9d5e@ondemand.saucelabs.com', port=>80
             proxy => { 'proxyType' => 'system' }
];


push @$parms, (platform => $platform) unless $platform eq 'Any';
push @$parms, (browser_name => $browser) unless $browser eq 'Any';

#push @$parms, (extra_capabilities => {name => 'perl test'});

use Data::Dumper;

print Dumper($parms);

my $driver = new_ok('Selenium::Remote::Driver' => $parms);
  
ok $driver->get('http://www.google.com');
is $driver->get_title(), 'Google';
$driver->quit();
