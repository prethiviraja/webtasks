FROM  eclipse-temurin:17
COPY target/webtasks.jar webtasks.jar
CMD [ "java","-jar","webtasks.jar" ]

