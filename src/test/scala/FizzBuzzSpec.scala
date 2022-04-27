import org.scalatest.FlatSpec

class FizzBuzzSpec extends FlatSpec {

  "fizzbuzz" should "modulus by 3 should fizz" in {
    val nums = new IntToString
    assert(nums.fizzBuzz(9) === "9 Fizz")
  }

  "fizzbuzz" should "modulus by 5 should buzz" in {
    val nums = new IntToString
    assert(nums.fizzBuzz(10) === "10 Buzz")
  }

  "fizzbuzz" should "modulus by 3 and 5 should FizzBuzz" in {
    val nums = new IntToString
    assert(nums.fizzBuzz(15) === "15 FizzBuzz")
  }

  "fizzbuzz" should "return sassy statement if not divisible by 3 or 5" in {
    val nums = new IntToString
    assert(nums.fizzBuzz(13) === "no fizz or buzz for you")
  }

  "fizzbuzz" should "return sassy statement if 0" in {
    val nums = new IntToString
    assert(nums.fizzBuzz(0) === "no fizz or buzz for you")
  }

}
