package edu.knoldus

class Operation {

  def collatz(number: Int,list: List[Int]): List[Int] = {
      number match {
        case n if n == 1 => list
        case n => if(n % 2 == 0){
          val num: Int = n/2
          val existResult = findNumInList(num, list)
          if (existResult) list else collatz(num, num :: list)
          }
          else {
          val num: Int = 3 * n + 1
          val existResult = findNumInList(num, list)
          if (existResult) list else collatz(num, num :: list)
          }
    }
  }

  def findNumInList(number: Int, list: List[Int]): Boolean = {
    list match {
      case Nil => false
      case head :: Nil => if (head == number) true else false
      case head :: tail => if (head == number) true else findNumInList(number,tail)
    }
  }
}





