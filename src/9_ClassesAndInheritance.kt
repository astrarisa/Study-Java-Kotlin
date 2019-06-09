import kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated

//this is class
//1st - We declare the class name
//2nd - We pass into the constructor the variables(properties) that we want to have
//3rd - We create class methods
//4th - We create an instance(экземпляр) of a class
//constructor is what we call(вызываем) when we are ready to create an instance(Экземпляр) of our class
class Car constructor(make: String, model: String) {   //if constructor has no any annotations or visibility
    val make = make                                   //modifiers, we can get rid of keyword constructor
    val model = model                                 //see example below
}
//--------------------------------------------------------------------------------
//Concise method to do tha same
class anotherCar(val make: String, val model: String, var color: String){  //its totally equivalent to
                                     //what we had in example above getters and setter being created
    fun accelarate(){                //when val is declared we also can create method of a class
        println("vroom vroom")
    }

    fun details(){
        println("This is a $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int){
    fun tow(){
        println("taking the horses to the rodeo")
    }
    fun details(){
        println("This is the $make $model and it's towing capacity $towingCapacity kilograms")
    }
}
//In the classes above we can see some overlap(совпадение, накладка).
//They both have same attributes like make, model and same functions like details and in general same
//things that vehicles have. So it would me nice if there would be a way to have one thing for all this attributes.
//And there is a way which is called INHERITANCE (НАСЛЕОДОВАНИЕ).
//It helps other classes to inherit all the necessary attributes from the overarching(универсальный) class.
//It reduces code duplication and makes the code easier.

//By default all classes are final(sealed) in Kotlin which means that it can't be inherited from
//Keyword OPEN makes class inheritable
open class Vehicles(val make: String, val model: String){  //Here we create an overarching(PARENT) class
    open fun accelerate(){   //If we open one of class methods we allow to override it from our children classes
        println("vroom vroom")
    }
    fun park(){
        println("parking the car")
    }
    fun brake(){
        println("STOP")
    }
}

class Car1(make: String, model: String, val color: String): Vehicles(make, model){
    override fun accelerate() {  //By using the keyword OVERRIDE we can change our PARENT method functionality
        super.accelerate()   //If we leave SUPER then PARENT method will be printed too
        println("We are going to ludicrous mode!") //This is a substitute(замена) to PARENT method functionality
    }
}
class Car2(make: String, model: String, val color: String): Vehicles(make, model)//No methods - no curly braces

class Truck1(make: String, model: String, val towingCapacity: Int) : Vehicles(make, model){
    fun tow(){
        println("headed put tp the mountains")
    }
}

fun main(args: Array<String>) {

    val car = anotherCar("Toyota", "Avalon", "Blue")  //now we've created Car()
                                                                        //class instance(Экземпляр класса) car
    println(car.make)
    println(car.model)
    car.accelarate()
    car.details()

    val truck = Truck("Man","v400", 10000) //initialised from our class Truck
    truck.tow()
    truck.details()

    val tesla = Car1("Tesla", "ModelS", "Red")
    tesla.accelerate()   //Here out instance tesla inherits method form overarching class Vehicles

    val truck1 = Truck1("Ford", "L-400", 10000)
    truck1.park()
    truck1.tow()

}