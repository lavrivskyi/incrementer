FROM openjdk:11-oracle
COPY target/incrementer-1.0-SNAPSHOT.jar incrementer-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/incrementer-1.0-SNAPSHOT.jar"]