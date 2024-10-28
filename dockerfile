FROM openjdk:17-oracle
COPY ./target/author-service.jar author-service.jar
CMD ["java","-jar","author-service.jar"]