import zio._
import zio.http._

object Main extends ZIOAppDefault {

  val routes =
    Routes(
      Method.GET / "health" -> handler {
        Response.ok
      }
    )

  def run = Server.serve(routes).provide(Server.default)
}