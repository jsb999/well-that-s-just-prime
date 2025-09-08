# Well That's Just Prime (Java) - Project Documentation

## Overview
This is a Java Gradle project implementing a prime factorization algorithm lab assignment. The application demonstrates number theory concepts including prime factorization, prime number detection, and composite number identification.

**Current State**: Fully functional and ready to run

## Recent Changes (Import Setup - Sept 8, 2025)
- Successfully imported from GitHub and set up in Replit environment
- Verified Java 21+ toolchain compatibility (running on Java 22.3 with GraalVM)
- Set up Gradle build system and verified all dependencies
- Configured console workflow for running the Java application
- Verified existing implementation works correctly with all test cases passing

## Project Architecture

### Language & Build System
- **Language**: Java 21+ (running on Java 22.3 GraalVM)
- **Build System**: Gradle 8.10.2
- **Testing**: JUnit Jupiter 5.10.3
- **Dependencies**: Guava 33.2.1-jre

### Project Structure
```
app/
├── src/main/java/org/example/
│   ├── App.java           # Main driver program with test cases
│   └── Factorizer.java    # Core implementation class
└── src/test/java/org/example/
    └── FactorizerTest.java # Unit tests

gradle/                    # Gradle wrapper and version catalog
build.gradle              # Build configuration
settings.gradle           # Multi-project settings
```

### Core Components
- **Factorizer Class**: Implements prime factorization algorithms
  - `primeFactors(int)`: Returns list of factors for a given number
  - `isPrime(int)`: Determines if a number is prime
  - `isComposite(int)`: Determines if a number is composite
- **App Class**: Driver program demonstrating the functionality
- **Console Output**: Shows factorization results and prime/composite tests

### Workflow Configuration
- **Name**: Java App
- **Command**: `./gradlew run --quiet --console=plain`  
- **Output Type**: Console (shows application results)

## User Preferences
- Standard Java conventions followed
- Gradle build automation preferred
- Console-based application (no web frontend)

## Development Commands
- Build: `./gradlew build`
- Test: `./gradlew test` 
- Run: `./gradlew run --quiet --console=plain`