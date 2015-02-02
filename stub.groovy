job (type: Matrix){
      name 'auto'
      description 'Build and test the app.'

     axes{
       chuckNorris{
         axisNnme 'name'
	 items {
           manual 'bbb', 'ccc', 'ddd'
           auto()
         }
       }
       text 'ddd', 'a','b','c'
     }
     steps {
        helloWorld {who 'Jeremy'}
        shell('ps')
        shell('env |sort')
     }
}

