FROM openjdk:11-jre
WORKDIR usr/src
ADD ./target/Muzix-0.0.1-SNAPSHOT.jar /usr/src/Muzix-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/Muzix-0.0.1-SNAPSHOT.jar"]
