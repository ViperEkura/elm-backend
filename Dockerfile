FROM openjdk:17-jdk-slim
WORKDIR /app

COPY target/elm-backend-1.0-SNAPSHOT.jar  elm-backend-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "elm-backend-1.0-SNAPSHOT.jar"]
EXPOSE 8080
