
use strict;

use DBI;
use Data::Dumper;

my $dbh = DBI->connect("dbi:ODBC:test", 'dbc', 'dbc');

print Dumper ($dbh->selectall_arrayref(q{select count(*) from dbc.tables}));
