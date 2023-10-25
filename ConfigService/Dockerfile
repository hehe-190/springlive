FROM openjdk:11
LABEL authors="zhangzhenhe"

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} configservice.jar

ENTRYPOINT ["java", "-jar", "/configservice.jar"]

EXPOSE 8051