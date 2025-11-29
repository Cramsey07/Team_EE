FROM amazoncorretto:17

WORKDIR /app

COPY src ./src

RUN javac src/*.java

CMD ["java", "-cp", "src", "Main"]

