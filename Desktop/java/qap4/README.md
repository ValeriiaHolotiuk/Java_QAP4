README - QAP 4
Valeriia Holotiuk


What the project does

The app uses a simple console menu to:
- Save a Drug object to a file (drugs.txt)
- Read and display all drugs from that file
- Save a Patient object to a PostgreSQL database
- Read and display all patients from the database

The data is handled using two entity classes: Drug and Patient.

Technologies used

- Java (no frameworks)
- JDBC for database access
- PostgreSQL (local setup via pgAdmin)
- File I/O using BufferedWriter and BufferedReader

📁 Project structure

qap4/
├── Drug.java
├── Patient.java
├── FileHandler.java
├── DatabaseHandler.java
├── Main.java
├── drugs.txt
├── create_patient_table.sql
├── lib/
│   └── postgresql-42.7.3.jar
├── bin/
│   └── .class files

 Screenshots

Saving patient to DB:
Patient saved to DB.

Reading patients:
201 | Alice | Smith | 1992-03-15

 Saving drug to file:
Drug saved to file.

Reading drugs:
101,Ibuprofen,10.5,200mg

![Screenshot](<Screenshot 2025-07-20 at 9.08.50 AM.png>)



Resources I used:
- My course materials and lecture slides
- Udemy 
- PostgreSQL documentation
- A few YouTube videos on how to use java.sql.Date
- AI to structure READMe file

Challenges:
- macOS blocking the JDBC JAR download
- Casting string to Date for the PostgreSQL dob column
- Making sure the file path and classpath were correct during compile/run

Notes

- The drugs.txt file is auto-generated the first time you save a drug.
- PostgreSQL must be running locally and contain the patient table defined in the included .sql script.

How to run it

javac -cp ".:lib/postgresql-42.7.3.jar" *.java
java -cp ".:lib/postgresql-42.7.3.jar" Main

 
Assessment  Questions
1. How many hours did it take you to complete this assessment?
Around 6 hours total. Roughly 1.5 hours went into file I/O (drug class), 2 hours for JDBC and PostgreSQL connection (patient class), and about an hour for testing/debugging and finalizing everything.
2. What online resources did you use?
Stack Overflow for JDBC-related errors, PostgreSQL documentation for table creation and data types, YouTube for a quick PostgreSQL-Java connection walkthrough, and class lectures.
3. Did you get help from any classmates?
No
4. Did you ask for help from an instructor?
No
5. Rate the difficulty of each problem and your confidence in solving similar problems in the future.
File I/O was easy (2/5). JDBC and PostgreSQL setup was medium (4/5) due to classpath and datatype issues. I’m confident I could do something similar faster now.
