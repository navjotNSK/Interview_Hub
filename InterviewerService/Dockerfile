FROM openjdk:11
EXPOSE 8082
ADD ./target/GLProduct4-1.0-SNAPSHOT-jar-with-dependencies.jar interviewer.jar
ENTRYPOINT ["java","-jar", "interviewer.jar"]