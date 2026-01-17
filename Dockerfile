# 1️⃣ Build stage: compile your Spring Boot app
FROM maven:3.9.2-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy Maven pom first (for dependency caching)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the jar without tests
RUN mvn clean package -DskipTests

# 2️⃣ Run stage: smaller image with only JRE
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/Blog-Service-0.0.1-SNAPSHOT.jar app.jar

# Expose port Spring Boot will use
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
