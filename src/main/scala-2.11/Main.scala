import scala.util.Try
object Main {

  def createString(size:Int): Try[String] = Try {
    size match {
      case size if size<0  => throw MinusNumberException(size)
      case _ => (for (i <- 0 to size) yield "a").mkString
    }
  }

}
