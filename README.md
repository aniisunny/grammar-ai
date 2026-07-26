# Grammar AI

A production-oriented backend service for AI-powered grammar correction built with Java and Spring Boot.

The project focuses on building an extensible AI application using clean architecture, provider abstraction, and production-ready engineering practices rather than a simple wrapper around an LLM API.

> **Status:** 🚧 Under active development

---

## Overview

Grammar AI exposes REST APIs that accept English text and return structured grammar corrections with explanations and language insights.

The project is designed to support multiple AI providers behind a common abstraction, allowing the backend to switch providers without affecting the application layer.

Current development is focused on establishing a maintainable architecture before integrating external AI services.

---

## Planned Capabilities

- Grammar correction
- Grammar mistake explanations
- CEFR proficiency estimation
- Grammar quality scoring
- Practice sentence generation
- AI provider abstraction
- Request validation
- Structured error handling
- Observability and logging
- Containerized deployment

---

## Technology Stack

| Component | Technology |
|----------|------------|
| Language | Java 21 |
| Framework | Spring Boot 3 |
| Build Tool | Maven |
| API | REST |
| Validation | Jakarta Validation |
| Testing | JUnit 5 |
| Version Control | Git |

Future additions include PostgreSQL, Redis, Docker and OpenAI integration.

---

## Project Structure

```
src
├── main
│   ├── java
│   └── resources
└── test
```

The internal package structure will evolve following Clean Architecture principles.

---

## Running Locally

Clone the repository

```bash
git clone https://github.com/aniisunny/grammar-ai.git
```

Move into the project directory

```bash
cd grammar-ai
```

Start the application

```bash
mvn spring-boot:run
```

Health endpoint

```
GET http://localhost:8080/health
```

Expected response

```
Grammar AI is running 🚀
```

---

## Roadmap

- [x] Spring Boot project bootstrap
- [x] Health endpoint
- [ ] Project architecture
- [ ] AI client abstraction
- [ ] Mock AI provider
- [ ] Grammar correction service
- [ ] OpenAI integration
- [ ] Unit and integration testing
- [ ] Docker support
- [ ] Production deployment

---

## Version History

### v0.1.0

Initial project bootstrap.

- Spring Boot setup
- Java 21 configuration
- Maven build
- Health endpoint
- Git versioning

---

## Repository Goals

This repository is intended to demonstrate backend engineering practices including:

- Clean architecture
- SOLID principles
- Dependency inversion
- Extensible AI integrations
- Production-oriented REST API design
- Maintainable code organization

The implementation is intentionally incremental, with each milestone introducing a single architectural concern.

---

## Author

**Aniruddha M Agrawal**

- GitHub: https://github.com/aniisunny
- LinkedIn: https://www.linkedin.com/in/aniruddha-m-agrawal