project{

jobName 'job'
jobDescription 'desc'
buildWrappers{}
scm{
      fsscm{
        path '/Users/jeremymarshall/src/tools'
        localPath 'test'
      }
    }
  //}

  builders {
    helloWorld {who 'Jeremy'}
    helloWorld {who 'Second'}
    //shell('ps')
    //shell('env |sort')
  }

  publishers{
    logParser {
      projectRulePath 'test/rules.txt'
    }
  }
}
