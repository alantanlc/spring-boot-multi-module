# Spring Boot Multi-Module Maven Project

Create a multi-module Maven project with Spring Boot following Domain-Driven Methodology.

A multi-module project is built from a parent pom that manages a group of submodules. The parent pom is located in the project's root directory and must have the packaging of type pom.

The submodules are regular Maven projects that have packaging type different from pom, such as jar, war, ear. We have the option of running Maven build on separate module's pom file or the parent's pom file. By running the Maven build on parent's pom file, all submodules will be built.

### Submodules

This project contains 5 submodules namely:
1. Application
1. Controller
1. Domain
1. Service
1. Repository

More Details:
- Main class annotated with @SpringBootApplication resides in the Application submodule
- Controller classes that provide REST endpoints or similar stuffs reside in the Controller submodule. Data Transfer Objects (DTOs) formatted as JSON outputs that are exposed to the outside world from the REST endpoints reside in the Controller submodule as well.
- Aggregate, entities, value-objects live along with Service and Repository Interfaces reside in the Domain submodule
- Service implementations reside in the Service submodule
- Repository implementations reside in the Repository submodule

### Logging

[Simple Logging Facade For Java (SLF4J)](http://slf4j.org) is used for logging in this project. SLF4J serves as a simple facade or abstraction for various logging frameworks (e.g. java.util.logging, logback, log4j) allowing the end user to plug in the desired logging framework at _deployment_ time.

Before you start using SLF4J, we highly recommend that you read the two-page [SLF4J user manual](http://www.slf4j.org/manual.html).

To perform logging, assign a class member variable `logger` to the Logger object returned by the LoggerFactory. You can then use `logger` inside any class or object methods. 
