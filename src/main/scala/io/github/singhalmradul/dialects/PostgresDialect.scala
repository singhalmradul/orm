package io.github.singhalmradul.dialects

import java.sql.Connection
import java.sql.DriverManager

import io.github.singhalmradul.sources.DataSource

class PostgresDialect(dataSource: DataSource) extends Dialect(dataSource)
