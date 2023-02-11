FROM openjdk:17
EXPOSE 8080
ADD target/g.jar g.jar
ENTRYPOINT ["java","-jar","/g.jar"]