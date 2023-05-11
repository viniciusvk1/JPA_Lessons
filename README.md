<h1><b>JPALessons 1.0</b></h1>

This is a simple Java application that demonstrates the usage of Java Persistence API (JPA) to interact with a database. It uses Hibernate as the JPA provider and MySQL as the database.

<h2></b>Prerequisites</h2></b>
Before running this application, make sure you have the following installed:

* Java Development Kit (JDK) 17 or later
* Maven
* XAMPP (or similar software) to create an Apache web server and MySQL database, with phpMyAdmin for database management.

<h2><b>Configuration</h2></b>

1. Clone the repository to your local machine.

2. Start the XAMPP control panel and start the Apache and MySQL services.

3. Open a web browser and access http://localhost/phpmyadmin to open the phpMyAdmin interface.

4. Create a new database named exemple-jpa in phpMyAdmin.

5. Open the persistence.xml file located in the src/main/resources/META-INF directory.

6. Configure the database connection settings in the <properties> section according to your XAMPP setup (e.g., set the JDBC URL to jdbc:mysql://localhost:3306/exemple-jpa).

7. Build the project using Maven: mvn clean install

<h2><b>Running the Application</h2></b>

1. Run the main class Program located in the application package.

2. The application will create a connection to the database, create a table for the Person entity if it doesn't exist, and perform some CRUD operations.

3. The output will be displayed in the console, showing the created and retrieved Person objects.

<h2><b>Dependencies</h2></b>
This project uses the following dependencies:

* Hibernate Core 5.4.12.Final
* Hibernate EntityManager 5.4.12.Final
* MySQL Connector/J 8.0.19

These dependencies are managed automatically by Maven.

    Enjoy exploring JPA with this simple application!
