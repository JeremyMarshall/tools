$java -jar swarm-client-jar-with-dependencies.jar -master http://jenkins/jenkins -name mac 
JOB=$(docker run -d jenkins-slave-mine  /bin/bash -c "java -jar swarm.jar -master=http://192.168.59.3:8080 -username=jeremy -password=jeremy -labels=linx -executors=6")
