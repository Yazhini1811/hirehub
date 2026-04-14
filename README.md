# 🚀 HireHub – Job Portal Application

A full-stack Job Portal Application built using Spring Boot and React.js that enables users to search, apply, and manage job opportunities efficiently.

---

## 📌 Project Overview

HireHub is designed to simplify the job search and hiring process.

- Job seekers can explore and apply for jobs  
- Recruiters can post and manage job listings  
- Secure authentication with role-based access  

---

## ✨ Features

- Search and filter job listings  
- Apply for jobs  
- Role-based authentication (Admin / User)  
- Resume upload functionality  
- Email notification system  
- REST API architecture  
- Database management using JPA  

---

## 🛠️ Tech Stack

Backend:
- Java  
- Spring Boot  
- Spring Security  
- Spring Data JPA  
- MySQL  

Frontend:
- React.js  
- HTML, CSS, JavaScript  

---

## 📁 Project Structure

hirehub/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 └── HirehubApplication.java

---

## 🔗 API Endpoints

Job APIs:
- GET /jobs → Get all jobs  
- POST /jobs → Add new job  

User APIs:
- GET /users → Get all users  
- POST /users → Add new user  

---

## ⚙️ Setup Instructions

1. Clone the repository  
git clone https://github.com/yourusername/hirehub.git  

2. Navigate to project  
cd hirehub  

3. Configure database in application.properties  

spring.datasource.url=jdbc:mysql://localhost:3306/hirehub  
spring.datasource.username=root  
spring.datasource.password=yourpassword  

4. Run the project  
mvn spring-boot:run  

---

## 🌐 Run Application

http://localhost:8081

---

## 🧠 Key Concepts

- REST API Development  
- Layered Architecture  
- Dependency Injection  
- JPA & Hibernate  
- Authentication & Authorization  

---

## 🎯 Future Improvements

- Real-time notifications  
- Admin dashboard  
- Cloud deployment  

---

## 👩‍💻 Author

Yazhini  

---

## 💡 Interview Line

This project demonstrates my ability to build scalable backend systems using Spring Boot, implement REST APIs, and design clean architecture.
