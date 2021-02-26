import scala.util.Try

object Main {

  def createString(size: Int): Try[String] = Try {
    require(0 <= size)
    (for (i <- 0 to size) yield "a").mkString
  }

}
