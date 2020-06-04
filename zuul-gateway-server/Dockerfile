FROM openjdk:8
VOLUME /tmp
EXPOSE 8095
ADD target/zuul-gateway-server-0.0.1-SNAPSHOT.jar zuul-gateway-server.jar
ENTRYPOINT ["java", "-jar","zuul-gateway-server.jar"]