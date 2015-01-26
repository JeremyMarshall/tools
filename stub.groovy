job (type: Matrix){
  	  //resolveStrategy = Closure.DELEGATE_ONLY
  
      name 'auto'
      description 'Build and test the app.'

     axes{
       
       //m.execute('aaa', {auto()})
       
       chuckNorris('aaa'){
         //name 'name'
         manual 'bbb', 'ccc', 'ddd'
         auto()
       }
       
       //chuckNorris('aaa',{name('bbb')})
       
       //chuckNorrisManual 'aaa', 'Chuck 1', 'Chuck2'
       //chuckNorris 'ccc'
       //text 'ddd', 'a','b','c'
     }
     steps {
        helloWorld 'Jeremy'
        //shell('ps')
        //shell('env |sort')
 
     }
}

