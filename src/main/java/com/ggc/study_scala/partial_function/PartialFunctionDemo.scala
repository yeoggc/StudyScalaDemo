package com.ggc.study_scala.partial_function

import scala.collection.immutable

/**
 * 快学Scala - 14.17
 * 偏函数
 */

/**
 * 说明：偏函数表达式必须位于编译器可以推断出返回类型的上下文中。
 * 当你把它赋值给一个带有类型声明的变量，或者将它作为参数传递时，都符合这个要求。
 */
object PartialFunctionDemo extends App {

  /**
   * 被包在花括号内的一组 case 语句是一个偏函数 —— 一个并非对所有输人值都有定义的函数
   * 它是 PartialFunction [A, B] 类的一个实例。（A 是参数类型，B 是返回类型）
   */

  val f: PartialFunction[Char, Int] = {
    case '+' => 1;
    case '-' => -1
  }

  println(s"f('-') = ${f('-')}")//-1
  println(s"f.isDefinedAt('0') = ${f.isDefinedAt('0')}")//false
  //  println(s"f('0') = ${f('0')}")//抛出MatchError

  /**
   * 有一些方法接受 PartialFunction 作为参数。
   * 举例来说，GenTraversable 特质的 collect 方法将一个偏函数应用到所有在该偏函数有定义的元素，
   * 并返回包含这些结果的序列
   */
  val res: immutable.Seq[Int] = "-3+4".collect ({ case '+' => 1;
  case '-' => -1
  })

  println(res)

}
