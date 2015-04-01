import org.jenkinsci.plugins.jobdsl.stub.Factory
import org.jenkinsci.plugins.jobdsl.stub.annotations.dsl.Axis
import org.jenkinsci.plugins.jobdsl.stub.annotations.dsl.Step
import com.thoughtworks.xstream.XStream

def f = new Factory()

def ax = {
  axisName 'nnn'
  items {
  	manual 'bbb', 'ccc'
  	auto()
  }
}

def ax2 = {
 	who 'name'
}

def m = f.getCategory(Axis).getMethod('chuckNorris', ax)
def o =  m.execute(ax)

def m2 = f.getCategory(Step).getMethod('helloWorld', ax2)
def o2 =  m2.execute(ax2)

println f.xstream.toXML(o)
println f.xstream.toXML(o2)
