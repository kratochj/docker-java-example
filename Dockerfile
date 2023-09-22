FROM openjdk:17-jdk-slim-bullseye AS build-env

WORKDIR /app
COPY . .

RUN javac src/java/*.java
WORKDIR /app/src/java
RUN jar cfe main.jar HelloWorld *.class

# Final image
FROM gcr.io/distroless/java17-debian12
COPY --from=build-env /app/src/java /app
WORKDIR /app
CMD ["main.jar"]