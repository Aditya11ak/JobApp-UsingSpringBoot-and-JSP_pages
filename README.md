# JobApp-UsingSpringBoot-and-JSP_pages
Spring Boot project with JSP frontend integration to test backend development. Implemented pages like Add Job, View Job, Success, and View All Jobs using Spring Boot Web, Tomcat Jasper, JSTL, and Lombok. Showcases REST mapping, JSP rendering, and backend functionality with devtools support.


This is a **Spring Boot web application** built with JSP for the frontend.  
The project was created to test backend development and demonstrate basic page mappings using Spring Boot and JSP views.

---

## 🚀 Features
- Simple Spring Boot web application.
- JSP pages for frontend view rendering:
  - **add-job.jsp** → Page to add a new job.
  - **view.jsp** → Page to view a single job.
  - **success.jsp** → Page to display a success message.
  - **view-all-jobs.jsp** → Page to view a list of all jobs.
- Backend tested with controllers and model mapping.
- Uses embedded Tomcat server for easy running.

---

## 📂 Project Structure

src/
└── main/
├── java/com/example/demo/ # Java source code (controllers, models, services)
├── resources/
│ └── application.properties # Spring Boot config
└── webapp/WEB-INF/jsp/ # JSP views
├── add-job.jsp
├── view.jsp
├── success.jsp
└── view-all-jobs.jsp


---

## ⚙️ Dependencies

This project uses the following dependencies:

- **spring-boot-starter-web** → Provides Spring MVC and embedded Tomcat.
- **tomcat-jasper** → Required for JSP compilation in embedded Tomcat.
- **spring-boot-devtools** → Auto-restart and live reload during development.
- **lombok** → Reduces boilerplate code for models (getters, setters, etc.).
- **jakarta.servlet.jsp.jstl-api** & **jakarta.servlet.jsp.jstl** → JSTL library support for JSP.
- **spring-boot-starter-test** → Testing dependencies (JUnit, Mockito, etc.).

---
