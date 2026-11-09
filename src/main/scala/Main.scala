import zio._
import zio.http._

object Main extends ZIOAppDefault {

  val routes =
    Routes(
      Method.GET / "health" -> handler {
        Response.ok
      },
      Method.GET / "hello" -> handler {
        Response.text("Hello, World!")
      },
      Method.GET / "test-error" -> handler {
        ZIO
        .fail(new RuntimeException("Database unavailable"))
        .catchAll(err => ZIO.succeed(Response.internalServerError("Internal Server Error"))
          )
      }
    )

  def run = Server.serve(routes).provide(Server.default)
}