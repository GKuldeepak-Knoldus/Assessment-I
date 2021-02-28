class Reverse_api {
  def Reverse (string : String) : String = { // Recursion of String
     if (string.length == 1)  string // Check if Length of string is 1
    else Reverse(string.tail) + string.head // Concatenating substring of string with charAt 0
  }

  def Reverse (integer: Int) : String = { // Recursion of Integer
    Reverse(integer.toString) // Recursion of String
  }
}