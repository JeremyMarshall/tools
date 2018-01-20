
void GeneratePermutations(List<List<Character>> Lists, List<String> result, int depth, String current){
    if(depth == Lists.size()) {
        result.add(current);        
        return;      
    }

    for(int i = 0; i < Lists.get(depth).size(); ++i) {         
        GeneratePermutations(Lists, result, depth + 1, current + Lists.get(depth).get(i));     
    } 
}

List<String> res = []
GeneratePermutations([['a','b','c'],['x','y','z'],['1','2','3']], res, 0, "")

println (res)
