# Steps to Work with JDBC and MySQL

## 1. Install Driver Class

The driver class is provided by the database software vendor.
For MySQL, the driver class is:
com.mysql.cj.jdbc.Driver

## 2. Establish a Connection Between Java and Database

Use the DriverManager.getConnection() method to establish a connection.
The method requires three parameters:
Database URL (e.g., jdbc:mysql://localhost:3306/your_database)
Username (e.g., root)
Password (e.g., your database password)
Example:

```java
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
```

## 3. Working with SQL Queries

```java Query Types:
executeUpdate(): Used for non-select queries like INSERT, UPDATE, DELETE, or CREATE TABLE.(Return Int)
executeQuery(): Used for SELECT queries to retrieve data from the database.(Return Boolean)
execute(): Used for general-purpose query execution when you're unsure of the type (not commonly used).(Return Result Set)
```

## 4. Create Objects for Database Operations

```java Connection Object:

Establish a connection with the database.

Connection con = DriverManager.getConnection(url, username, password);
Statement Object:

Used to execute SQL queries.
```

`java Statement st = con.createStatement(); `

## 5. Execute SQL Queries

### Execute an Update Query (e.g., create a table):

````java st.executeUpdate(sql_query);
Example:


 ```java String sql_query = "CREATE TABLE example_table (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), age INT)";
st.executeUpdate(sql_query);
````

## 6. Close the Connection

### Always close the Statement and Connection objects after use:

```java
st.close();
con.close();
```

### try with resources
