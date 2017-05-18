

object First {
  def main(args: Array[String]): Unit = {
    var tot = 5
    for (tot1 <- 0 until tot) {
      print(tot1.toString().length + " ")
    }
    var total1 = (total: Int) => total * 10
    println(total1(3))
    println("enter string you want to reverse")
    var theword = Console.readLine();
    var reveresed = ""
    for (rever <- 0 until theword.length()) {
      reveresed = reveresed + theword.charAt(theword.length() - rever - 1)
    }
    println(reveresed)
  }
}