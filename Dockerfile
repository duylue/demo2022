FROM openjdk:11
ARG JAR_FILE=build/libs/demo-orc-0.0.1-SNAPSHOT
ENTRYPOINT ["java","-jar","/demo-orc-0.0.1-SNAPSHOT.jar"]

