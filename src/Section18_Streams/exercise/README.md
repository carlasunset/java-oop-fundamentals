# 📘 Employee Salary Analysis (Streams Exercise)

## 📌 Problem Description

In this exercise, we are given a CSV file containing employee data.
Each line of the file represents an employee with the following information:

- Name
- Email
- Salary

The goal is to read this data from a file and perform some operations using **Java Streams**.

---

## 🎯 Objectives

1. Display, in alphabetical order, the **emails of employees whose salary is greater than a value provided by the user**.
2. Calculate the **sum of salaries of employees whose name starts with the letter "M"**.

---

## 💡 Solution Overview

### 1️⃣ Reading the CSV file
- The file is read line by line using `BufferedReader`.
- Each line is split by commas.
- An `Employee` object is created for each line and added to a list.

---

### 2️⃣ Filtering and sorting employee emails
A stream pipeline is used to:
- **Filter** employees whose salary is greater than the value entered by the user.
- **Map** each employee to their email.
- **Sort** the emails in alphabetical order.
- **Collect** and display the results.

```java
.filter(employee -> employee.getSalary() > factor)
.map(Employee::getEmail)
.sorted()
````

---

### 3️⃣ Sum of salaries of employees whose name starts with "M"

Another stream pipeline is used to:

- Filter employees whose name starts with the letter "M".
- Extract their salaries.
- Sum all selected values.

```java
.filter(employee -> employee.getName().startsWith("M"))
.mapToDouble(Employee::getSalary)
.sum();
````
--- 

### 🧠 Concepts Practiced

- File reading with `BufferedReader`
- Object creation from CSV data
- Java Streams and pipelines
- `filter`, `map`, `sorted`, `mapToDouble`, and `sum`
- Lambda expressions and method references



