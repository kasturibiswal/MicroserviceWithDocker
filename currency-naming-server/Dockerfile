FROM openjdk:8
VOLUME /tmp
EXPOSE 8090
ADD target/currency-naming-server-0.0.1-SNAPSHOT.jar currency-naming-server.jar
ENTRYPOINT ["java", "-jar","currency-naming-server.jar"]