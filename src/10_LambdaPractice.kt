fun main(args: Array<String>) {
    val sum = {age: Int, weight: Double, height: Double -> (age * weight) / height}
    println(Math.round(sum(38, 102.3, 182.5)).toDouble())

    val printMessage = {message: String -> println(message) }
    printMessage("Hello world!")

    fun downloadTruckData(url: String, completion: (Truck1?, Boolean) -> Unit){
        //make web request
        //get the results back
        val webRequestResult = false
        if (webRequestResult){
            println("Truck data received successfully!")
            val truck = Truck1("Volvo", "E450", 10000)
            completion(truck, true)
        }else{
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        //our variable SUCCESS functionality depends now on
        //success of webrequst
        if (success){
            //do something
            truck?.tow()
        }else{
            //do another activity
            truck?.brake()
            println("Something went wrong")
        }
    }


}