package tests

import org.scalatest._
import functions.Numbers

class TestAverageInRange extends FunSuite{
  test("haha") {
    val epsilon: Double = 0.000001

    val numLis: List[Double] = List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0)
    val aaa: (Double, Double) => Double = Numbers.averageInRange(numLis)
    assert(aaa(1.0, 7.0) - 4 < epsilon)
    assert(aaa(2.0, 6.0) - 4 < epsilon)
    assert(aaa(0.0, 8.0) - 4 < epsilon)
    assert(aaa(4.0, 7.0) - 5.5 < epsilon)
    assert(aaa(1.0, 3.0) - 2.0 < epsilon)
    assert(aaa(5.0, 7.0) - 6.0 < epsilon)

    val shortLis: List[Double] = List(1.0, 2.0)

    val bbb: (Double, Double) => Double = Numbers.averageInRange(shortLis)

    assert(bbb(1.0, 2.0) != 1.0)



  }
}
