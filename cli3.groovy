matrixProject{

jobName 'job'
jobDescription 'desc'

scm{
      fsscm{
        path '/Users/jeremymarshall/src/tools'
        localPath 'test'
      }
    }

  axes{
    chuckNorris{
      axisName 'Jeremy'
      items {
        manual 'bbb', 'ccc', 'ddd'
        auto()
      }
    }
  }
  steps {
    helloWorld {who 'Jeremy'}
    helloWorld {who 'Jeremy'}
  }

  publishers{
    logParser {
      projectRulePath 'test/rules.txt'
      projectRulePath 'test/rules.txt'
    }
  }
}

steps {
  helloWorld {who 'Jeremy'}
  helloWorld {who 'Jeremy'}
}
