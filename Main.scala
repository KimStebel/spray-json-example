import spray.json._

object Main {
  import DefaultJsonProtocol._
  case class Box[A:JsonFormat](a:A)
  def main(a:Array[String]) {
    jsonFormat1(Box[Int])
  }
}
