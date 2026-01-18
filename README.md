# SpringBootBasics

A small Spring Boot example project that demonstrates basic application structure and how to build and run a Spring Boot application.

## Contents
- Brief project description
- Prerequisites
- How to build & run
- How to run tests
- How to contribute

## Prerequisites
- Java 11 or later (set JAVA_HOME)
- Maven or Gradle (or use the included wrapper: `./mvnw` or `./gradlew` if available)
- Git

## Build & Run (Maven)
1. Build the project:

   mvn clean package

   (If the project includes the Maven wrapper use `./mvnw clean package`)

2. Run the generated jar:

   java -jar target/*.jar

3. Alternatively run directly with Spring Boot plugin:

   mvn spring-boot:run

## Build & Run (Gradle)
- Build and run with Gradle:

  ./gradlew bootRun

  or

  gradle bootRun

## Run tests
- With Maven:

  mvn test

- With Gradle:

  ./gradlew test

## Common configuration
- Application properties are under `src/main/resources/application.properties` (or `application.yml`).
- Default server port can be changed with `server.port` in the properties file.

## Useful tips
- If you want to create an executable jar for a specific profile: `mvn -Dspring.profiles.active=dev package` and then run the jar.
- Use `./mvnw` / `./gradlew` when available to ensure consistent build environment across machines.

## Contributing
Contributions are welcome. Please open an issue first to discuss major changes. For small changes, open a pull request and describe what you changed and why.

## License
No license specified. If you want to add a license, create a `LICENSE` file in the repository (for example MIT, Apache-2.0, etc.).
