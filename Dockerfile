# we will use openjdk 8 with alpine as it is a very small linux distro
FROM openjdk:17-alpine

# copy the packaged jar file into our docker image
COPY target/rest-batch-0.0.1-SNAPSHOT.jar /rest-batch.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/rest-batch.jar"]
