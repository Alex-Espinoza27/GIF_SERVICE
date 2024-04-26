FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/giftService-0.0.1-SNAPSHOT.jar GiftServices.jar
ENTRYPOINT ["java", "-jar","/GiftServices.jar"]