From openjdk:23-jdk-oracle

ARG DEPLOYDIR=/app

WORKDIR ${DEPLOY_DIR}

COPY pom.xml .
COPY mvnw .
COPY mvnw.cmd .
COPY src src
COPY .mvn ./mvn


RUN ./mvnw -Dmaven.skip.tests=true clean package

ENV SERVER_PORT 3000
EXPOSE ${SERVER_PORT}

ENTRYPOINT java -jar vttp5_ssf_day07carpark-0.0.1-SNAPSHOT.jar

