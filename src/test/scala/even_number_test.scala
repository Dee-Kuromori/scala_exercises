import org.scalatest.funsuite.AnyFunSuite
class even_number_test extends AnyFunSuite {
  test("even_number.even") {
    assert(even_number.even(100) === true)
  }

}
