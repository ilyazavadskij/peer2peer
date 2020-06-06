# peer2peer Chat
A simple peer-to-peer chat.

## Requirements:
1. Maven

## Build and Run: 
1. `git clone https://github.com/ilyazavadskij/peer2peer.git`
2. `cd peer2peer/peer2peer`
3. `mvn package`
4. `java -jar target/peer2peer-jar-with-dependencies.jar`

## Usage:
1. Run server on the specified port
2. Run client connecting to the specified socket (host, port)
3. Done -- chat freely

## Docker image:

Docker image is also available. Note that it is not cross-platform because it demands bindings to the host GUI system. We present variant for UNIX systems:

```bash
$ # To init GUI you should invoke firstly
$ xhost +"local:docker@"
$ # Run server on 9090 port
$ docker run --rm -it -e DISPLAY=$DISPLAY -v /tmp/.X11-unix:/tmp/.X11-unix -p 9090:9090 bashspbu/bz_chat:latest
$ # Run client
$ # Client should connect to address displayed by `sudo ip addr show docker0` (usually it is 172.17.0.1) and 9090 port
$ docker run --rm -it -e DISPLAY=$DISPLAY -v /tmp/.X11-unix:/tmp/.X11-unix              bashspbu/bz_chat:latest
```

## Developed by:
- Башкиров Александр (https://github.com/bash-spbu)
- Завадский Илья (https://github.com/ilyazavadskij)
