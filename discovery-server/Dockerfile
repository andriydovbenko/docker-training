FROM openjdk:11
ADD target/docker-discovery-server.jar docker-discovery-server.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/docker-discovery-server.jar"]