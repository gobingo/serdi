# serdi
Service discovery for microservice based architectures via Spring Cloud + Netflix Eureka

To build, pull repo and run ./gradlew clean build

>*serdi-server*
>> 
* To start, run java -jar serdi-server-0.0.1-SNAPSHOT.jar
* This will start a microservice running Eureka for service registry and discovery
* View Eureka console via http://localhost:8761/ to see list of services registered. Corresponding server API to get list of services registered for discovery - GET http://localhost:8761/eureka/apps

>*serdi-client*
>> 
* To start, run java -jar serdi-client-0.0.1-SNAPSHOT.jar --server.port=8991
* This will start a restful client microservice running on port 8991, automatically registered on serdi-server for discovery by other apps




