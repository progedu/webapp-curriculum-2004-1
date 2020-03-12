import scala.util.Try

object Main {

/*
  def createString(size: Int): String = {
    require(size >= 0, "sizeはゼロ以上である必要があります")
    (for (i <- 0 to size - 1) yield "a").mkString
  }
*/

  def createString(size: Int): Try[String] = {
    if (size <= 0) Try(throw new RuntimeException("sizeはゼロ以上である必要があります"))
    else Try((for (i <- 0 to size - 1) yield "a").mkString)
  }
}