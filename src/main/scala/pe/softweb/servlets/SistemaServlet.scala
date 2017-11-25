package pe.softweb.servlets

import org.scalatra._
import pe.softweb.utils._
import slick.driver.SQLiteDriver.api._
import scala.concurrent.ExecutionContext.Implicits.global

class Sistema(tag: Tag) extends Table[(Int, String, String, String)](tag, "sistemas") {
  def id = column[Int]("id", O.PrimaryKey) // This is the primary key column
  def nombre = column[String]("nombre")
  def version = column[String]("version")
  def repositorio = column[String]("repositorio")
  // Every table needs a * projection with the same type as the table's type parameter
  def * = (id, nombre, version, repositorio)
}

class SistemaServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/hello/:name") {
	  // Matches "GET /hello/foo" and "GET /hello/bar"
	  // params("name") is "foo" or "bar"
	  <p>Hello Sistema, {params("name")}</p>
	}

	get("/listar"){
		//ScalaJdbcConnectSelect.select
		<p>lista</p>	
	}

	get("/demo"){
		
		val db = Database.forURL("jdbc:sqlite:db/db_accesos.db", driver = "org.sqlite.JDBC")
		val sistemas = TableQuery[Sistema]
		try {
		  // ...
		  println("antes!!!")
		  db.run(sistemas.result).map(_.foreach {
			  case (id, nombre, version, repositorio) =>
			  	println("!+")
			    println("  " + id + "\t" + nombre + "\t" + version + "\t" + repositorio)
			})
			println("despues!!!")
		} finally db.close
		
		<p>demo</p>	
	}
}
