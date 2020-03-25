package tests

import functions.Point
import org.scalatest._

class TestPoint extends FunSuite{
  test("poopie"){
    val epsilon: Double = 0.000001
    val point1: Point = new Point(1.0, 2.0)
    val point2: Point = new Point(2.0, -1.0)
    val newP1: Point = point1.add(point2)
    val newP2: Point = point2.multiplyByScalar(5.0)
    assert(point1.x == 1.0 && point1.y == 2.0)
    assert(newP1.x == 3.0 && newP1.y == 1.0)
    assert(point1.x == 1.0 && point1.y == 2.0)
    assert(point2.x == 2.0 && point2.y == -1.0)
    assert(newP2.x - 10.0 < epsilon && newP2.y + 5.0 < epsilon)
    assert(point2.x == 2.0 && point2.y == -1.0)

  }
}
