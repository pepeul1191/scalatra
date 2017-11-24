package pe.softweb.servlets

import org.scalatra._

class AppServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
