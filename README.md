# spring-docker-practice
Project for practicing with Docker

#Link to video
https://www.youtube.com/watch?v=oGxkLH_OAlc

##Commands:

###Build and run project:
mvn install

docker build -t spring-docker-practice.jar .

docker run -p 9090:8080 spring-docker-practice.jar

[//]: # (docker run -d spring-docker-practice.jar)

###Stop project
docker container ls 

docker ps

docker kill (*CONTAINER ID)

docker stop (*CONTAINER ID)

###Push to DockerHub
docker login

docker image ls

docker push erkinjavadeveloper/spring-docker-practice.jar


###Add Database
docker run --rm --name postgresql -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=dockerdb -d postgres:latest

###Git into Database
docker exec -it postgresql psql -d dockerdb -U postgres

###Start docker compose
docker-compose up --build


