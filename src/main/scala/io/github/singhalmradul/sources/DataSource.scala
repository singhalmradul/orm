package io.github.singhalmradul.sources

import java.sql.Connection

trait DataSource(url: String, user: String, password: String):
  def getConnection: Connection
