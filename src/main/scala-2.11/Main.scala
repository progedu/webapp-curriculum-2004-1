import scala.util.Try

object Main {

  def createString(size: Int): Try[String] = Try {
    size match {
      case size if size <= 0 => throw new IllegalArgumentException("sizeは0以上を指定すること")
      case size if size > 0 => (for (i <- 1 to size) yield "a").mkString
    }
  }

}
