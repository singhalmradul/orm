package io.github.singhalmradul

import io.github.singhalmradul.sources.Postgres

object Main:
  def main(args: Array[String]): Unit =
    // val employees = FROM[Employee] SELECT * --
    val dataSource = Postgres("jdbc:postgresql://localhost:5432/demo", "postgres", "postgres")
    val connection = dataSource.getConnection
    val statement = connection.prepareStatement("SELECT * FROM employees LIMIT 5")
    val resultSet = statement.executeQuery()
    var cols = resultSet.getMetaData.getColumnCount
    while resultSet.next() do
      for i <- 1 to cols do
        print(resultSet.getObject(i).toString + " ")
      println()
    connection.close()
end Main
