FROM openjdk:10-jre-slim
COPY ./target/usermanagement-0.0.1-SNAPSHOT.jar /usr/src/demo/
WORKDIR /usr/src/demo
EXPOSE 8080
CMD ["java", "-jar", "usermanagement-0.0.1-SNAPSHOT.jar"]