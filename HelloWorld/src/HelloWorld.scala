import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object HelloWorld extends App {
  var Name = "Laxman "
  var i  =0
  println("Hello World!" + Name)

  while ( i <  Name.length){
    println(Name.charAt(i))
    i = i + 1
  }

//  while and for loop doing the same thing
  for ( j<- 0 until Name.length; k <- 0 until j){
    print(Name.charAt(k))
  }

//  printing the list using for loop
  val aList = List(1,2,3,4,"test")
  for (vlist <- aList) {
    println(vlist)
  }

//  printing even numbers list
  /*var evenList = for {i <- 1 to 20
    if (i % 2 ) == 0
  } yield i

  for (vlist1 <- evenList)
    println(vlist1)
  */

//  do while loop to read number and print the number with string
  var numberGuess = 10

  do{
    if (numberGuess != 10)
      println(f" You have entered the wrong number! ${numberGuess} \n")
    print(" Enter any number : ")
    numberGuess = readLine.toInt
  } while (numberGuess != 10)

  printf(" You guessed the correct number %d \n", 10)
}
