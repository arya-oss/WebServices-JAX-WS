## Web Service in JAX-WS

Java API for XML Web Services (JAX-WS) is a technology for building web services and clients that communicate using XML. JAX-WS allows developers to write message-oriented as well as Remote Procedure Call-oriented (RPC-oriented) web services.

In JAX-WS, a web service operation invocation is represented by an XML-based protocol, such as SOAP. The SOAP specification defines the envelope structure, encoding rules, and conventions for representing web service invocations and responses. These calls and responses are transmitted as SOAP messages (XML files) over HTTP.

Although SOAP messages are complex, the JAX-WS API hides this complexity from the application developer. On the server side, the developer specifies the web service operations by defining methods in an interface written in the Java programming language. The developer also codes one or more classes that implement those methods. Client programs are also easy to code. A client creates a proxy (a local object representing the service) and then simply invokes methods on the proxy. With JAX-WS, the developer does not generate or parse SOAP messages. It is the JAX-WS runtime system that converts the API calls and responses to and from SOAP messages.

With JAX-WS, clients and web services have a big advantage: the platform independence of the Java programming language. In addition, JAX-WS is not restrictive: A JAX-WS client can access a web service that is not running on the Java platform, and vice versa. This flexibility is possible because JAX-WS uses technologies defined by the W3C: HTTP, SOAP, and WSDL. WSDL specifies an XML format for describing a service as a set of endpoints operating on messages.

## About this application

This application has two parts-
1. Server Part [soapapp](/soapapp) is running over *Tomcat* or *Glassfish* Web Server.
2. Client Part [soapcli](/soapcli) is a command line interface.

This is a simple `CRUD` application with backend `MySQL`. MySQL database contains a
table `friends` with fields *id*, *name*, *rollno*, *email*, *phone*, *company*. This
application provides SOAP Web Service. For more information look at `UserService.wsdl` file.

### Prerequisite and Tools Used
1. Java 1.8
2. Tomcat Web Server
3. MySQL DB 5.6
4. IntelliJ IDEA ide
5. JAX-WS Runtim

### How To Setup Server
1. Import [soapapp](/soapapp) repository into any Java EE IDE with `Tomcat` Installed.
2. Import `src/main/resources/friends.sql` in any `mysql` database;
3. Change `mysql` configuration in `soapapp/src/main/resources/mysql.properties`.
4. Run `mvn clean package` through IDE or Command Line.
5. Run on Tomcat Server or `maven install` and copy `target/restapp.war` into `$TOMCAT/webapps/` directory.
6. Deploy *soapapp* through maven by this Command `mvn tomcat7:deploy` (for this tomcat server must be running)

Open `http://localhost:8080/soapapp/UserService` in your browser means service deployed successfully.

### Contribute
Please raise an issue or create `pull request` if found something wrong.
