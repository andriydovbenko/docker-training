FROM openjdk:11
ADD target/docker-movie-info.jar docker-movie-info.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/docker-movie-info.jar"]