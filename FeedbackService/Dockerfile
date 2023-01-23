FROM openjdk:11
EXPOSE 8085
ADD ./target/FeedbackService-1.0-SNAPSHOT-jar-with-dependencies.jar feedback.jar
ENTRYPOINT ["java","-jar", "feedback.jar"]