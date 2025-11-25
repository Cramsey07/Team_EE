
                    FROM openjdk:21-jre-slim


                    RUN mkdir /app

                # Copy the app files from host machine to image filesystem
                    COPY out/production/HelloWorldDocker/ /app

                # Set the directory for executing future commands
                    WORKDIR /app

                # Run the Main class
                    CMD java Main

                    FROM openjdk:21-jre-slim
                    WORKDIR /app
                    COPY src/ /app/
                    RUN javac *.java
                    CMD ["java", "HelloWorld"]

