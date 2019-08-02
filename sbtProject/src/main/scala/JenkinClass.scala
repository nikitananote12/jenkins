import org.apache.spark.sql.SparkSession

object JenkinClass {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").getOrCreate()
    val sc = spark.sparkContext
    val file1 = spark.read.format("com.databricks.spark.csv").load("/home/admin1/ScalaPro/twitter_sentiment_analysis_py/Data/train.csv")
    val saveData = file1.write.format("com.databricks.spark.csv").save("/home/admin1/sbtProject/src/main/scala/data")
  }
}
