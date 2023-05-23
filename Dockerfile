# Set up the Java runtime environment.
FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.9_11.1-slim

# Create an application group and add a user.
RUN addgroup -g 1500 periodictableapp
RUN adduser -u 2000 -G periodictableapp -D periodictableapp

# Copy the JAR file containing the application to the file system.
USER periodictableapp
COPY /build/libs/periodictable.jar periodictable.jar

# Start the application by running the embedded Tomcat container.
USER periodictableapp
CMD ["sh", "-c", "java $JAVA_OPTS  \
    -Xms4096m \
    -Xmx4096m \
    -jar /periodictable.jar"]