package io.github.singhalmradul.sources

import java.sql.Connection
import java.sql.DriverManager

class Postgres(url: String, user: String, password: String)
    extends DataSource(url, user, password):
  override def getConnection: Connection =
    Class.forName("org.postgresql.Driver")
    DriverManager.getConnection(url, user, password)
