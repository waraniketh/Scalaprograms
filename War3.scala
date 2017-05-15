/**
 * Created with IntelliJ IDEA.
 * User: hduser
 * Date: 13/5/17
 * Time: 12:34 PM
 * To change this template use File | Settings | File Templates.
 */

import scala.io.Source
object War3{
  def main(args:Array[String]){
    var opening=Source.fromFile("/home/hduser/file1.txt").getLines()
    var tot=opening.filter((_.equals("amazed agonize"))).flatMap(_.split(" ")).map(word=>(word,10))
    var tot1=Array(12,10,10)
    println(tot1.reduceLeft(_+_))

  }
}
