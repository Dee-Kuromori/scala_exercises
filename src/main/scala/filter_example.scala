object filter_example {
  def main(args: Array[String]): Unit = {
    println((1 to 100).toList.filter(_ % 2 == 0))
  }
}
