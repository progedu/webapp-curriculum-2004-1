import scala.util.Try
object Main {

  def createString(size: Int): Try[String] = {
    if (size < 0) Try(throw new IllegalArgumentException("sizeはゼロ以上である必要があります"))
    else {
      val s = (for (i <- 0 to size) yield "a").mkString
      Try(s)
    }
  }
}
