FROM openjdk:8u322-jdk-oracle
COPY "./target/test-tecnica-publico-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8084
ENTRYPOINT ["java","-jar","/app.jar"]