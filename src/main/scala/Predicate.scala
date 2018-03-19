trait Predicate {
  def apply(t: Type): Boolean
}

object Predicate {
  def apply(types: Set[Type]): Predicate = (t: Type) => types.contains(t)

  def apply(f: Type => Boolean): Predicate = (t: Type) => f(t)
}
