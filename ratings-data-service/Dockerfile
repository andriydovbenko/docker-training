FROM openjdk:11
ADD target/docker-ratings-data.jar docker-ratings-data.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/docker-ratings-data.jar"]
