FROM openjdk:8-jdk-alpine

EXPOSE 8080

ARG JAR_FILE=target/simple-spring-boot-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} simple-spring-boot-0.0.1-SNAPSHOT.jar

RUN ls -l /

RUN ls -l

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/simple-spring-boot-SNAPSHOT.jar"]
