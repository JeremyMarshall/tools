matrixProject{

jobName 'job'
jobDescription 'desc'

scm{
      fsscm{
        path '/Users/jeremymarshall/src/tools'
        localPath 'test'
      }
    }
  //}

  axes{
    chuckNorris{
      axisName 'Jeremy'
      items {
        manual 'bbb', 'ccc', 'ddd'
        auto()
      }
    }
    //text 'ddd', 'a','b','c'
  }
  steps {
    helloWorld {who 'Jeremy'}
    //shell('ps')
    //shell('env |sort')
  }

  publishers{
    logParser {
      projectRulePath 'test/rules.txt'
    }
  }
}
matrixProject{

jobName 'job'
jobDescription 'desc'

scm{
      fsscm{
        path '/Users/jeremymarshall/src/tools'
        localPath 'test'
      }
    }
  //}

  axes{
    chuckNorris{
      axisName 'Jeremy'
      items {
        manual 'bbb', 'ccc', 'ddd'
        auto()
      }
    }
    //text 'ddd', 'a','b','c'
  }
  steps {
    helloWorld {who 'Jeremy'}
    //shell('ps')
    //shell('env |sort')
  }

  publishers{
    logParser {
      projectRulePath 'test/rules.txt'
    }
  }
}
