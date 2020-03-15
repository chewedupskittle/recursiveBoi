package functions

object Algebra {

  def factor(input: Int): List[Int] = {
    val emptyLis: List[Int] = List()
    if (input <= 1) {
      emptyLis
    }
    else {
      val oofList: List[List[Int]] = (for(i <- 0 until 1) yield {
        val factList: List[Int] = (for (n <- 2 until input if input % n == 0) yield n).toList
        if(factList.isEmpty){
          List(input)
      }
        else{
          val newNum:Int = input / factList.head
          factor(newNum)
        }}).toList
      oofList.flatten
    }

  }
  def main(args: Array[String]): Unit = {
    println(factor(12))
  }
}
