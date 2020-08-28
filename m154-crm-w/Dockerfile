FROM openjdk:13-alpine3.10

MAINTAINER Aleksandar "aleksandar.stojakovic@gibmit.ch"

EXPOSE 7070

WORKDIR /usr/local/bin

COPY ./target/fallstudieM154-crm-web-0.0.1-SNAPSHOT-shaded.jar webapp.jar

CMD ["java", "-jar", "webapp.jar"]