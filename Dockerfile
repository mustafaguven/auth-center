FROM openjdk:jre-alpine
WORKDIR /workspace
COPY /target/auth-center-1.0.0.jar /workspace/auth-center.jar
COPY /starter.sh /workspace/starter.sh
EXPOSE 8081
RUN apk add curl
RUN apk add --update --no-cache netcat-openbsd
RUN ["chmod", "+x", "/workspace/starter.sh"]
ENTRYPOINT ["sh","/workspace/starter.sh"]