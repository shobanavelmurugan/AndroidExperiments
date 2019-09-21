package com.innobot.learnkotlinwithoutjava.kotlinlang

/**
 * Created by innobot-linux-7 on 20/9/19,20,Experiment.
 */
class BasicSyntax {

    val PI = 3.14
    var x = 0
    fun BasicSyntax() {
        KotlinFunctions()
        KotlinVariables()
        KotlinStringTemplate()
        KotlinContionalExpression()
        kotlinNullableCheck()
        KotlinTypeCheckAndAutomaticCast()
        KotlinForLoop()
        kotlinWhileLoop()
        kotlinWhenExpression()
        kotlinRange()
        kotlinCollections()
        kotlinClassAndTheirInstance()
    }

    private fun kotlinClassAndTheirInstance() {
        KotlinClassesAndTheirInstance().classeAndTherirInstance()
    }

    private fun kotlinCollections() {
        /* Collection 1 */
        /* Iterating over a collection: */
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
        /* Collection 2 */
        /* Checking if a collection contains an object using in operator: */
        val items1 = setOf("apple", "banana", "kiwifruit")
        when {
            "orange" in items1 -> println("juicy")
            "apple" in items1 -> println("apple is fine too")
        }
        /* Collection 3 */
        /* Using lambda expressions to filter and map collections: */
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }

    private fun kotlinRange() {
        /*  Check if a number is within a range using in operator:*/
        /* Type 1*/
        val x = 10
        val y = 9
        if (x in 1..y + 1) {
            println("fits in range")
        }
        /* Type 2 */
        /*Check if a number is out of range:*/
        val list = listOf("a", "b", "c")

        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range, too")
        }
        /* Type 3 */
        /*Iterating over a range:*/
        for (x in 1..5) {
            print(x)
        }
        /* Type 4 */
        /* or over a progression: */
        for (x in 1..10 step 2) {
            print(x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
    }

    private fun kotlinWhenExpression() {
        println("kotlinWhenExpression======" + describe(1))
        println("kotlinWhenExpression======" + describe("Hello"))
        println("kotlinWhenExpression======" + describe(1000L))
        println("kotlinWhenExpression======" + describe(2))
        println("kotlinWhenExpression======" + describe("other"))
    }

    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }

    private fun kotlinWhileLoop() {
        val items = listOf("apple", "banana", "kiwifruit")
        var index = 0
        while (index < items.size) {
            println("kotlinWhileLoop:=======item at $index is ${items[index]}")
            index++
        }
    }

    private fun KotlinForLoop() {
        /* For Loop Type 1 */
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println("For Loop Type 1 :" + item)
        }
        /* For Loop Type 2 */
        for (index in items.indices) {
            println("For Loop Type 2 : item at $index is ${items[index]}")
        }
    }

    private fun KotlinTypeCheckAndAutomaticCast() {
        /*The is operator checks if an expression is an instance of a type. If an immutable local
        variable or property is checked for a specific type, there's no need to cast it explicitly:*/
        typeCheck1()
        typeCheck2()
        typeCheck3()
    }

    private fun typeCheck3() {
        fun printLength(obj: Any) {
            println("'$obj' string length is ${getStringLength2(obj)
                    ?: "... err, is empty or not a string at all"} ")
        }
        printLength("Incomprehensibilities")
        printLength("")
        printLength(1000)
    }

    private fun typeCheck2() {
        fun printLength(obj: Any) {
            println("'$obj' string length is ${getStringLength1(obj) ?: "... err, not a string"} ")
        }
        printLength("Incomprehensibilities")
        printLength(1000)
        printLength(listOf(Any()))
    }

    private fun typeCheck1() {
        fun printLength(obj: Any) {
            println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
        }
        printLength("Incomprehensibilities")
        printLength(1000)
        printLength(listOf(Any()))
    }

    fun getStringLength2(obj: Any): Int? {
        // `obj` is automatically cast to `String` on the right-hand side of `&&`
        if (obj is String && obj.length > 0) {
            return obj.length
        }

        return null
    }

    fun getStringLength1(obj: Any): Int? {
        if (obj !is String) return null

        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        return null
    }

    private fun kotlinNullableCheck() {
        printProduct("6", "7")
        printProduct("a", "7")
        printProduct("a", "b")
    }

    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    /*A reference must be explicitly marked as nullable when null value is possible.

    Return null if str does not hold an integer:F*/
    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // Using `x * y` yields error because they may hold nulls.
        if (x != null && y != null) {
            // x and y are automatically cast to non-nullable after null check
            println(x * y)
        } else {
            println("kotlinNullableCheck============'$arg1' or '$arg2' is not a number")
        }
    }

    private fun KotlinContionalExpression() {
        println("KotlinContionalExpression==========max of 0 and 42 is ${maxOf(0, 42)}")
        println("KotlinContionalExpression==========(max of1) 0 and 42 is ${maxOf1(0, 42)}")
    }

    private fun KotlinStringTemplate() {
        var a = 1
        // simple name in template:
        val s1 = "a is $a"
        a = 2
        // arbitrary expression in template:
        val s2 = "KotlinStringTemplate=============${s1.replace("is", "was")}, but now is $a"
        println(s2)
    }

    fun KotlinFunctions() {
        //1
        print("KotlinFunctions========sum of 3 and 5 is ")
        println(sum(3, 5))
        //2
        println("KotlinFunctions===========sum1 of 19 and 23 is ${sum1(19, 23)}")
        //3
        println("KotlinFunctions===========printSum of -1 and 8 is ${printSum(-1, 8)}")
        //4
        println("KotlinFunctions===========printSum of -1 and 8 is ${printSum1(-1, 8)}")
    }

    fun KotlinVariables() {
        valVariables()
        varVariables()
        topLevelVariables()
    }

    fun maxOf1(a: Int, b: Int) = if (a > b) a else b
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    private fun topLevelVariables() {
        println("topLevelVariables============x = $x; PI = $PI")
        incrementX()
        println("topLevelVariables===============x = $x; PI = $PI")
    }

    private fun varVariables() {
        /*Variables that can be reassigned use the var keyword:*/
        var x = 5 // `Int` type is inferred
        x += 1
        println("varVariables=============x = $x")
    }

    private fun valVariables() {
        /*Read-only local variables are defined using the keyword val. They can be assigned a value only once.*/
        val a: Int = 1  // immediate assignment
        val b = 2   // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided
        c = 3
        println("valVariables=====================a = $a, b = $b, c = $c")
    }

    fun incrementX() {
        x += 1
    }

    /*Function having two Int parameters with Int return type:*/
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /*Function with an expression body and inferred return type:*/
    fun sum1(a: Int, b: Int) = a + b

    /* Function returning no meaningful value:*/
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    /*Unit return type can be omitted:*/
    fun printSum1(a: Int, b: Int) {
        println("sum1 of $a and $b is ${a + b}")
    }
}