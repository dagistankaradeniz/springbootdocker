FROM openjdk:8
EXPOSE 8090
ADD /target/Test-0.0.1-SNAPSHOT.jar SpringDocker.jar
ENTRYPOINT ["java","-jar","SpringDocker.jar"]