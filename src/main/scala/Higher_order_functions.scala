object Higher_order_functions {
  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 3).map(i => i * 2) // List(2,4,6)
    val b = List(1, 2, 3).map(_ * 2)
    print(a,b)
  }

}
