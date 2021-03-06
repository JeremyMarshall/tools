matrixJob('auto'){
  //description 'Build and test the app.'
  //scm{
  multiscm{
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
