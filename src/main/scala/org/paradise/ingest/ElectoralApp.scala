package org.paradise.ingest

import org.apache.spark.sql.SparkSession

/**
 * @author ${user.name}
 */
object ElectoralApp {

  def main(args : Array[String]) {
    val spark = SparkSession.builder()
      .appName("App for predicting Spain Electoral 2019 results")
      .master("local[*]")
      .getOrCreate()

    val sc = spark.sparkContext

    val col = sc.parallelize(0 to 100 by 5)
    val smp = col.sample(true, 4)
    val colCount = col.count
    val smpCount = smp.count

    println("orig count = " + colCount)
    println("sampled count = " + smpCount)
    println("test")
  }

}
