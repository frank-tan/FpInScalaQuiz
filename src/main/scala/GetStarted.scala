object GetStarted extends App {

  def square(x: Int) = x * x

  def getFibonacci(index: Int): Int = {
    @annotation.tailrec
    def getTailRec(index: Int, prev: Int, current: Int): Int = {
      if (index <= 0) {
        current
      } else {
        getTailRec(index - 1, prev = prev + current, current = prev)
      }
    }

    getTailRec(index, 1, 0)
  }
}
