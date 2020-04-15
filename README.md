### Spring Boot with WebSockets

Introduction
-------------
- Spring Boot app starts up and sends message via websocket to all subscribed clients
- The code is intended to show how to create Spring Boot application with websockets support and enable realtime server-to-client communication

Prerequisites 
-------------
- Technologies used: Java 1.8, Spring Boot 2.3.0, Maven 3.6.0

Install and Run
-------------
- Run `mvn clean install` to build a jar file
- In the command line run `java -jar springboot-websockets.jar`
- Or use your favorite IDE and run the app from main class `WebsocketsApplication`

Result
-------------
If everything was installed and run properly you should see the following:

`# -> Sending message -> 'Hello from server. Time: 1586941759126' to -> /demo-endpoint`

`# -> Sending message -> 'Hello from server. Time: 1586941761125' to -> /demo-endpoint`

`# -> Sending message -> 'Hello from server. Time: 1586941763126' to -> /demo-endpoint`

Let us know in the comments below if that’s not what you see, we’ll be happy to help and troubleshoot.

Resources
-------------
[Spring: Websocket](https://docs.spring.io/spring-framework/docs/5.0.0.BUILD-SNAPSHOT/spring-framework-reference/html/websocket.html)

Community
-------------
Read step-by-step guide on how to create Spring Boot server with websockets support on [Oril Website](https://oril.co/blog/spring-boot-websockets-angular-5/)

Please send us your suggestions on how we make this code even more useful for the development community or contribute to this repo!

Check out our [blog](http://www.oril.co/blog) with more articles!