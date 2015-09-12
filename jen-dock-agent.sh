#docker run \
#-e JENKINS_USERNAME=jeremy \
#-e JENKINS_PASSWORD=jeremy \
#-e JENKINS_MASTER=http://192.168.0.5:8080 \
#maestrodev/build-agent


docker run csanchez/jenkins-swarm-slave -master http://192.168.0.5:8080 -username jeremy -password jeremy -executors 1
