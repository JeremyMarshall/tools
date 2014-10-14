import groovy.json.JsonSlurper

def inputFile = new File("/Users/jeremymarshall/src/tools/prop.json")
def InputJSON = new JsonSlurper().parseText(inputFile.text)

println Eval.me(InputJSON.filter)
return [FILTER: InputJSON.filter]
