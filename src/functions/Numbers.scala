package functions

object Numbers {
  def fib(num: Int): Int = {
    if(num < 3){
      val ans: Int = 1
      ans
    }
    else{
      val prev1: Int = fib(num - 2)
      val prev2: Int = fib(num - 1)
      val ans: Int = prev1 + prev2
      ans
    }

  }

  def Numbers(inp1: Double, inp2: Double): (Double, Double) => Double = {
    
  }

}