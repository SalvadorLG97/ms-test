FROM openjdk:8u322-jdk-oracle
COPY "./target/test-tecnica-negocio-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]