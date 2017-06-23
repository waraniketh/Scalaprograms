object Triplets {
  def main(args: Array[String]) {
    for (i <- 0 until 50) {
      for (j <- 0 until 50) {
        for (l <- 0 until 50) {
          if ((l * l == j * j + i * i )&& (i != 0 && j != 0 && l != 0)) {
            print(l + " ")
            print(j + " ")
            print(i)
            println()
          }

        }
      }

    }
  }
}