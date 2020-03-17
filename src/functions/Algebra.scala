package functions

object Algebra {

  def factor(input: Int): List[Int] = {
    val emptyLis: List[Int] = List()
    if (input <= 1) {
      emptyLis
    }
    else {
        val factList: List[Int] = (for (n <- 2 until input if input % n == 0) yield n).toList
        if(factList.isEmpty){
          List(input)
      }
        else{
          val newPrime: Int = factList.head
          val newNum:Int = input / newPrime
          val lis: List[List[Int]] = List(List(newPrime), factor(newNum))
          lis.flatten
        }
    }
  }

}
