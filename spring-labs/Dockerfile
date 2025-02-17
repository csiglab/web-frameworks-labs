FROM maven:3.8.5-openjdk-17 AS build
EXPOSE 8081
ADD target/springboot-images-book-api.jar springboot-images-book-api.jar
ENTRYPOINT ["java", "-jar", "springboot-images-book-api.jar"]