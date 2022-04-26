import Methods.nameLength

object Methods extends App {

def nameLength(firstName: String, surname:String): Int = {
    val first = firstName.toCharArray.length
    val last = surname.toCharArray.length
  if (first > last) {
    first
  } else if (last > first) {
    last}
  else 0
  }


  val arnold = nameLength("arnold", "Schwarzenegger")
  val bruce = nameLength("bruce", "lee")
  val ethan = nameLength("ethan", "hawke")
  println(arnold)
  println(bruce)
  print(ethan)

}
