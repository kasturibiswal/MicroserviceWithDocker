FROM openjdk:8
VOLUME /tmp
EXPOSE 8000
ADD target/currency-conversion-factor-service-0.0.1-SNAPSHOT.jar currency-conversion-factor-service.jar
ENTRYPOINT ["java", "-jar","currency-conversion-factor-service.jar"]