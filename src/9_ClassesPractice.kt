open class Player (val name: String, val age: String, val gender: String){
    fun attack(){
        println("Smack-Smack")
    }
    open fun defend(){
        println("Ha-Ha, you can't defeat me!")
    }
    fun walk(){
        println("I am jus walking while no is one here!")
    }
}

class Thief (name: String, age: String, gender: String, val intelleganceLevel: Int): Player(name, age, gender){
    fun walksAround(){
        println("I am behind you")
    }

    override fun defend() {
        //super.defend()
        println("I only can steal!")
    }
}
class Warrior (name: String, age: String, gender: String, val powerLevel: Int): Player(name, age, gender){
    fun puchForce(){
        println("The more power i have the stronger my punch is!")
    }
}

fun main(args: Array<String>) {
    val thief = Thief("Jack", "24", "Male", 20)
    thief.attack()
    thief.walksAround()
    thief.defend()

    val warrior = Warrior("Broger", "40", "Male", 19)
    warrior.walk()
    warrior.defend()
    warrior.puchForce()
    println("""If thief ${thief.name} comes closer than 3 meters, Warrior's ${warrior.name} power level
        |pops up. His level is ${warrior.powerLevel}
    """.trimMargin())
}