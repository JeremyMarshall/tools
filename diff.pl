use strict;
use Text::Diff::Parser;
use Data::Dumper;

my $parser = Text::Diff::Parser->new( q{diff2.diff} );

#print Dumper $parser->files;
print Dumper $parser->changes(q{b/src/main/groovy/org/jenkinsci/plugins/jobdsl/stub/DslLink.groovy});
#print Dumper $parser;
