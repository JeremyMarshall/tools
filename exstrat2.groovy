combinations.each{

             if(it.TEST.contains('MAC'))
                  return

            String xx =  it.TEST

            println(xx)

            String loc = xx.tokenize('-')[2]

            result[loc] = result[loc] ?: []
            result[loc] << it
 }

 result
