use MIME::Base64;

use Test::More tests=>8;
use_ok 'Selenium::Remote::Driver';

ok $ENV{TEST_BROWSER}, "Browser name set";
ok $ENV{TEST_PLATFORM}, "Platform name set";
ok $ENV{TEST_VERSION}, "Version name set";
ok $ENV{TEST_URL}, "URL set";

my $browser  = $ENV{TEST_BROWSER};
my $platform = $ENV{TEST_PLATFORM};
my $version = $ENV{TEST_VERSION};
my $url = $ENV{TEST_URL};

$url =~ s|^http://||;

#my $parms = [remote_server_addr=>'JeremyM:c55c193d-99f3-4f45-a87f-85a409bc9d5e@ondemand.saucelabs.com', port=>80 ]; 
my $parms = [remote_server_addr=>$url ]; 

push @$parms, (platform => $platform) unless $platform eq 'Any';
push @$parms, (browser_name => $browser) unless $browser eq 'Any';
push @$parms, (version => $version) unless $version eq 'Any';

push @$parms, (extra_capabilities => {name => $ENV{BUILD_TAG}||$0 });

my $driver = new_ok('Selenium::Remote::Driver' => $parms);
  
ok $driver->get('http://www.google.com');
is $driver->get_title(), 'Google';

open(FH,'>','screenshot.png');
binmode FH;
my $png_base64 = $driver->screenshot();
print FH MIME::Base64::decode_base64($png_base64);
close FH;

$driver->quit();
