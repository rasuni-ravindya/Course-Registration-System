# Course Registration System

## Overview
This is a Java-based Course Registration System that allows students to enroll in courses. The system connects to a MySQL database to manage data and includes a graphical user interface for ease of use.

## Features
- Student course enrollment
- Adding students
- Adding courses
- Viewing current enrollments in a table
- Loading student and course data dynamically from the database

## Technologies Used
- Java (Swing for GUI)
- MySQL Database
- JDBC for database connectivity
- Git for version control

## Setup Instructions

### Prerequisites
- Java JDK 8 or higher installed
- MySQL Server installed and running
- MySQL Workbench (optional, but recommended)
- Git installed

### Database Setup
1. Create the database schema by importing the provided MySQL dump file:
   - Open MySQL Workbench.
   - Go to **Server > Data Import**.
   - Select **Import from Self-Contained File** and browse to the `crs_dump2.sql` file.
   - Choose **Default Target Schema** or create a new schema named `crsystem`.
   - Click **Start Import**.
2. Verify that the tables and sample data have been imported successfully.

### Project Setup
1. Clone the Git repository:
   ```bash
   git clone https://github.com/rasuni-ravindya/Course-Registration-System.git
