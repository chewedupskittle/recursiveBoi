package functions

object Numbers {
  def fib(num: Int): Int = {
    if (num < 3) {
      val ans: Int = 1
      ans
    }
    else {
      val prev1: Int = fib(num - 2)
      val prev2: Int = fib(num - 1)
      val ans: Int = prev1 + prev2
      ans
    }

  }

  def averageInRange(lis: List[Double]): (Double, Double) => Double = {
    (num1: Double, num2: Double) => {
      val filteredLis: List[Double] = lis.filter(_ > num1)
      val twiceFiltered: List[Double] = filteredLis.filter(_ < num2)
      val addTogether: (Double, Double) => Double = (a: Double, b: Double) => a + b
      if(twiceFiltered.nonEmpty){
        twiceFiltered.reduce(addTogether) / twiceFiltered.length
      }
      else{
        0.0
      }

  }

  }

}