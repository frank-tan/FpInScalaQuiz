import org.scalatest.FunSuite

class GetStartedTest extends FunSuite {

  test("testSquare") {
    assert(GetStarted.square(3) === 9)
  }

  test("getFibonacci") {
    assert(GetStarted.getFibonacci(0) === 0)
    assert(GetStarted.getFibonacci(1) === 1)
    assert(GetStarted.getFibonacci(2) === 1)
    assert(GetStarted.getFibonacci(3) === 2)
    assert(GetStarted.getFibonacci(4) === 3)
    assert(GetStarted.getFibonacci(6) === 8)
    assert(GetStarted.getFibonacci(10) === 55)
    assert(GetStarted.getFibonacci(12) === 144)
  }

}
