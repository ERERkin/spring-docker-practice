FROM openjdk:11
EXPOSE 8080
ADD target/spring-docker-practice.jar spring-docker-practice.jar
ENTRYPOINT ["java", "-jar", "/spring-docker-practice.jar"]
