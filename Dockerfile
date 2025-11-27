FROM amazoncorretto:17

WORKDIR /app

COPY src/Main.java .

RUN javac main.java

CMD ["java", "Main"]
