# Use the official OpenJDK 17 Alpine image as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the 'target' directory of your Maven build to the container
COPY ecommerce.jar app.jar

# Expose the port that your Spring Boot application is running on (adjust as needed)
EXPOSE 8080

# Command to run the application when the container starts
CMD ["java", "-jar", "app.jar"]
