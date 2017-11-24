package pe.softweb.app

import org.scalatra._

class AppServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
