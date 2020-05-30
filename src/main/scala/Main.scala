object Main {
  import scala.util.Try
  def createString(size: Int): Try[String] = {
     require(size >= 0, "sizeはゼロ以上である必要があります")
     (for (i <- 0 to size) yield "a").mkString 
  }
}
