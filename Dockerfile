FROM amazoncorretto:17

WORKDIR /app

COPY src/main.java .

RUN javac main.java

CMD ["java", "Main"]
