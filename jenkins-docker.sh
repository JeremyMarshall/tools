#!/bin/bash 
#JENKINS=$(docker run -d -p 8080:8080  jeremymarshall/jenkins-dsl-stub:latest)

#boot2docker only!
#VBoxManage controlvm boot2docker-vm natpf1 "name,tcp,127.0.0.1,8080,,8080"

#docker create -v /var/jenkins_home --name jenkins-dv jenkins

JENKINS=$(docker run -d -p 8080:8080 --volumes-from jenkins-dv --name myjenkins jenkins)

#docker run -i -t  test -master http://172.17.0:8080
echo $JENKINS
