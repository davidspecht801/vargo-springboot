FROM tomcat:8.5-jdk15-openjdk-oracle
LABEL maintainer="david.specht@runic.dev"

COPY Vargo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080


ENTRYPOINT ["catalina.sh", "run"]