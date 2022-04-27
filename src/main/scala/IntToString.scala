class IntToString {

  val fizzBuzz = (a:Int)=> {

    // val fizz = "Fizz"
    if(a % 3 == 0){
      a.toString + "Fizz"
  }
    else if (a % 5 == 0){
      a.toString + "Buzz"
  }
    else if(a%3 == 0 && a%5 == 0){
      a.toString + "FizzBuzz"
  }
  }

}
