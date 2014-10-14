combinations.each{
  
             if(it.axis3 == 'j')
                   return

             result[it.axis2] = result[it.axis2] ?: []
             result[it.axis2] << it         
} 

result

