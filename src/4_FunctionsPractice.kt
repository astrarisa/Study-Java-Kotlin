fun main(args: Array<String>) {
    val lukeReturns = "I order you to leave"
    fun lukesWords(){
        println(lukeReturns)
    }
    lukesWords()

    val neighbouthood = hashMapOf("John" to "Street 1","Nicky" to "Street 2","Stasy" to "Street 3")
    neighbouthood["Nicky"] = "Street 2.1"
    neighbouthood.put("Leila", "Street 4")
    println(neighbouthood)
}