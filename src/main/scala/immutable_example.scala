object immutable_example {
  def main(args: Array[String]): Unit = {
    def sayHello(f: () => Unit): Unit = f()

    def helloJoe(): Unit = println("Hello, Joe")

    def bonjourJulien(): Unit = println("Bonjour, Julien")

    sayHello(helloJoe)
    sayHello(bonjourJulien)
  }




}
