
import java.io._
object Fibonnaci {

  def main(args: Array[String]) {
    var google = new BufferedReader(new InputStreamReader(System.in));
    var first = Integer.parseInt(google.readLine())
    var second = Integer.parseInt(google.readLine())
    var third=0
    println(first)
    println(second)
    for(i<-0 until 10){
      third=first+second
      println(third)
      first=second
      second=third      
    }
  }

}