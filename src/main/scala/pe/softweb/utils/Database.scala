package pe.softweb.utils

import java.sql.DriverManager
import java.sql.Connection
/**
 * A Scala JDBC connection example by Alvin Alexander,
 * http://alvinalexander.com
 */
object ScalaJdbcConnectSelect {

  def select(){
    // connect to the database named "mysql" on the localhost
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/accesos"
    val username = "root"
    val password = "123"

    // there's probably a better way to do this
    var connection:Connection = null

    try {
      // make the connection
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      // create the statement, and run the select query
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT id, nombre, version, repositorio FROM sistemas")
      while ( resultSet.next() ) {
        val id = resultSet.getString("id")
        val nombre = resultSet.getString("nombre")
        val version = resultSet.getString("version")
        val repositorio = resultSet.getString("repositorio")
        println("sistema, id = " + id + ", nombre = " + nombre + ", version = " + version + ", repositorio = " + repositorio)
      }
    } catch {
      case e => e.printStackTrace
    }
    connection.close()
  }

}