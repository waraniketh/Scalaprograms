import org.apache.spark.SparkContext._
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
object Writingfirstquery {
  def main(args: Array[String]) {
   var sc = new SparkContext(new SparkConf().setAppName("inseerting data"))
    var spark1 = new SQLContext(sc);
    spark1.sql("select * from censusdata limit 10").show()   
  }

}