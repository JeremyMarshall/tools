import org.jenkinsci.plugins.hw_dsl_stub.*
import hudson.tasks.BuildStepDescriptor
  
println(hudson.model.Hudson.instance.pluginManager.plugins)
  
println "Running plugin enumerator"
println ""
def plugins = jenkins.model.Jenkins.instance.getPluginManager().getPlugins()
plugins.each {println "${it.getShortName()} - ${it.getVersion()}"}
println ""
println "Total number of plugins: ${plugins.size()}"
  
def x = new HelloWorldBuilder('a')
print (x.dump())
  
  jenkins.model.Jenkins.instance.getExtensionList(BuildStepDescriptor)
