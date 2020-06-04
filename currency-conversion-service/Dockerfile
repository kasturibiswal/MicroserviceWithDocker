FROM openjdk:8
VOLUME /tmp
EXPOSE 8200
ADD target/currency-conversion-service-0.0.1-SNAPSHOT.jar currency-conversion-service.jar
ENTRYPOINT ["java", "-jar","currency-conversion-service.jar"]