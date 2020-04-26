FROM openjdk:8
COPY ./target/jupiter-*.jar app/jupiter.jar
EXPOSE 8069 6996
WORKDIR app
ENTRYPOINT ["java", "-jar", "jupiter.jar", "--spring.profiles.active=${ACTIVE_PROFILE:}"]
