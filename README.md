## Student Management System (Java + MySQL)

  This is a Java-based Student Management System that allows users to register, log in, update their information, and delete their accounts. It includes a student homepage and uses **SHA-256 hashing** for secure password storage. All data is stored in a **MySQL database**, and unit test packages are included to validate system functionality.

## ✅ Features

  - 📝 **Register Page** – Allows new users to register securely. 
  - 🔐 **Login Page** – Authenticates users using hashed passwords.
  - 🏠 **Home Page** – Displays student information after login.
  - ✏️ **Update Page** – Users can update their information.
  - ❌ **Delete Page** – Users can delete their accounts permanently.
  - 🔒 **Secure Passwords** – SHA-256 used to hash passwords before storing in the database.
  - 🧪 **Unit Testing** – JUnit test packages added to validate core functionalities.

## 🛠️ Technologies Used

  - **Java** (Swing for GUI)
  - **MySQL** (Database)
  - **JDBC** (Java Database Connectivity)
  - **SHA-256** (for password hashing)
  - **JUnit** (for testing)

## 🗂️ Project Structure
  ```
  StudentManagementSystem/
  │
  ├── src/
  │ ├── Register.java
  │ ├── Login.java
  │ ├── Update.java
  │ ├── Delete.java
  │ ├── HomePage.java
  │ ├── DBConnection.java
  │ └── HashUtil.java
  │
  ├── test/
  │ ├── RegisterTest.java
  │ ├── LoginTest.java
  │ └── DBConnectionTest.java
  │
  ├── database/
  │ └── student_db.sql
  │
  └── README.md
   ```

## 🔐 Password Hashing

Passwords are never stored in plain text. The application uses **SHA-256** to hash passwords:

```java
MessageDigest md = MessageDigest.getInstance("SHA-256");
byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
```

## 🗄️ Database Schema

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fname VARCHAR(100),
    lname VARCHAR(100),
    age int (3),
    phone VARCHAR(20),
    address VARCHAR(100),
    gender VARCHAR(10),
    username VARCHAR(100) UNIQUE,
    password VARCHAR(256)
);
```

## 🧪 Testing

The project includes a test package (`/test`) to ensure key components work correctly: 

  - `RegisterTest.java` – Tests user registration logic.
  - `LoginTest.java` – Validates login and password matching.
  - `DBConnectionTest.java` – Ensures the database connection is successful.

  > **Testing framework used:** JUnit

## 🧰 Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/student-management-system.git
2. **Set up the MySQL database** using the provided `student_db.sql` file or by running the SQL in the *Database Schema* section.
3. **Update database credentials** in `DBConnection.java`:
    ```java
    String url = "jdbc:mysql://localhost:3306/student_db";
    String user = "your_mysql_user";
    String password = "your_mysql_password";
    ```
4. **Build and run** the application using your IDE (e.g., IntelliJ, Eclipse, NetBeans).
5. **Run tests** using JUnit through your IDE or a test runner.
