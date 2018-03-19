sealed trait TypeExpression
sealed trait Type extends TypeExpression
case class TypeVar(name: String) extends Type
case class Function(arg: Type, ret: Type) extends Type

case class QualifiedType(predicates: Set[Predicate], `type`: Type) extends TypeExpression

case class TypeScheme(types: Set[TypeVar], predicate: Predicate) extends TypeExpression

case class TypingStatement(variable: Var, `type`: Type)

case class TypeAssignment(statements: Set[TypingStatement])

case class Typing(predicates: Set[Predicate], assignments: Set[TypeAssignment], term: Term, `type`: Type)

case class Substitution(typeVar: TypeVar, `type`: Type)
