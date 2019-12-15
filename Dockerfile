FROM openjdk
COPY * /code/
WORKDIR /code
RUN javac Main.java
CMD java Main 
