FROM openjdk:8-jdk-alpine

EXPOSE 9090

ARG JAR_FILE=target/simple-spring-boot-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} simple-spring-boot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/simple-spring-boot-0.0.1-SNAPSHOT.jar"]
