/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2010, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Thu Apr 29 17:52:16 CEST 2010  (with extra methods)

package scala




/** <p>
 *    Function with 3 parameters.
 *  </p>
 *  
 */
trait Function3[-T1, -T2, -T3, +R] extends AnyRef { self =>
  def apply(v1:T1,v2:T2,v3:T3): R
  override def toString() = "<function3>"
  
  /** f(x1, x2, x3)  == (f.curried)(x1)(x2)(x3)
   */
  def curried: T1 => T2 => T3 => R = {
    (x1: T1) => (x2: T2) => (x3: T3) => apply(x1, x2, x3)
  }
  @deprecated("Use 'curried' instead")
  def curry = curried

  /* f(x1, x2, x3) == (f.tupled)(Tuple3(x1, x2, x3))
   */
  def tupled: Tuple3[T1, T2, T3] => R = {
    case Tuple3(x1, x2, x3) => apply(x1, x2, x3)
  }

}
