FROM openjdk:11
ADD target/docker-movie-catalog.jar docker-movie-catalog.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","/docker-movie-catalog.jar"]