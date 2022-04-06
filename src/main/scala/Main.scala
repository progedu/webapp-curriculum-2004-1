import scala.util.Try

object Main {

  def createString(size: Int): Try[String] = {
    if(size >= 0) {
      Try((for(i <- 1 to size) yield "a").mkString)
    } else {
      Try(throw new RuntimeException("sizeはゼロ以上である必要があります"))
    }
  }

}
