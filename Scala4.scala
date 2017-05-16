/**
 * Created with IntelliJ IDEA.
 * User: hduser
 * Date: 15/5/17
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */

object Scala4{

  def main(args:Array[String]){

    var values=Integer.parseInt(Console.readLine())
    var thank=new Array[Int](values)
    for(k<- 0 until values){
     thank(k)=Integer.parseInt(Console.readLine())
    }
    for(k<-0 until thank.length){
      print(thank(k)+" ")

    }
    println(" ")
    var sum=thank.reduce(_+_)
    for(y<-0 until thank.length){
      println(sum/thank(y))
    }

  }
}
