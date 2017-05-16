/**
 * Created with IntelliJ IDEA.
 * User: hduser
 * Date: 16/5/17
 * Time: 12:20 PM
 * To change this template use File | Settings | File Templates.
 */
 import scala.io.{Source};
object Fourth{


  def main(args:Array[String]){
    var dodle=Source.fromFile("/home/hduser/aniketh").getLines().toArray;
    var dodle1=new Array[Int](dodle.length);
    var dodle3=new Array[String](dodle.length);
    /*for(i<-0 until dodle.length){
     var dodle2=dodle(i).split(",");
     dodle1(i)=Integer.parseInt(dodle2(1))
     dodle3(i)=dodle2(0)
     }*/
    var total=0;
    for(i<-0 until dodle.length){
       var a = dodle.map(word=>{var tot=dodle(0).split(",");
        (tot(0),tot(2))})
      total=total+Integer.parseInt(a(i)._2)
    }
    for(i<-0 until dodle.length){
      var a = dodle.map(word=>{var tot=dodle(0).split(",");
        (tot(0),tot(2))})
      println(total/Integer.parseInt(a(i)._2))
    }
      println(total)


  }
     }