FROM amazoncorretto:17

WORKDIR /app

COPY src/Main.java/Civillian.java/Staff.java/Employee_ID.java/Password.java .

RUN javac Main.java

CMD ["java", "Main", "Civilian", "Staff", "Employee_ID", "Password"]
