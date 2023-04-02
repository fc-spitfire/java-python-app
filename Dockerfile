FROM openkbs/jdk-mvn-py3:latest as build
COPY target/java-python-app-0.0.1-SNAPSHOT.jar data/java-python-app-0.0.1-SNAPSHOT.jar
COPY random_numbers.py data/random_numbers.py
ENTRYPOINT ["java","-jar","data/java-python-app-0.0.1-SNAPSHOT.jar"]