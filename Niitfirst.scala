
import org.apache.spark.SparkContext._
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
object Niitfirst {
  def main(args: Array[String]) {
    var sc = new SparkContext(new SparkConf().setAppName("war"))
    var spark1 = new SQLContext(sc);
    spark1.sql("drop database sparkniitproject")
    spark1.sql("create database sparkniitproject")
    spark1.sql("use sparkniitproject")
    spark1.sql("create table censusdata(age int,education string,maritalstatus string,gender string,taxfilerstatus string,income double,parents string,countryofbirth string,citizenship string,weeksworked int) row format delimited fields terminated by ',' stored as textfile")
  }

}