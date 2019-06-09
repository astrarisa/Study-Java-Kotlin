fun main(args: Array<String>) {
    //At the point of declaration variables have to have values
    //If you don't explicitly(явно) say that variable is NULLABLE the compiler will never
    //let you set that variable's value to NULL.
    var name: String = "JohnyB"
    //name = null
    //We get a NULL POINTER EXCEPTION crash under 4 circumstances:
    //1- We make an explicit(явный) call to throw a NULL POINTER EXCEPTION
    //2- The usage of operator "!!" 2 exclamation points (pound-pound)
    //3- External Java code can cause it as Kotlin uses Java libraries
    //4- If you have some data inconsistency(несоответствие) somewhere with regards to initialization

    var nullableName: String? = "Do i really exist?"     // ? sign says that variable can be nullable
    nullableName = null
    println(nullableName)         //will be printed
  //println(nullableName.length)  //functions will not be aloud in NULLABLE variable

    //There is few fays to do it
    //1- First method to do it is NULL check
    var lenght = 0
    if (nullableName != null){
        println(nullableName.length)
    }
    if (nullableName != null){       //if not NULL
        lenght = nullableName.length //than lenght will be equal to amount of characters in variable nullableName
    }else {
        lenght = -1                  //if nullableName equals to NULL than lenght equals to -1
    }
    println(lenght)

    //More concise(лаконичный) way of NULL check
    var l = if (nullableName != null) nullableName.length else -1  //if l is not equal to NULL than l equals
                                                                   //to amount of characters in variable nullableName
                                                                   //else l equals to -1

    //2- Second method to do it is Safe Call Operator  ?
    println(nullableName?.length)   //it says print out the lenght of nullableName if its not NULL
                                    //however if it is NULL than give it a value of NULL

    //If you want to make sure the value is returned even if it is NULL you can use the third method
    //3- Third method is Elvis Operator
    val len = nullableName?.length ?: -1  //?: is equivalent to if...else operator. It can provide default value
                                          //So its says if there is a non NULL value in nullableName than we're
                                          //going to assign this value to len, however if there is a NULL value
                                          //than we assign -1 to len
    val noName = nullableName ?: "No one knows my name..."  //if nullableName is NULL i'll assign "..."
                                                            //using Elvis Operator(?:)  to noName
    println(noName)

    //4- Fourth method is to use the double exclamation operator !!
    //This will return a non NULL value of a variable if it exists but if id doesn't you'll get a
    //NullPointerException and your app will crash
    println(nullableName!!.length)  //in this case app will crash
                                    //you can use this option only if you 100% sure
                                    //that a value exist for that variable

}