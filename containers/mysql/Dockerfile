FROM mysql:latest

MAINTAINER David Specht <david.specht.801@runic.dev>

RUN apt-get update

ENV MYSQL_ROOT_PASSWORD=123456
#ENV MYSQL_DATABASE=test1

COPY ./init-database.sql /docker-entrypoint-initdb.d/

#CMD ["mysqld"]