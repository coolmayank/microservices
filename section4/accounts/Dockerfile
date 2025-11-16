FROM eclipse-temurin:21-jdk-jammy
LABEL maintainer = "coolmoonmayank@gmail.com"\
 org.opencontainer.image.title="coolmoonmayanks/account"\
 org.opencontainers.image.version="s4"
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]