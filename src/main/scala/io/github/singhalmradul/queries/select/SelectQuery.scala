package io.github.singhalmradul.queries.select

import clauses.*


class SelectQuery

object SelectQuery:
  infix def FROM[T] = SelectClause[T]()
