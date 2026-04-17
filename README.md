# Maven Java Quickstart Project

A simple Maven-based Java project with a basic application structure.

## Project Details

- **Group ID**: com.example
- **Artifact ID**: my-app
- **Version**: 1.0-SNAPSHOT

## Prerequisites

- Java 8 or later
- Maven 3.6 or later

## Quick Start

### Build the project

```bash
mvn clean compile
```

### Run tests

```bash
mvn test
```

### Run the application

```bash
mvn exec:java -Dexec.mainClass="com.example.App"
```

### Package the project

```bash
mvn package
```

## Project Structure

```
.
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           └── App.java
│   └── test/
│       └── java/
│           └── com/example/
│               └── AppTest.java
├── pom.xml
└── README.md
```

## Dependencies

The project uses JUnit 4 for testing. See `pom.xml` for the full list of dependencies.

## License

This is a quickstart template. Modify as needed for your project.
