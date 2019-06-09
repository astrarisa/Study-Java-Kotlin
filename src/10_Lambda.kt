
fun main(args: Array<String>) {
    //Lambda is a function literal(Литерал функции). It means that it is function that is not declared but
    //past immediately as an expression. (Функция не объявляется, а сразу проходит как выражение) And it's
    //PARAMETERS if there are any are declared ON THE LEFT SIDE of the arrow in curly braces and being passed
    //into our function literal. ON THE RIGHT SIDE of the arrow is WHAT RETURNED  - this is the BODY
    //OF THE FUNCTION literal
    //We could declare the function and essentially it would be the same

    val printMessage = { message: String -> println(message)} //This is lambda expression

    printMessage("Hello World!")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(3,5))

    val sumB : (Int, Int) -> Int = {x, y -> x + y}
    println(sumB(9,10))

    fun downloadData(url: String, completion: () -> Unit){  //UNIT is like VOID in Java which says return nothing
        //send a download request
        //we got back data
        //there were no network errors
        //completion()   //this element here means that the download is complete
    }

    //call the downloadData function
    downloadData("FakeUrl.com") {   //if statements in the function above is finished, lambda will run
        println("The code int this block will only run " +
        "after the completion()")
    }

    fun downloadCarData(url: String, completion: (Car1) -> Unit){  //LAST ARGUMENT IS LAMBDA(Function literal)
        //send a download request
        //we got back Car data
        val car = Car1("Tesla", "ModelX", "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com") {  car1 ->
        println(car1.color) //Curly braces can be taken out of the parenthesis for LAMBDA body
        println(car1.make)
    }

    downloadCarData("fakeUrl.com") { //we can remove this car1 -> and add it.color when calling parameters
        println(it.color) //only for case when only one parameter in the lambda
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck1?, Boolean) -> Unit){
        //make tha web request
        //get the results back
        val webRequestSuccess = true
        if (webRequestSuccess){
            //receive truck data
            val truck = Truck1("Ford", "F-150", 10000) //we've created new object from
                                                                            //data received from downloadTruckData
            completion(truck, true)  //successfull webRequest
        }else {
            completion(null, false)  //unsuccessfull webRequest - we don't receive truck object
        }

    }
    downloadTruckData("fakeUrl.com") { truck, success -> //now we have our TRUCK if it exists
        //and our SUCCESS variable depending wether
        //the web request was successful
        if (success){
            //do something with our truck
            truck?.tow()
        }else{
            //handle the web request failure
            println("Something went wrong!")
        }

    }

}