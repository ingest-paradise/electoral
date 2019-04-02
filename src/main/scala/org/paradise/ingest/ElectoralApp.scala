package org.paradise.ingest

import org.apache.spark.sql.SparkSession

/**
 * @author ${user.name}
 */
object ElectoralApp extends App {
  
  val spark = SparkSession.builder()
      .appName("App for predicting Spain Electoral 2019 results")
      .master("local[*]")
      .getOrCreate()

  val sc = spark.sparkContext
    
  Twitter.stream()
  
}
