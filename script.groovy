import groovy.json.JsonSlurper

def result = []

def inputFile = new File("/Users/jeremymarshall/src/tools/prop.json")
def InputJSON = new JsonSlurper().parseText(inputFile.text)
InputJSON.prop1.each{ result << it }

return result
