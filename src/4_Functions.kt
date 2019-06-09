fun main(args: Array<String>) {
    fun forceChoke(){   //declared function won't be executed
        println("You have failed me for the last time Admiral...")
    }
    forceChoke()  //to execute function it has to be called
///////////////////////
    fun makeAnEntrance (line: String) {    //create functions with one parameter
        println(line)
    }
    makeAnEntrance("hello")   // call function and pass one parameter ot it
///////////////////////
    fun calculateNumberGoodGuys (reberls: Int, ewoks: Int): Int { // (...): Int means that functions is going
                                                                  // to return Int value
        val goodGuys = reberls + ewoks
        return goodGuys   //returns to the function value of this variable
    }
    val rebels = calculateNumberGoodGuys(5,7) //passing to variable rebels value of returned function calculateNumberGoodGuys
    println("Dart Wader faced $rebels rebel scam")  //calling out variable in string
    println("Dart Wader faced ${calculateNumberGoodGuys(10,15)} rebel scam")  //calling out function in string

    fun vaderIsFeeling(mood: String = "angry"){  //if we declare a value in function it become default value
        println(mood)
    }
    vaderIsFeeling()  // calls out function with a default value
    vaderIsFeeling("bad")  //calls out function  which overrides(переназначает) default value


}