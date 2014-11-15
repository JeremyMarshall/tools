combinations.each{
  
             if(it.axis2 == 'x')
                   return

             if(it.axis1 == 'c')
                   return

             result[it.axis2] = result[it.axis2] ?: []
             result[it.axis2] << it         
} 

result

