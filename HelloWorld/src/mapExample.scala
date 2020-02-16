object mapExample extends App{
  println( " Map Example ")

  // immutable map
  val imm1 = Map("Value1" -> "Test1", "Value2" -> "Test2")

  if (imm1.contains("Value1"))
    printf(" Value1 key value is : %s \n", imm1("Value1"))

  //mutable map
  val imm2 = collection.mutable.Map("Value3" -> "Test 3", "Value4" -> "Test 4")

  printf (" first value : %s \n" , imm2("Value3"))
  imm2 ("Value3") = "Test3"
  printf (" first value : %s \n " , imm2("Value3"))
  imm2("Value5") = "Test5"
  printf(" fifth value :%s \n ",imm2("Value5"))

  // key value print
  for ((k,v) <- imm2)
    printf(" %s : %s \n", k, v)
}
