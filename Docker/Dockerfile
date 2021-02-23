FROM adoptopenjdk/openjdk11:aarch64-centos-jdk-11.0.8_10

MAINTAINER test <test@qq.com>

VOLUME /tmp

EXPOSE 8080

ADD demo.jar demo.jar

ENTRYPOINT ["java","-jar","demo.jar"]
