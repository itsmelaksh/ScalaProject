object functionExample extends App {
  println("This is to test functions")
  def getSum(num1 : Int = 1, num2 : Int =2) : Int ={
//    return num1 + num2
    num1 + num2
//    return is not required
  }

  println(" Print the sum of 5 + 2 ="+ getSum(5,2))
  //named notation is possible
  println(" Print the sum of two numbers ; " + getSum(num2=10, num1=5))

//  function return nothing and just printing
  def doNothing () : Unit = {
      println(" This function does not return anyting, Unit is equal to void")
  }

  doNothing()

//  Passsing bunch of values as array
  def getSum(num : Int*) : Int = {
      var sum: Int = 0
      for (i <- num){
        sum += i
      }
      sum
  }
  println(" Total sum is : " + getSum(1,2,3,4,5))

//  Factorial example - recursion
  def factorial(num : BigInt) : BigInt = {
    if (num == 1){
      1
    }
    else
      {
        num * factorial(num-1)
      }
  }

  println(" factorial of given num is : "+ factorial(3))

}
