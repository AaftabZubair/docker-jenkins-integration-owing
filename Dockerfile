FROM openjdk:8
EXPOSE 8080
ADD target/docker-jenkins-integration-owing.jar docker-jenkins-integration-owing.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration-owing.jar"]