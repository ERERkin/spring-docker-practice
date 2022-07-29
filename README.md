# spring-docker-practice
Project for practicing with Docker

#Link to video
https://www.youtube.com/watch?v=oGxkLH_OAlc

##Commands:

###Build project:
mvn install

docker build -t spring-docker-practice.jar .

docker run -p 9090:8080 spring-docker-practice.jar

###Push to DockerHub
docker login

docker image ls

docker push erkinjavadeveloper/spring-docker-practice.jar


