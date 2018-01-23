
List<Map<String,String>> GeneratePermutations(Map<String,List<String>> axes, List<Map<String,String>> ret){

	if (axes.size() == 0)
		return ret
        else {
		axes.each { k, v ->
			if( ret.size() == 0)
				v.each { i -> ret.push([ "${k}": "${i}"]) } 
			else {
				List<Map<String,String>> newRet = []
				ret.each { m ->
					v.each { i ->
						Map<String,String> n = [:]
						m.each {k1, v1 -> n[k1] = v1 }
						n[k] = i
						newRet.push(n)
					}
				}
                               ret = newRet 
			}
		}
	}
        return ret

}

println GeneratePermutations([
	axis1: ['a','b','c'], 
	axis2: ['x','y','z'], 
	axis3: ['1','2','3','4','5'],
        axis4: ['aa','bb','cc','dd']], [])

/*
[ 
	[ axis1: 'a', axis2: 'x', axis3: '1'],
        [ axis1: 'a', axis2: 'x', axis3: '2'],
	[ axis1: 'a', axis2: 'x', axis3: '3'],
 	[ axis1: 'a', axis2: 'y', axis3: '1'],
	[ axis1: 'a', axis2: 'y', axis3: '2'],
	[ axis1: 'a', axis2: 'y', axis3: '3'],
	[ axis1: 'a', axis2: 'z', axis3: '1'],
	[ axis1: 'a', axis2: 'z', axis3: '2'],
	[ axis1: 'a', axis2: 'z', axis3: '3'],

        [ axis1: 'b', axis2: 'x', axis3: '1'],
        [ axis1: 'b', axis2: 'x', axis3: '2'],
        [ axis1: 'b', axis2: 'x', axis3: '3'],
        [ axis1: 'b', axis2: 'y', axis3: '1'],
        [ axis1: 'b', axis2: 'y', axis3: '2'],
        [ axis1: 'b', axis2: 'y', axis3: '3'],
        [ axis1: 'b', axis2: 'z', axis3: '1'],
        [ axis1: 'b', axis2: 'z', axis3: '2'],
        [ axis1: 'b', axis2: 'z', axis3: '3'],

        [ axis1: 'c', axis2: 'x', axis3: '1'],
        [ axis1: 'c', axis2: 'x', axis3: '2'],
        [ axis1: 'c', axis2: 'x', axis3: '3'],
        [ axis1: 'c', axis2: 'y', axis3: '1'],
        [ axis1: 'c', axis2: 'y', axis3: '2'],
        st[ axis1: 'c', axis2: 'y', axis3: '3'],
        [ axis1: 'c', axis2: 'z', axis3: '1'],
        [ axis1: 'c', axis2: 'z', axis3: '2'],
        [ axis1: 'c', axis2: 'z', axis3: '3'],
]
*/
