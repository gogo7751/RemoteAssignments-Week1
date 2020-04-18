package Week1

class Human(val name: String){
    fun attack(){
        println("$name use First Attack!")
    }
}
fun main() {
    val human = Human("<the name passed in>").attack()
}


