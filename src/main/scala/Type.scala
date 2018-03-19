sealed trait Type
case class TypeVar(name: String) extends Type
case class Function(arg: Type, ret: Type) extends Type

case class QualifiedType(predicates: Set[Predicate], `type`: Type)

case class TypeScheme(types: Set[TypeVar], predicate: Predicate)
