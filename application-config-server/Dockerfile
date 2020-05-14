FROM openjdk:11
VOLUME /tmp
COPY ./target/*.jar app.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/app.jar"]