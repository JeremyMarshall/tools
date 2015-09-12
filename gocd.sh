#!/bin/bash 
GOCD=$(docker run -d -p 8153:8153  jeremymarshall/gocd-dev:latest)
#GOCD=$(docker run -i -t -p 8153:8153  jeremymarshall/gocd-dev:latest)

#boot2docker only!
#VBoxManage controlvm boot2docker-vm natpf1 "name,tcp,127.0.0.1,8153,,8153"

echo $GOCD
