FROM openjdk:11-jre-slim
COPY build/libs/my-controller.jar /app/my-controller.jar
ENTRYPOINT ["java", "-jar", "/app/my-controller.jar"]
