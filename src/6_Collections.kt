fun main(args: Array<String>) {
    //NECESSARY TO UNDERSTAND AND REMEMBER THESE COLLECTION BECAUSE THEY ARE MOSTLY USED IN APPS DEVELOPMENT

    //IMMUTABLE list of array is listOf() constructor that we CAN"T change
    //data in array has index and the start point is 0. So 0, 1, 2, 3, 4,... that's how it goes
    val imperials  = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")  //any kind of types or objects can be in parenthases
                                    // nothing can be added or modified to val(immutable) variable
    println(imperials.sorted())  // sort objects in an array
    println(imperials[2])  // that's how you can access objects in an array
    println(imperials.first())  // will print first value in array
    println(imperials.last())  //will print last value in array
    println(imperials.contains("Emperor"))  // this collection is a boolean type
    println(imperials)   // will be printed in square brackets which means that it is an array

    //MUTABLE list of array is arrayListOf<>() constructor that we CAN change
    val rebels = arrayListOf("Leiha", "Luek", "Han Solo", "Mon Mathma")
    println(rebels.size)  //returns size of elements in array
    rebels.add("Chabakka") //adds element to the end of array
    println(rebels)
    rebels.add(0,"Mokabo")  //adds element to index position in array
    println(rebels)
    println(rebels.indexOf("Luek"))
    rebels.remove("Luek") // removes element form array by element
    println(rebels)
    rebels.removeAt(1)      // removes element from array by index
    println(rebels)

    //Maps collection is a key value pairs(пары ключевого значения)
    //Key value pairs is like in a phone book where Name is a key and a Phone number is a value
    //Immutable version of map collection, we can't add or subtract(извлечь) to this
    val rebelVehicleMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Light speeder")
                                                         //we initialising variable where Solo is a key
                                                         //and a Millenium Falcon is a value
                                                         //word "to" says that we are mapping the value "Mille.."
                                                         //to the key "Solo"
    println(rebelVehicleMap["Solo"])  //we access a value of a map by a key. "Millenium Falcon" will be printed.
    println(rebelVehicleMap.get("Luke"))  //another way to access a value
    println(rebelVehicleMap.getOrDefault("Leiha", "This ship does not exist"))
    println(rebelVehicleMap.keys)  //will print all the keys
    println(rebelVehicleMap.values)  //will print all the values

    //Mutable version of map collection
    val rebelVehicle = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Light speeder", "Boba Fett" to "Rocket")
    rebelVehicle["Luke"] = "XWing"  //changing the value of the key "Luke"
    //println(rebelVehicle)
    //rebelVehicle["Garan"] = "Motorix" //adding a value of the key to the first index(don't know why)
    //println(rebelVehicle)
    rebelVehicle.put("Leiha", "RayFlyer") //keyword PUT adds the key and value to the end of the array
    println(rebelVehicle)
    rebelVehicle.remove("Boba Fett")
    println(rebelVehicle)
    rebelVehicle.isEmpty()   //returns boolean value whether the value is empty or not
    println(rebelVehicle)
    rebelVehicle.clear()     //clears out all of the entries in the hashMap (in the array variable)
    println(rebelVehicle)
}