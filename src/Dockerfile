FROM java:8
WORKDIR /var/app
COPY src/*.* /var/app
RUN javac *.java
CMD ["java", "Main"]