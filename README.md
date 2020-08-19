# Spring Boot Multi-Module Maven Project

Create a multi-module Maven project with Spring Boot following Domain-Driven Methodology.

A multi-module project is built from a parent pom that manages a group of sub-modules. The parent pom is located in the project's root directory and must have the packaging of type pom.

The sub-modules are regular Maven projects that have packaging type different from pom, such as jar, war, ear. We have the option of running Maven build on separate module's pom file or the parent's pom file. By running the Maven build on parent's pom file, all sub-modules will be built.

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
