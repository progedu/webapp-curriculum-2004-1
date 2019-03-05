import scala.util.Try

object Main {

  def createString(size: Int): Try[String] = {
    if (size < 0)
      Try(throw new IllegalArgumentException("sizeはゼロ以上である必要があります"))
    else {
      val result = for (_ <- 0 to size) yield "a"
      Try(result.mkString)
    }
  }

}
