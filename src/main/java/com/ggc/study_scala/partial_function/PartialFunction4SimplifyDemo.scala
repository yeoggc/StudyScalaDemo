package com.ggc.study_scala.partial_function

/** 偏函数简写形式
 *
 *
 */
object PartialFunction4SimplifyDemo extends App {

  // 第一种简写形式
  val origin = List(1, 2, 3, 4, 1.2, 2.4, 1.9f, "hello")
  val list = origin.collect(partialFunc)

  def partialFunc: PartialFunction[Any, Int] = {
    case i: Int => i + 1
    case j: Double => (j * 2).toInt
  }
  println("list = " + list)


  // 第二种简写形式
  val list2 = origin.collect{
    case i:Int => i+1
    case j:Double => (j*2).toInt
    case k:Float => (k*3).toInt
  }
  println("list2 = " + list2)


}
