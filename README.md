# Student Result Processing System

A Java-based desktop application built using **Core Java, Object-Oriented Programming (OOP), Java Swing, Collections, and Exception Handling**.

The application allows users to enter student details, add subject-wise marks, and automatically calculate the student's total marks, percentage, grade, and pass/fail status.

## Features

- Enter student name and university roll number.
- Add multiple subjects and their marks.
- Validate marks within the range of 0–100.
- Calculate total marks and percentage automatically.
- Assign grades based on the percentage.
- Determine pass/fail status based on subject-wise marks.
- Handle invalid inputs using custom exceptions.
- User-friendly graphical interface built with Java Swing.

## Grading System

| Percentage | Grade |
| ---------- | ----- |
| 90–100%    | A+    |
| 80–89%     | A     |
| 70–79%     | B     |
| 60–69%     | C     |
| 50–59%     | D     |
| Below 50%  | F     |

**Passing Criteria:** A student must score at least 40 marks in every subject to pass.

## Technologies Used

- Java 17
- Java Swing
- Object-Oriented Programming
- ArrayList (Java Collections Framework)
- Exception Handling
- Apache Maven
- Git and GitHub
- Visual Studio Code

## Project Structure

```text
Student-Result-Processing-System/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── studentresultsystem/
│   │           │
│   │           ├── Main.java
│   │           │
│   │           ├── model/
│   │           │   ├── Student.java
│   │           │   └── Result.java
│   │           │
│   │           ├── service/
│   │           │   └── ResultService.java
│   │           │
│   │           ├── exception/
│   │           │   ├── InvalidMarksException.java
│   │           │   └── InvalidStudentDataException.java
│   │           │
│   │           └── ui/
│   │               └── MainFrame.java
│
├── pom.xml
├── .gitignore
└── README.md
```

## How to Run the Project

### Prerequisites

Make sure you have installed:

- Java JDK 17 or later
- Apache Maven
- Git (optional)

### 1. Clone the Repository

```bash
git clone https://github.com/shreybaba/Student-Result-Processing-System.git
```

### 2. Navigate to the Project Directory

```bash
cd Student-Result-Processing-System
```

### 3. Compile the Project

```bash
mvn clean compile
```

### 4. Run the Application

```bash
java -cp target/classes studentresultsystem.Main
```

The Student Result Processing System GUI will open.

## Application Workflow

1. Enter the student's name and roll number.
2. Enter a subject name and its marks.
3. Click **Add Subject**.
4. Repeat the process for all subjects.
5. Click **Calculate Result**.
6. View the total marks, percentage, grade, and pass/fail status.

## Concepts Implemented

This project demonstrates the practical implementation of:

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- ArrayList
- Methods and Object Interaction
- Conditional Statements and Loops
- Custom Exception Handling
- Java Swing GUI Development
- Maven Project Management

## Future Improvements

- Store student records using a database.
- Add the ability to search and retrieve previous results.
- Improve the graphical interface.
- Generate downloadable student result reports.
- Add an administrative module.

## Author

**Shreyansh Pandey**

GitHub: [@shreybaba](https://github.com/shreybaba)

Project Repository: [Student Result Processing System](https://github.com/shreybaba/Student-Result-Processing-System)

---

_Developed as a Java academic project to demonstrate Core Java, OOP principles, collections, exception handling, and GUI development._
