FROM openjdk:11 
EXPOSE 8080
ADD ./target/RegistrationService-0.0.1-SNAPSHOT-jar-with-dependencies.jar registration.jar
ENTRYPOINT ["java","-jar", "registration.jar"]