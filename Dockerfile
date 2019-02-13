FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} payment-microservice-payment-list-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/payment-microservice-payment-list-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081
