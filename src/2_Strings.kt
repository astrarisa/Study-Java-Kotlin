fun main(args: Array<String>) {
    var str = "1_May the force be with you."  // String type
    println(str)
    var str1 = "2_My dad told be the funnies thing: \"Hahaha\" \\ "   //escaped string (экранирования символов)
    println(str1)
    var str2 = "3_My dad told be the funnies thing: \nHahaha "   //  \n give a new line
    println(str2)
    var str3 = "4_My dad told be the funnies thing: \tHahaha "   //  \t tabs (обширный пробел) everything
    println(str3)
    var str4 = "5_My dad told be the funnies thing\b: Hahaha "   //  \b backsppace last character
    println(str4)
    var str5 = "6_My dad told be the funnies thing\r: Hahaha "   //  \r carriage return(deletes everything before \r)
    println(str5)
    var str6 = "7_My dad told be the funnies thing\$: Hahaha "   //  \$ dollar sign
    println(str6)

    //raw string is a multi line string with 3 quotations marks
    var rawCrawl = """|A long time ago,
        far far away,
        |in a galaxy,
        |Bum Bum Bum""".trimMargin() //.trimMargin() deletes all indents before sign "|" pipe sign
    println(rawCrawl)

/*
    for (char in str){  //prints each character of string in a new line
        println(char)
    }
*/

    var contentEquals = str.contentEquals("1_May the force be with you.")
    println(contentEquals)

    val contains = str.contains("may", true)
    println(contains)

    val upperCase = str.toUpperCase()
    println(upperCase)
    val lowerCase = str.toLowerCase()
    println(lowerCase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)  // printed 6 is a string character

    val subsequence = str.subSequence(6,16)  //extracts the value between 2 indexes in a string
    println(subsequence)

    //screen templates
    val luke = "Luke Skywalker"
    val lightSaberColour = "green"
    val vehicle = "lightspeeder"
    val age = 27
    println("$luke has a $lightSaberColour lightsaber and drives a $vehicle  and is $age years old")
    println("Lukes full name $luke has ${luke.length} characters") //we can use in this construction the variable's method

}