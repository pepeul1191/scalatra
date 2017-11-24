package pe.softweb.servlets

import org.scalatra._

class SistemaServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/hello/:name") {
	  // Matches "GET /hello/foo" and "GET /hello/bar"
	  // params("name") is "foo" or "bar"
	  <p>Hello Sistema, {params("name")}</p>
	}
}
