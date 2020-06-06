FROM  maven:3-openjdk-11
LABEL maintainer="bash.spbu@gmail.com"

RUN apt-get update \
 && apt-get install -y --no-install-recommends \
      xvfb \
      openjfx \
 && rm -rf /var/lib/apt/lists/*

ARG WORK_DIRECTORY=/home/peer2peer

WORKDIR $WORK_DIRECTORY

COPY src     $WORK_DIRECTORY/src
COPY pom.xml $WORK_DIRECTORY

RUN mvn package

ENTRYPOINT [ "java", "-jar", "./target/peer2peer-jar-with-dependencies.jar" ]

