/**
 * Created with IntelliJ IDEA.
 * User: hduser
 * Date: 11/5/17
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io._
object wa {
    def main(args: Array[String]) {
      println( "multiplier(1) value = " +  multiplier(1) )
      println( "multiplier(2) value = " +  multiplier(2) )
      println("this is dividend"+dividend(3))
      println(voltage(300))
      println(voltage1(21))
      eee
    }
  var factor = 3
  val multiplier = (i:Int) => i * 10
  val dividend=(l:Float)=>l*7
  def voltage(dol:Int) :String={
    var cool=new PrintWriter(new File("/home/hduser/aniketh"))
    cool.write(dol.toString)
    cool.close()
    return "this worked     "+dol.toString
  }
  def voltage1(rool:Int):Int={
    println(rool.toDouble)
    var kill=(i:Int)=>i*100
    println(kill(90))
     return 10
  }
  def eee(){
    var bob="ruling"
   var too= bob.equals("ruling")
      println(too)
    var bobspli=bob.toCharArray
    val king=(k:Int)=>k*8
    println(king(9))
  }
  }