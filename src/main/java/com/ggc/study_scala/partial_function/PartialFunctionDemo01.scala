package com.ggc.study_scala.partial_function


/** 提出一个需求，引起思考
 *
 * 给你一个集合 val list = List (1,2,3,4, "abc"），
 * 请完成如下要求:
 * 1) 将集合 list 中的所有数字+1, 并返回一个新的集合
 * 2) 要求忽略掉非数字的元素，即返回的新的集合形式为（2,3,4,5)
 */

object PartialFunctionDemo01 extends App {

  /**
   * 思路1 filter+map 方式解决
   * 虽然可以解决问题，但是麻烦。
   */
  val list = List(1, 2, 3, 4, "hello")
  println(list.filter(f1).map(f3).map(f2))
  /**
   * 思路2 模式匹配
   * 虽然使用模式匹配比较简单，但是不够完美
   */

  val list2 = list.map((addOne))
  println("list2 = " + list2)

  //判断 n 是否属于Int类型
  def f1(n: Any): Boolean = {
    n.isInstanceOf[Int]
  }

  def f2(n: Int): Int = {
    n + 1
  }

  //强制类型转换 Any -> Int
  def f3(n: Any): Int = {
    n.asInstanceOf[Int]
  }

  def addOne(n: Any): Any = {
    n match {
      case x: Int => x + 1
      case _ =>
    }
  }

}
