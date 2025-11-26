FROM openjdk:23

WORKDIR /app

# Copy compiled classes into image
COPY out/production/HelloWorldDocker/ /app

# Run the main class
CMD ["java", "Main"]
