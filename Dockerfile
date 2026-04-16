# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the application
# Humne openjdk ki jagah eclipse-temurin use kiya hai jo stable hai
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar zpower.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "zpower.jar"]