use strict;
use warnings;

my $cmd = 'java -jar jenkins-cli.jar -s http://localhost:8080/jenkins groovy =';

my $groovy = " 
['a','b','c'].each{ 
  println it
}
";

open F, " |  $cmd" || die "cannot open pipe: $!\n";

print F $groovy;
close F;





