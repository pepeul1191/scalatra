import pe.softweb.servlets._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
  	context.mount(new AppServlet, "/*")
  	context.mount(new SistemaServlet, "/sistema/*")
  }
}
