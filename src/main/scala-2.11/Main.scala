import scala.util.{Failure, Success, Try}

object Main {

  def createString(size: Int): Try[String] = {
    Try {
      if(size < 0){
        throw new IllegalArgumentException("sizeはゼロ以上である必要があります")
      }

      (for (i <- 0 to size) yield "a").mkString
    }
  }

}
