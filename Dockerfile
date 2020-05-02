FROM maven:3-openjdk-8 AS builder
ENV MAVEN_OPTS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1 -Dmaven.artifact.threads=30"
WORKDIR /app
COPY pom.xml pom.xml
RUN mvn -T 1C dependency:go-offline -B
COPY .git .git
COPY src src
RUN mvn -T 1C clean install

FROM openjdk:8u171-jre-alpine
COPY --from=builder /app/target/jupiter-*.jar app/jupiter.jar
EXPOSE 8069 6996
WORKDIR app
ENTRYPOINT ["java", "-jar", "jupiter.jar", "--spring.profiles.active=${ACTIVE_PROFILE:}","--spring.config.location={${CONFIG_LOCATION:}"]
