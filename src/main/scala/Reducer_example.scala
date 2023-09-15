object Reducer_example {
  def main(args: Array[String]): Unit = {
    def add(x: Int, y: Int): Int = x + y
    val a = List(1,2,3,4,6,7,8,9,8)
    println("The total is " + a.reduce(add))
  }

}
