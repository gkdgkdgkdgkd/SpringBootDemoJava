FROM openjdk:17.0.2-jdk

MAINTAINER test <test@qq.com>

VOLUME /tmp

EXPOSE 8080

ADD demo.jar demo.jar

ENTRYPOINT ["java","-jar","demo.jar"]