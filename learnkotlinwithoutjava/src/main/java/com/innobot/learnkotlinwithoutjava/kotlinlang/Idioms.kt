package com.innobot.learnkotlinwithoutjava.kotlinlang

/**
 * Created by innobot-linux-7 on 21/9/19,21,Experiment.
 */
class Idioms {
    /*getters (and setters in case of vars) for all properties
        equals()
        hashCode()
        toString()
        copy()
        component1(), component2(), …, for all properties (see Data classes)
    * */
    data class Customer(val name: String, val email: String)

    data class Person(val name: String, val age: Int)

    /*Default values for function parameters*/
    fun foo(a: Int = 0, b: String = "") {}

    fun kotlinKcollection() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        /*Filtering a list*/
        val positives = list.filter { x -> x >= 0 }
        println("kotlinKcollection=======positives==========" + positives)

        /*Or alternatively, even shorter:*/
        val positives1 = list.filter { it > 0 }
        println("kotlinKcollection======positives1===========" + positives1)

        /*Checking element presence in a collection*/
//        if ("john@example.com" in emailsList) { }
//        if ("jane@example.com" !in emailsList) {  }

        /*String Interpolation*/
        val name = "Shobana"
        println("Name $name")

        /*Instance Checks*/
//        when (x) {
//            is Foo -> ...
//            is Bar -> ...
//            else   -> ...
//        }

        /*Using ranges*/
        for (i in 1..100) {
            println("closed range Kotlin Collections ----i  $i")
        }  // closed range: includes 100
        for (i in 1 until 100) {
            println("half-open range: does not include 100 Kotlin Collections ----i  $i")
        } // half-open range: does not include 100
        for (x in 2..10 step 2) {
            println("Ranges Kotlin Collections ----x  $x")
        }
        for (x in 10 downTo 1) {
            println("Ranges Kotlin Collections ----x  $x")
        }
        val x = 5
        if (x in 1..10) {
            println("Ranges Kotlin Collections ----x  $x")
        }

        /*Read-only list*/
        val ReadOnlylist = listOf("a", "b", "c")

        /*Read-only map*/
        val map = mapOf("a" to 1, "b" to 2, "c" to 3)

        /*Traversing a map/list of pairs*/
        for ((k, v) in map) {
            println("Kotlin Collections -------Traversing a map/list of pairs------  $k -> $v")
        }

        /*Accessing a map*/
/*        println(map["key"])
        map["key"] = value*/

        /*Lazy property*/
/*        val p: String by lazy {
            // compute the string
        }*/

        /*Extension Functions*/
        fun String.spaceToCamelCase() {
            println("spaceToCamelCase")
        }

        "Convert this to camelcase".spaceToCamelCase()
        /*If not null shorthand*/
/*    val files = File("Test").listFiles()

    println(files?.size)*/

        /*If not null and else shorthand*/
/*    val files = File("Test").listFiles()

    println(files?.size ?: "empty")*/

        /*Executing a statement if null*/
/*    val values = "email_test"
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")*/

        /*Get first item of a possibly empty collection*/
        /*  val emails = ... // might be empty
          val mainEmail = emails.firstOrNull() ?: ""*/

        /*Execute if not null*/
/*    val value = ...

    value?.let {
        ... // execute this block if not null
    }*/

        /*Map nullable value if not null*/
        /*val value = ...
        val mapped = value?.let { transformValue(it) } ?: defaultValueIfValueIsNull*/

        transform("Red")
        test()
        foo(3)
        arrayOfMinusOnes(123545)
        theAnswer()
        Resource.name
        transform1("Green")

        /*Consuming a nullable Boolean*/
        /*    val b: Boolean? = ...
            if (b == true) {
                ...
            } else {
                // `b` is false or null
            }*/

        /*Java 7's try with resources*/
        /*val stream = Files.newInputStream(Paths.get("/some/file.txt"))
        stream.buffered().reader().use { reader ->
            println(reader.readText())
        }*/

        /*Swapping two variables*/
/*var a = 1
    var b = 2
    a = b.also { b = a }*/
    }

    /*Creating a singleton*/
    object Resource {
        val name = "Name"
    }

    /*Return on when statement*/
    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }

    /*'try/catch' expression*/
    fun test() {
        val result = try {
            // count()
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }

        // Working with result
    }

    /*'if' expression*/
    fun foo(param: Int) {
        val result = if (param == 1) {
            "one"
        } else if (param == 2) {
            "two"
        } else {
            "three"
        }
    }

    /*Builder-style usage of methods that return Unit*/
    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }

    /*Single-expression functions*/
    fun theAnswer() = 42
    /*This is equivalent to*/
    /*fun theAnswer(): Int {
    return 42
}*/

    /*This can be effectively combined with other idioms, leading to shorter code. E.g. with the when-expression:*/
    fun transform1(color: String): Int = when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
    /* Calling multiple methods on an object instance (with)*/
/*   class Turtle {
       fun penDown()
       fun penUp()
       fun turn(degrees: Double)
       fun forward(pixels: Double)
   }

    val myTurtle = Turtle()
    with(myTurtle) { //draw a 100 pix square
        penDown()
        for(i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }*/

    /*Convenient form for a generic function that requires the generic type information*/
/*    //  public final class Gson {
//     ...
//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
//     ...

    inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)*/

}