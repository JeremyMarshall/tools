combinations.each{
  
             if(it.axis2 == 'z')
                   return

             if(it.axis1 == 'b')
                   return

             result[it.axis2] = result[it.axis2] ?: []
             result[it.axis2] << it         
} 

result

