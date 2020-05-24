Getting started: SpringBoot with Docker

This project is a basic Hello World starter project in SpringBoot for beginners to learn how to containarise a SpringBoot application using Docker.

After cloning the project run the following commands from inside the parent directory (named docker):
1) docker build -t my_dockerhub_username/docker-springboot

2) docker run -p 8080:8080 my_dockerhub_username/docker-springboot:latest

This should start the application. You can hit http://localhost:8080/docker/example1 on the browser to check whether the application is running.

References: 
https://spring.io/guides/topicals/spring-boot-docker/
https://spring.io/guides/gs/spring-boot-docker/
