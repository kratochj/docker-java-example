FROM maven:3.9.4-amazoncorretto-20 AS build-env

WORKDIR /app
COPY . .

RUN mvn clean package

# Final image
FROM amazoncorretto:21
COPY --from=build-env /app/target/java-1.0-SNAPSHOT.jar /java-app.jar
ENTRYPOINT ["java","-jar","/java-app.jar"]