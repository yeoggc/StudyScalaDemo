package com.ggc.study_scala

import scala.collection.immutable

/**
 * 偏函数
 */
object PartialFunctionDemo extends App {

  val f: PartialFunction[Char, Int] = {
    case '+' => 1;
    case '-' => -1
  }

  println(s"f('-') = ${f('-')}")
  println(s"f.isDefinedAt('0') = ${f.isDefinedAt('0')}")
  //  println(s"f('0') = ${f('0')}")//抛出MatchError

  val res: immutable.Seq[Int] = "-3+4".collect ({ case '+' => 1;
  case '-' => -1
  })

  println(res)

}
