# WordsPublisher
Small Project to implement the concept about Spring Cloud Streams using RabbitMQ

During the training, we have used the Spring cloud stream to publish/subscribe message between the microservices. Spring Cloud Streams is a framework for building event-driven microservice architectures in java. It provides a simple programming model for building event-driven microservices using message-driven channels. And in our case, we choose RabbitMQ to handle theses messages.
RabbitMQ is an open-source message broker software that implements the Advanced Message Queing Protocol (AMQP). It is used to decouple applications and provide a communcation mechanism for different parts of application to exchange data as message.

# Requirements
* Java 8
* Maven 3.10.1
* Spring boot 2.2.7
* Spring cloud

# Installation
You need run first the Configuration Server. That will allow the microserveces have access to configuration files. Finally you can run the applications Processor, publisher and Subscriber.

# How to use
Send a HTTP message via "/publish" url and check in the subscriber log your message.
