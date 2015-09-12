#!/bin/bash 

DOCKER_SERVER=$(docker run -dt --name teamcity-server -p 8111:8111 -v ~/.teamcity:/data/teamcity --restart=always jeremymarshall/teamcity-server:initial)

TEAMCITY_HOST=$(docker inspect --format  '{{ .NetworkSettings.IPAddress }}' ${DOCKER_SERVER} )

#DOCKER_AGENT=$(docker run -e TEAMCITY_SERVER=http://$TEAMCITY_HOST:8111 -dt --name teamcity-agent0 -p 9090:9090 jeremymarshall/teamcity-agent:initial)

#DOCKER_AGENT=$(docker run -e TEAMCITY_SERVER=http://$TEAMCITY_HOST:8111 -dt --name teamcity-agent1 -p 9091:9091 jeremymarshall/team-city-agent-mine)

DOCKER_AGENT=$(docker run -e TEAMCITY_SERVER=http://$TEAMCITY_HOST:8111 -dt --name teamcity-agent2 -p 9092:9092 ariya/centos6-teamcity-agent)

#boot2docker only!
#VBoxManage controlvm boot2docker-vm natpf1 "name2,tcp,127.0.0.1,8111,,8111"

echo "server $DOCKER_SERVER ($TEAMCITY_HOST) agent $DOCKER_AGENT"
