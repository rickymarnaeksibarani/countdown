# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build

# Gunakan base image JDK 17 atau sesuai versi yang digunakan
FROM openjdk:17-jdk-slim

# Set environment variable untuk port
ENV PORT=8080

# Set working directory di dalam container
WORKDIR /app

# Copy the pom.xml file and the source code to the working directory
COPY pom.xml ./
COPY src ./src

# Copy file JAR hasil build ke dalam container
COPY target/*.jar app.jar

# Eksekusi aplikasi saat container berjalan
ENTRYPOINT ["java", "-jar", "app.jar"]


