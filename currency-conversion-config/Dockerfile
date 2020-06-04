FROM openjdk:8
VOLUME /tmp
EXPOSE 8086
ADD target/currency-conversion-config-0.0.1-SNAPSHOT.jar currency-conversion-config.jar
ENTRYPOINT ["java", "-jar","currency-conversion-config.jar"]