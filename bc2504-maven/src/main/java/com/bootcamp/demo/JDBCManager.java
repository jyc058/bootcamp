package com.bootcamp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.mysql.cj.xdevapi.Statement;
import lombok.AllArgsConstructor;

public class JDBCManager {
  private Connection connection;
  private PreparedStatement statement; // ! fix SQL injection

  public boolean isConnected() {
    return this.connection != null ;
  }

  public void login(String databaseName, String userId, String password)
    throws SQLException {
      if (isConnected())
        return;
  String dbUrl = "jdbc:postgresql://localhost:5432/" + databaseName;
  this.connection = DriverManager.getConnection(dbUrl, userId, password);
  this.databaseName = databaseName;
    }
  

  public void insertData(String tableName, Person person) throws SQLException{
    String sql = "INSERT INTO" + tableName + " (name, email) VALUES (?, ?)";
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setInt(1, person.getId()); // 1 -> the first question mark
    stmt.setString(2, person.getName());
    this.statement = connection.prepareStatement(sql);
    this.statement.executeUpdate();
  }

  public List<Person> getData() {
    if(!isConnected())
    throw new RuntimeException("Database is not connected.");
    return null; // Todo 
  }

  public static void main(String[] args) {
    JDBCManager jm = new JDBCManager(xxxxx);
    jm.login(); // connection / statement?
    jm.insert(xxxxx);
    jm.getData();
  }
}
