FROM openjdk:8-alpine
ADD build/libs/docker-sum.jar .
ENTRYPOINT [ "java","-jar","docker-sum.jar"]