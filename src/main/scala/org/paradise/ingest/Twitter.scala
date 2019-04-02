package org.paradise.ingest

import com.typesafe.config.ConfigFactory
import twitter4j.conf.ConfigurationBuilder
import twitter4j._

object Twitter {

  val twitterConfig = ConfigFactory.load().getConfig("config.twitter")

  val config = new ConfigurationBuilder()
    .setOAuthConsumerKey(twitterConfig.getString("consumer_key"))
    .setOAuthConsumerSecret(twitterConfig.getString("consumer_key_secret"))
    .setOAuthAccessToken(twitterConfig.getString("access_token"))
    .setOAuthAccessTokenSecret(twitterConfig.getString("access_token_secret"))
    .build()
  
  val listener = new StatusListener {
    override def onStatus(status: Status): Unit = println(status.getText)
    override def onDeletionNotice(statusDeletionNotice: StatusDeletionNotice): Unit = ???
    override def onTrackLimitationNotice(i: Int): Unit = ???
    override def onScrubGeo(l: Long, l1: Long): Unit = ???
    override def onStallWarning(stallWarning: StallWarning): Unit = ???
    override def onException(e: Exception): Unit = ???
  }

  val twitterStream = new TwitterStreamFactory(config).getInstance().addListener(listener)
  
  def stream() = {
    twitterStream.filter("hola")
  }
}
