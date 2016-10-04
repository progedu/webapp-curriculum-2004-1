object Main {

  def createString(size: Int): String = {
    require(size >= 0, "sizeはゼロ以上である必要があります")
    (for (i <- 0 to size) yield "a").mkString
  }

}
