
fun main(args: Array<String>) {

    val a = 2
    val b = 3
    // Conditional statements
    // == is equality sign (знак равенства)
    if (a == b){
        println("A does in fact B")
    }
    // != inequality sign (знак неравенства)
    if (a != b){
        println("A does not equal B")
    }

    // >= greater or equal (больше или равно)
    // <= less or equal (больше или равно)
    val accoutnBalance = 1000
    val prise = 500
    if (accoutnBalance >= prise){
        println("You can buy this!")
    }else {
        println("Insufficent amount of money on the account")
    }

    // && operator  AND (И)
    val degree = 49
    if (degree >= 70){
        println("This is some great weather")
    }else if (degree < 70 && degree >= 50){
        println("Grab a sweater")
    }else{
        println("Only crap, it's cold")
    }

    val isHungry = false
    val isBored = true
    // || pipes (OR) (ИЛИ)
    if (isHungry == true || isBored == true){  //if one of the statements in the condition is true
        println("Lets get pizza!")   //statements
    }
    if (isHungry || isBored){  //implicit (неявное) true OR true statement
        println("Lets get pizza!")   //statements
    }
    if (!isHungry || isBored){  //implicit (неявное) NOT true(false) OR true statement
        println("Lets get pizza!")   //statements
    }

    // WHEN - conditional operator. May be used instead of IF. Like SWITCH in Java
    val x = 3
    when (x){                    // when x equals
        1 -> println("x = 1")    // to 1 -> print
        2 -> println("x = 2")    // to 2 -> print
        else -> println("x does not equal to 1 or 2")  // statement when x is not equal to any of the listed scenarios
    }

    // Combine everything i've learned
    fun vadorIsFiling(mood: String = "angry"){
        if (mood == "angry"){
            println("Run for the hills, Vader is $mood")
        }else {
            println("Whatever you do, don't make him angry!")
        }
    }
    vadorIsFiling()
}