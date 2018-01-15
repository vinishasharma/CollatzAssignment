package edu.knoldus

object Run {
  def main(args: Array[String]): Unit = {

    val list = List()
    val num1 = 8
    val num2 = 23
    val num3 = 99
    val operation = new Operation
    val resultList = operation.collatz(num2, list)
    val resultList2 = operation.collatz(num1, resultList)
    val resultList3 = operation.collatz(num3,resultList2)
    print(resultList3)
  }
}
