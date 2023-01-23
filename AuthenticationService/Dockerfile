FROM openjdk:11 
EXPOSE 8081
ADD ./target/AuthenticationService-1.0-SNAPSHOT-jar-with-dependencies.jar authentication.jar
ENTRYPOINT ["java","-jar", "authentication.jar"]
