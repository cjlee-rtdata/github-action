FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/java-app-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "my-app-1.0-SNAPSHOT.jar"]

java -jar ./build/libs/java-app-1.0-SNAPSHOT.jar

./build/libs:
java-app-1.0-SNAPSHOT.ja

./build/libs:
java-app-1.0-SNAPSHOT.jar