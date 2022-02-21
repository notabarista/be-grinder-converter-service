FROM adoptopenjdk/openjdk11:latest

RUN mkdir -p /software

ADD target/grinder-service-0.0.1-SNAPSHOT.jar /software/grinder-service-0.0.1-SNAPSHOT.jar

CMD java -Xmx128m -Xmx256m -Dserver.port=$PORT $JAVA_OPTS -jar /software/grinder-service-0.0.1-SNAPSHOT.jar
