 # Use the OpenJDK 23 image as the base image
FROM openjdk:24

                # Create a new app directory for my application files
RUN mkdir /app

                # Copy the app files from host machine to image filesystem
COPY out/production/HelloWorldDocker/ /app

                # Set the directory for executing future commands
WORKDIR /app

                # Run the Main class
CMD java Main

FROM openjdk:23
WORKDIR /app
COPY src/ /app/
RUN javac *.java
CMD ["java", "HelloWorld"]