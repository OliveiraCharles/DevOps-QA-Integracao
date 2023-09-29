FROM jenkins/jenkins:lts

USER root

RUN apt-get update && apt-get install -y maven git

USER jenkins

EXPOSE 8081
