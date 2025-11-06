package io.github.singhalmradul.dialects

import java.sql.Connection
import io.github.singhalmradul.sources.DataSource

trait Dialect(dataSource: DataSource):
  val connection: Connection = dataSource.getConnection