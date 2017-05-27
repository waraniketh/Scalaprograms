import org.apache.spark.SparkContext._
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
object Firstquery {
  def main(args: Array[String]) {
    var sc = new SparkContext(new SparkConf().setAppName("inseerting data"))
    var spark1 = new SQLContext(sc);
    spark1.sql("use sparkniitproject")
    spark1.sql("load data local inpath '/home/hduser/forspark1/*' overwrite into table censusdata")
    
  }

}