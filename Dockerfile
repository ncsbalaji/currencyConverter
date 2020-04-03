FROM openjdk:8
ADD target/currencyConverter.jar currencyConverter.jar
ADD target/DockerJavaAgent DockerJavaAgent
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "currencyConverter.jar"]