FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/giftService-0.0.1-SNAPSHOT.jar GiftServiceBackend.jar
ENTRYPOINT ["java", "-jar","/GiftServiceBackend.jar"]