#! /usr/bin/perl
use strict;
use warnings;
use Selenium::Remote::Driver;

my $desc = "perl webdriver bindings and selenium!";

my $login = "JeremyM";
my $apiKey = "c55c193d-99f3-4f45-a87f-85a409bc9d5e";
my $host = "$login:$apiKey\@ondemand.saucelabs.com";

my $driver = new Selenium::Remote::Driver(
                          'remote_server_addr' => $host,
                          'port' => "80",
                          #'browser_name' => "firefox",
                          #'version' => "7",
                          #'platform' => "WINDOWS",
                          #'extra_capabilities' => {'name' => $desc},
                          );
$driver->get('http://www.google.com');
print $driver->get_title();
$driver->quit();
