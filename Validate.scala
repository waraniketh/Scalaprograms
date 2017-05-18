

object Validate {
  def Job(expr: Int) {
    if (expr > 2) {
      println("tougher")

    } else {
      println("simpler")
    }
  }
  def selection(): Int = {

    var right = ""
    if (right.equals(" ")) {
      return 1
    } else {
      return 0
    }
  }
  def main(args: Array[String]): Unit = {
    var numberofapplicants = Console.readInt()
    var i = 0
    while (i < numberofapplicants) {
      Job(Console.readInt())
      i = i + 1
    }
    println(selection())
  }
}