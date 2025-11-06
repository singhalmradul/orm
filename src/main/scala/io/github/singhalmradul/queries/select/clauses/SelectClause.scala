package io.github.singhalmradul.queries.select.clauses

class SelectClause[T]:
  infix def SELECT[S](x: T => S) = ???
  // infix def SELECT(x: T => T) = ???

object SelectClause:
  infix def * = (x: AnyRef) => x