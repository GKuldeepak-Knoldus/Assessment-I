object Reverse_impl {
  def main(args: Array[String]): Unit = {
    val reverse_api = new Reverse_api()
    println(reverse_api.Reverse("Kuldeepak Gupta")) //reversing a string
    println(reverse_api.Reverse(325242)) // reversing an integer
  }
}
