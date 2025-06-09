package com.bootcamp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoPostgreSQLJDBC {
  
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/bootcamp_2504";
    String user = "postgres";
    String password = "admin1234";

    // create table
    String createTable = 
      "CREATE TABLE IF NOT EXISTS JDBC_POSTGRESQL_TABLE (id INT PRIMARY KEY, name VARCHAR(50))";

    // insert
    String insertData =
      "INSERT INTO JDBC_POSTGRESQL_TABLE (id, name) VALUES (2, 'Vincent')";

      // select
      String selectData = "SELECT * FROM JDBC_POSTGRESQL_TABLE";
      // update (similar to insert)
String updateData = "UPDATE JDBC_POSTGRESQL_TABLE SET name = 'Vincent Chan' WHERE id = 2";
      // delete (smiliar to insert)
      String deleteData = "DELETE FROM JDBC_POSTGRESQL_TABLE WHERE id = 2";

       try (
      Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
    ) {
      // Create table
      stmt.executeUpdate(createTable);

      // Insert data
      stmt.executeUpdate(insertData);

      // Select data
      ResultSet rs = stmt.executeQuery(selectData);
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        System.out.println("id: " + id + ", name: " + name);
      }

      // Update data
      stmt.executeUpdate(updateData);

      // Delete data
      stmt.executeUpdate(deleteData);

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
  

