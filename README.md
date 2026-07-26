# Grammar AI

> A production-oriented backend service for AI-powered grammar correction built with Java and Spring Boot.

Grammar AI is designed to provide AI-assisted grammar correction through a provider-agnostic architecture. The project emphasizes clean architecture, SOLID principles, and maintainable backend design while supporting multiple Large Language Model (LLM) providers through a common abstraction.

**Project Status:** 🚧 Under Active Development

---

## Features

### Implemented

- Spring Boot 3.x project setup
- Java 21
- Maven build configuration
- Health Check API
- Conventional Git workflow

### Planned

- AI-powered grammar correction
- Grammar mistake explanations
- Grammar quality scoring
- CEFR proficiency estimation
- Practice sentence generation
- AI provider abstraction
- OpenAI integration
- Mock AI provider for local development
- Request validation
- Global exception handling
- Structured logging
- Unit and integration testing
- Docker support
- PostgreSQL integration
- Redis caching
- CI/CD pipeline

---

## Design Goals

- Clean Architecture
- SOLID Principles
- Provider-independent AI integration
- Maintainable codebase
- Production-ready REST APIs
- Extensible application design
- High testability

---

## Technology Stack

| Component | Technology |
|-----------|------------|
| Language | Java 21 |
| Framework | Spring Boot 3 |
| Build Tool | Maven |
| API Style | REST |
| Validation | Jakarta Validation |
| Testing | JUnit 5 |
| Version Control | Git |

Planned additions include PostgreSQL, Redis, Docker, and OpenAI API integration.

---

## Architecture

```text
                    Client

                      │

               REST Controller

                      │

              Grammar Service

                      │

          ┌───────────┴───────────┐
          │                       │

    Prompt Builder           AI Client

                                  │

        ┌──────────────┬──────────────┐
        │              │              │

   Mock AI Client  OpenAI Client  Gemini Client
```

The application is designed around an abstraction layer that isolates AI providers from the business logic, allowing providers to be replaced without impacting the rest of the system.

---

## Project Structure

```text
grammar-ai
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
├── pom.xml
└── README.md
```

The internal package structure will evolve following Clean Architecture principles as new modules are introduced.

---

## Running the Application

Clone the repository:

```bash
git clone https://github.com/aniisunny/grammar-ai.git
```

Navigate to the project:

```bash
cd grammar-ai
```

Start the application:

```bash
mvn spring-boot:run
```

Verify the application is running:

```http
GET http://localhost:8080/health
```

Expected response:

```text
Grammar AI is running 🚀
```

---

## Development Roadmap

| Module | Status |
|---------|--------|
| Spring Boot Bootstrap | ✅ Completed |
| Health Check API | ✅ Completed |
| Project Architecture | 🚧 In Progress |
| AI Client Abstraction | ⏳ Planned |
| Mock AI Provider | ⏳ Planned |
| Grammar Correction API | ⏳ Planned |
| Prompt Builder | ⏳ Planned |
| Response Validation | ⏳ Planned |
| OpenAI Integration | ⏳ Planned |
| Testing | ⏳ Planned |
| Docker Support | ⏳ Planned |
| Production Deployment | ⏳ Planned |

---

## Version History

### v0.1.0

Initial project bootstrap.

- Spring Boot application setup
- Java 21 configuration
- Maven build configuration
- Health Check API
- Git repository initialization

---

## Engineering Principles

The project is being developed with the following engineering practices:

- Layered Architecture
- Dependency Injection
- Constructor-based wiring
- Interface-driven design
- Separation of Concerns
- Clean API contracts
- Extensible AI provider abstraction

---

## Contributing

Contributions, suggestions, and discussions are welcome.

Please open an issue before submitting significant changes.

---

## Author

**Aniruddha M Agrawal**

- GitHub: https://github.com/aniisunny
- LinkedIn: https://www.linkedin.com/in/aniruddha-m-agrawal

---

## License

This project is licensed under the MIT License.