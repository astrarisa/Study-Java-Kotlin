fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiha", "Luek", "Han Solo", "Mon Mathma")

    //for loop we use in arrayListOf()
    for (rebel in rebels){  //we create variable REBEL for what's inside of the arratList of REBELS
        println("Name: $rebel")
    }

    //for loop we use in hasMapOf()
    val rebelVehicle = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Light speeder", "Boba Fett" to "Rocket")
    for ((key, value) in rebelVehicle){  //in place of KEY, VALUE can ve anythink - CHARACKTER, VECHICLE
        println("$key gets around in  their $value")
    }

    //while loop
    var x = 10
    while (x > 0){
        println(x)
        x--
    }


}