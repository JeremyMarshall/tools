matrixProject{

jobName 'job'
jobDescription 'desc'
buildWrappers{
	//maskPassword 'aaa', 'bbb', 'ccc', 'ddd'
	maskPassword{ 
		['aaa', 'zzz'].each{
			entry it, it 
		}
	}
}
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
    //text 'ddd', 'a','b','c'
  }
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
