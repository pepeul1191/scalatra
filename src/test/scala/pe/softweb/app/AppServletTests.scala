package pe.softweb.app

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike

class AppServletTests extends ScalatraSuite with FunSuiteLike {

  addServlet(classOf[AppServlet], "/*")

  test("GET / on AppServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
