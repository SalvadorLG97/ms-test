FROM openjdk:8u322-jdk-oracle
COPY "./target/test-tecnica-persistencia-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]