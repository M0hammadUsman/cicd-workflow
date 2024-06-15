FROM maven:3.9.7-eclipse-temurin-21-alpine AS build
LABEL authors="usman"
WORKDIR /home/usr/app
COPY pom.xml .
COPY /src ./src
RUN mvn clean spring-boot:build-image -B -C -DskipTests --no-transfer-progress
