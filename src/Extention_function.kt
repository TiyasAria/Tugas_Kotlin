fun String.hello() : String = "hello :) $this"
fun String.hii() : Unit = println("hii :) $this ")

fun main() {
 val name = "Tiyas Aria"
    println(name.hello())
    name.hii()
"Pratiwi".hii()


}