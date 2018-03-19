sealed trait Term
case class Var(name: String) extends Term
case class Apply(func: Term, arg: Term) extends Term
case class Lambda(variable: Var, body: Term) extends Term
case class Let(variable: Var, bind: Term, body: Term) extends Term
