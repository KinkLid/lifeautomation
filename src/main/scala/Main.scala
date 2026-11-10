import zio._
import zio.http._
import zio.schema.{DeriveSchema, Schema}

object Main extends ZIOAppDefault {

  case class CreateReminderRequest(
    message: String,
    scheduledAt: String
  )

  object CreateReminderRequest:
    given Schema[CreateReminderRequest] =
      DeriveSchema.gen[CreateReminderRequest]

  val routes =
    Routes(
      Method.GET / "health" -> handler {
        (req: Request) => 
          val effect = for{
            a <- req
            .body
            .asJson[CreateReminderRequest]
            msg = a.message
            time = a.scheduledAt
          } yield Response.text(s"$msg, $time")

          effect.mapError(_ => Response.badRequest("Invalid JSON"))
      }
    )


  def run = Server.serve(routes).provide(Server.default)
}