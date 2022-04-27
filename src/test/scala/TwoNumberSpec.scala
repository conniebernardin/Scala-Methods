import org.scalatest.FlatSpec

class TwoNumberSpec extends FlatSpec {

  "add" should "add numbers" in {
    val nums = new TwoNumbers(1,2)
    assert(nums.add === 3)
  }

  "add" should "add negative numbers" in{
    val nums = new TwoNumbers(1, -2)
    assert(nums.add === -1)
  }

  "subtract" should "subtract numbers" in {
    val nums = new TwoNumbers(1,2)
    assert(nums.subtract === -1)
  }

  "subtract" should "subtract negative numbers" in {
    val nums = new TwoNumbers(1, -2)
    assert(nums.subtract === 3)
  }

  "divide" should "divide numbers" in {
    val nums = new TwoNumbers(10, 2)
    assert(nums.divide === 5)
  }

  "divide" should "divide by negative numbers" in {
    val nums = new TwoNumbers(10, -2)
    assert(nums.divide === -5)
  }

  "divide" should "throw arithmetic error" in{
    // val nums = new TwoNumbers(10, 0)
    assertThrows[ArithmeticException](new TwoNumbers(10, 0).divide())
  }

  "multiply" should "multiply numbers" in {
    val nums = new TwoNumbers(10, 2)
    assert(nums.multiply === 20)
  }

  "multiply" should "multiply by negative numbers" in {
    val nums = new TwoNumbers(10, -2)
    assert(nums.multiply === -20)
  }

  "multiply" should "multiply by 0 should result in 0" in{
    val nums = new TwoNumbers(10, 0)
    assert(nums.multiply === 0)
  }


}
