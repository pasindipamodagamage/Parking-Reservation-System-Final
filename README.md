---

# 🚗 Parking Reservation System (PRS)

A **cloud-native microservices-based backend system** built to streamline modern urban parking with real-time space management, vehicle registration, user control, and secure payment simulation.

---

## 📘 Overview

Parking in urban environments is a growing challenge due to increased traffic and limited space. The **Parking Reservation System (PRS)** is developed to tackle these issues by providing:

* 🔍 **Smart parking search & reservations**
* 🚙 **Vehicle registration & linking**
* 👤 **User management & authentication**
* 💳 **Simulated payment processing**
* 📊 **Service discovery and central configuration**

Designed with scalability, modularity, and real-time communication in mind using **Spring Boot Microservices**.

---

## 🏗️ System Architecture

| Microservice        | Responsibility                                           |
| ------------------- | -------------------------------------------------------- |
| **Eureka Server**   | Service registration & discovery                         |
| **Config Server**   | Centralized configuration management                     |
| **API Gateway**     | Entry point and request routing                          |
| **User Service**    | Handles user login, registration, and profile management |
| **Vehicle Service** | Registers vehicles and links them to users               |
| **Parking Service** | Manages parking space availability & reservations        |
| **Payment Service** | Simulates and processes payments                         |

---

## 🛠️ Tech Stack

* **Spring Boot** – Microservice development
* **Spring Cloud** – Eureka, Config Server, API Gateway
* **Spring Web & Spring Data JPA** – REST APIs & data persistence
* **MySQL** – Relational database for each service
* **Postman** – API testing and validation
* **Git & GitHub** – Version control and collaboration
* **RestTemplate** – Synchronous inter-service communication

---

## 🚀 Getting Started

Follow these steps to spin up your Parking Reservation System locally:

1. ✅ **Start Eureka Server** at `http://localhost:8761`
2. ✅ **Start Config Server**
3. ✅ Start the services **in this order**:

  * API Gateway
  * User Service
  * Vehicle Service
  * Parking Service
  * Payment Service
4. 🔁 Access all APIs through **API Gateway**
5. 👀 Confirm registration in the **Eureka Dashboard**

---

## 📁 Project Structure

```bash
Parking-Reservation-System-Final/
├── api-gateway/           # Gateway service
├── config-server/         # Central config server
├── eureka-server/         # Service discovery
├── user-service/          # User microservice
├── vehicle-service/       # Vehicle microservice
├── parking-service/       # Parking spot service
├── payment-service/       # Payment microservice
└── docs/
    ├── JSON/
    │   └── SPMS Testing.postman_collection.json
    └── screenShots/
        └── eureka_Dashboard.png
```

---

## 🧪 Postman API Testing

* 📥 Import this file into Postman:
  [`SPMS Testing.postman_collection.json`](./docs/JSON/SPMS%20Testing.postman_collection.json)

* 🔄 Test all CRUD operations for each microservice

* ❌ Validate error handling and edge cases

* 🔗 Ensure smooth inter-service communication

---

## 📸 Eureka Dashboard

All microservices should register successfully under the Eureka Dashboard:

![Eureka Dashboard](./docs/screenShots/eureka_Dashboard.png)

---

## ✅ Project Completion Checklist

* [x] All microservices built using Spring Boot
* [x] Config and Discovery services configured
* [x] API Gateway functioning as entry point
* [x] MySQL integration for each service
* [x] Postman collection included
* [x] Eureka dashboard screenshot provided
* [x] GitHub repo structured and documented

---

## 👨‍💻 Author

**Pasindi Pamoda Gamage**
🎓 Undergraduate in Software Engineering
📁 GitHub: [@pasindipamodagamage](https://github.com/pasindipamodagamage)
🔗 Project Repo: [Parking-Reservation-System-Final](https://github.com/pasindipamodagamage/Parking-Reservation-System-Final.git)

---