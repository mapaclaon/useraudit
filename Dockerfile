FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} useraudit.jar
ENTRYPOINT ["java","-jar","/useraudit.jar"]