package edu.knoldus

import scala.collection.mutable.ListBuffer

class Operation {

  def collatz(number: Int, map : Map[Int,List[Int]]): List[Int] = {
    val list = new ListBuffer[Int]
    list += number

    def f1(number: Int): List[Int] = {
      number match {
        case n if n == 1 => list.toList
        case n => if (n % 2 == 0) findKey(n / 2, map) else findKey(3 * number + 1, map)
      }
    }

    def findKey(number: Int, map: Map[Int, List[Int]]): List[Int] = {
      if (map.exists(x => x._1 == number)) {
        list.toList ::: map(number)

      }
      else {
        list += number
        f1(number)
      }
    }
    f1(number)
  }
}





