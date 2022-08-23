FROM adoptopenjdk/openjdk11:latest
COPY target/indice-pobreza-0.0.1-SNAPSHOT.jar indice-pobreza-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/indice-pobreza-0.0.1-SNAPSHOT.jar"]

