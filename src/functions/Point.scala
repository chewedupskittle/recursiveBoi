package functions

class Point(val x: Double, val y: Double) {
  def add(point: Point): Point = {
    val newX: Double = this.x + point.x
    val newY: Double = this.y + point.y
    new Point(newX, newY)
  }

  def multiplyByScalar(dub: Double): Point = {
    val newX: Double = this.x * dub
    val newY: Double = this.y * dub
    new Point(newX, newY)
  }
}
