package Week1


open class Human(var name :String){
    open fun attack() {
        println("$name use First Attack!")
    }
}

class Mage(name: String): Human(name){
    override fun attack() {
        println("$name use Fireball!")
    }
}

fun main() {
    val mage = Mage("<the name passed in>")
    mage.attack()
}