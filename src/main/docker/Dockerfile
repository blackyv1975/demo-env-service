FROM openjdk:17.0.2-jdk

ARG JAR_FILE=target/*.jar

ADD maven/demo-env-0.0.1-SNAPSHOT.jar demo-env-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/demo-env-0.0.1-SNAPSHOT.jar"]