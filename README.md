# 🍽️ Qeat – Food Management System

## 🚀 Overview

Qeat is a full-stack Food Management System built using **Spring Boot, PostgreSQL, and React**. It follows a layered architecture to manage food orders, users, and products efficiently with scalable and maintainable code.

---

## 🛠️ Tech Stack

### 🔹 Backend

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* PostgreSQL

### 🔹 Frontend *(Upcoming)*

* React.js

### 🔹 Tools

* Postman (API Testing)
* IntelliJ IDEA (Development)

---

## 📂 Project Structure

```
src/main/java/com/jsp/
│
├── controller      → REST Controllers
├── service         → Business Logic
├── repository      → JPA Repositories
├── entity          → Database Entities
├── exception       → Global Exception Handling
└── QeatApplication → Main Class
```

---

## ⚙️ Features

* ✅ RESTful API development
* ✅ Layered architecture (Controller, Service, Repository)
* ✅ CRUD operations
* ✅ PostgreSQL database integration
* ✅ Exception handling
* ✅ Scalable backend design
* 🔄 React frontend integration (in progress)

---

## 🔗 API Testing

All APIs are tested using **Postman**.

Example endpoints:

```
GET    /products
POST   /products
PUT    /products/{id}
DELETE /products/{id}
```

---

## 🧑‍💻 Setup & Run

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/qeats.git
cd qeats
```

### 2️⃣ Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=postgres
spring.datasource.password=your_password
```

### 3️⃣ Run Application

```bash
mvn spring-boot:run
```

---

## 🌐 Future Enhancements

* 🔹 React frontend integration
* 🔹 Authentication & Authorization (JWT)
* 🔹 Order tracking system
* 🔹 Payment integration
* 🔹 UI improvements

---

## 🤝 Contribution

Feel free to fork this repo and contribute 🚀

---

## 📌 Author

**Anjali Yadav**

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!

---

