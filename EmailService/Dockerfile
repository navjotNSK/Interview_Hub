FROM openjdk:11
EXPOSE 8084
ADD ./target/EmailService-1.0-SNAPSHOT-jar-with-dependencies.jar  email.jar
ENTRYPOINT ["java","-jar", "email.jar"]