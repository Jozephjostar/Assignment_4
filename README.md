# Assignment 4 — SOLID Architecture & Advanced OOP (Java)

## Project Overview
This project is a refactored version of Assignment 3 and demonstrates the application of **SOLID principles**, **advanced OOP features**, and a **layered architecture** in Java.  
The chosen domain is **Music Library Management**, where different media types are managed through a clean, extensible API.

The project follows a strict multi-layer architecture:

---

## Learning Objectives
- Apply SOLID principles in a real Java project
- Use advanced Java features (Generics, Lambdas, Reflection)
- Design a clean layered architecture
- Improve code maintainability and extensibility
- Work with JDBC and relational databases

---

## Architecture Overview

### Layers
- **Controller**  
  Handles user interaction (CLI). Contains no business logic.

- **Service**  
  Contains business rules, validation, and exception handling.  
  Depends on repository interfaces (DIP).

- **Repository**  
  Handles database operations using JDBC.  
  No business logic.

- **Database**  
  PostgreSQL relational database with foreign keys.

---

## 🧩 SOLID Principles Application

### 1. Single Responsibility Principle (SRP)
- Each class has one responsibility:
  - Service → business logic
  - Repository → data access
  - Controller → user interaction

### 2. Open–Closed Principle (OCP)
- Abstract base class `MediaContentBase` allows adding new media types (e.g. Podcast, Audiobook) without modifying existing code.

### 3. Liskov Substitution Principle (LSP)
- Subclasses (`Song`, `Podcast`) can be used wherever `MediaContentBase` is expected without breaking functionality.

### 4. Interface Segregation Principle (ISP)
- Small, focused interfaces such as:
  - `CrudRepository<T>`
  - `Validatable<T>`

### 5. Dependency Inversion Principle (DIP)
- Service layer depends on repository interfaces, not concrete implementations.
- Dependencies are injected via constructors.

---

## Core OOP Design

### Abstract Base Class
`MediaContentBase`
- Fields: `id`, `name`
- Abstract methods: `getDuration()`, `getType()`
- Concrete method: `basicInfo()`
- Fully encapsulated with getters/setters

### Subclasses
- `Song`
- `Podcast`

### Composition
- `Song → Category`
- Represented in both Java objects and database (foreign key)

---

## Advanced Java Features

### Generics
- Generic CRUD interface:
```java
CrudRepository<T>
