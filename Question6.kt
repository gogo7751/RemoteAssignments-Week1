package Week1

open class Human(val name :String){
    var mana: Int = 100
    fun manaCheck() {
        if (mana > 0)
            println("$name has mana $mana.")
        else {
            println("$name has no mana.")
        }
    }
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
    dval human = Human("<the name passed in>")
    human.manaCheck()
}
