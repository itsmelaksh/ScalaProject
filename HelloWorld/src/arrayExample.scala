import scala.collection.mutable.ArrayBuffer

object arrayExample extends App{
  println(" Array Examples" )
  val favnums = new Array[Int](20)
  val friends = Array("Friend1","Friend2")
  val friends2 = new ArrayBuffer[String]()

  friends(0) = "test1"
  println(" friends at index 0 " + friends(0))

  friends2.insert(0, "ABC 1")
  friends2 += "ABC 2"
  friends2 ++= Array("Friends 1", "friends 2")

  println(" My best friends "+ friends2)
  for ( i <- 0 to 19 ){
    favnums(i) = i*3
  }
  //favnums = (10,20,30,40,30)
  //favnums.sortWith(_>_) //for sorting descending
  val sortedValue = favnums.sortWith(_<_) //for sorting ascending or vice versa
//  println(sortedValue.deep.mkString(", "))
  //println(sortedValue.deep.mkString(", "))
  println(sortedValue.toString())
  for (i <- 0 to sortedValue.length-1){
    println(sortedValue(i))
  }

}
