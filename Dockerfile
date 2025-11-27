FROM amazoncorretto:17

WORKDIR /app

COPY src/main.java .

RUN javac Main.java

CMD ["java", "Main"]
