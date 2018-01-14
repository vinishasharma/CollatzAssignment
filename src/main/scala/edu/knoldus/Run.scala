package edu.knoldus

object Run {
  def main(args: Array[String]): Unit = {

    val l1 = List(1)
    val initialMap = scala.collection.mutable.Map[Int, List[Int]](1 -> l1)
    val operation = new Operation
    val num1 = 40
    print(s"\nsequence for $num1\n")
    val list1 = operation.collatz(num1, initialMap.toMap)
    initialMap += (num1 -> list1)
    val sequenceList1 = initialMap(num1)
    for (i <- 0 until sequenceList1.length) yield print(s"${sequenceList1(i)}\n")

    val num2 = 56
    print(s"\nsequence for $num2\n")
    val list2 = operation.collatz(num2, initialMap.toMap)
    initialMap += (num2 -> list2)
    val sequenceList2 = initialMap(num2)
    for (i <- 0 until sequenceList1.length) yield print(s"${sequenceList1(i)}\n")
  }

}
