# Set up the Java runtime environment.
FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.9_11.1-slim

RUN addgroup -g 1500 periodictableapp
RUN adduser -u 2000 -G periodictableapp -D periodictableapp

USER periodictableapp
COPY /build/libs/periodictable.jar periodictable.jar