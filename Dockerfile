FROM java
ADD ./build/libs/my-ltc-app-*.jar /my-ltc-app.jar
CMD exec java -jar /my-ltc-app.jar
