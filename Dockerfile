# Stage 1: Build aplikasi dengan Maven
FROM maven:3.8.6-openjdk-17-slim AS builder
WORKDIR /app

# Salin file pom.xml dan source code
COPY pom.xml .
COPY src ./src

# Build aplikasi dan skip test (opsional)
RUN mvn clean package -DskipTests

# Stage 2: Jalankan aplikasi
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy file JAR dari stage builder
COPY --from=builder /app/target/*.jar app.jar

# Expose port yang digunakan
EXPOSE 8080

# Jalankan aplikasi
CMD ["java", "-jar", "app.jar"]
