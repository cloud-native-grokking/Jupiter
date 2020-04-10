FROM openjdk:8
COPY ./target/jupiter-*.jar app/jupiter.jar
EXPOSE 8069 6996
ENTRYPOINT ["java", "-jar", "app/jupiter.jar", "--spring.profiles.active=docker"]
