FROM amazoncorretto:17

WORKDIR /app

COPY src/*.java .

RUN javac *.java

CMD ["java", "Main"]


