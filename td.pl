
use strict;

use DBI;
use Data::Dumper;

my $dbh = DBI->connect("dbi:ODBC:vmtest", 'vmtest', 'vmtest');

print Dumper ($dbh->selectall_arrayref(q{select * from vmtest.test}));
