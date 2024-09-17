# Voting Management System

This **Voting Management System** is a simple desktop application developed using **Java AWT**, **Swing**, **JDBC** for database connectivity, and **MySQL** for data storage. It simulates a basic voting system where users can cast votes for candidates, and administrators can manage the voting process.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)

## Features

- **Voter Registration**: Voters can register with their details and receive a unique voter ID.
- **Login Authentication**: Voters and administrators can log in with their credentials.
- **Vote Casting**: Registered voters can cast their vote for a candidate.
- **Results Display**: View election results once the voting is completed.
- **Security**: Prevents duplicate voting and unauthorized access.

## Technologies Used

- **Java AWT and Swing**: For creating the graphical user interface (GUI).
- **JDBC (Java Database Connectivity)**: For connecting the application to the MySQL database.
- **MySQL**: For storing voter and candidate data, and managing voting records.

## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK)** installed.
- **MySQL** installed and running.
- A MySQL client or command line to create and manage the database.

### Steps

1. **Clone the repository:**

    ```bash
    git clone https://github.com/jainam-04/Voting-System.git
    ```

2. **Set up the MySQL database:**

    - Create a new database in MySQL:

      ```sql
      CREATE DATABASE voting_system;
      ```

    - Use the following schema to create the necessary tables for the system:
  
      ```sql
      USE voting_system;

      CREATE TABLE voter_login (
          voter_id VARCHAR(45) PRIMARY KEY NOT NULL,
          password VARCHAR(45) NOT NULL
      );

      CREATE TABLE voter_registration_1 (
          form_no INT PRIMARY KEY NOT NULL,
          name VARCHAR(45) NOT NULL,
          email_id VARCHAR(45) NOT NULL,
          mobile_no VARCHAR(45) NOT NULL,
          date_of_birth VARCHAR(45) NOT NULL,
          gender VARCHAR(45) NOT NULL,
          age INT NOT NULL,
          aadhar_no VARCHAR(45) PRIMARY KEY NOT NULL
      );

      CREATE TABLE voter_registration_2 (
          form_no INT PRIMARY KEY NOT NULL
          address VARCHAR(45) NOT NULL,
          city VARCHAR(45) NOT NULL,
          state VARCHAR(45) NOT NULL,
          pin_code INT NOT NULL,
          education VARCHAR(45) NOT NULL,
          married_status VARCHAR(45) NOT NULL,
          voter_id VARCHAR(45) PRIMARY KEY NOT NULL,
          password VARCHAR(45) NOT NULL,
          religion VARCHAR(45) NOT NULL
      );

      CREATE TABLE voting_panel (
          name VARCHAR(45) NOT NULL,
          email VARCHAR(45) NOT NULL,
          vote VARCHAR(45) NOT NULL,
          voter_id VARCHAR(45) PRIMARY KEY NOT NULL
      );

      CREATE TABLE voting_results (
          vote VARCHAR(50) PRIMARY KEY NOT NULL,
          vote_count INT NOT NULL,
          show_results VARCHAR(45) NOT NULL
      );
      ```
  3. **Configure database connection:**

    In your Java project, update the **JDBC** connection settings in your code to connect to the MySQL database.

    ```java
    String url = "jdbc:mysql://localhost:3306/voting_system";
    String username = "your_mysql_username";
    String password = "your_mysql_password";
    ```

4. **Compile and run the project:**

    Use your IDE (like Eclipse or IntelliJ IDEA) or the terminal to compile and run the project.

    ```bash
    javac -cp ".:mysql-connector-java-8.0.XX.jar" VotingSystem.java
    java -cp ".:mysql-connector-java-8.0.XX.jar" VotingSystem
    ```

## Usage

1. **Voter Registration**: New voters can register by providing their personal details.
2. **Login**: Voters and administrators log in with their credentials to access their respective panels.
3. **Cast Vote**: Registered voters can vote for a candidate only once.
4. **View Results**: After voting ends, both voters and admins can view the election results.

## Screenshots

1. **Login Screen**

  ![Login](https://github.com/user-attachments/assets/3ebdc496-8b8b-4d32-affc-56ef769b6506)

2. **Main Screen**

  ![Welcome](https://github.com/user-attachments/assets/7e57725a-7474-4c2d-80fe-bd07651396c0)

3. **Voting Results**

  ![Results](https://github.com/user-attachments/assets/468e744e-8bce-42ce-a436-580b0133042a)

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any bugs or features.
