package com.innobot.learnkotlinwithoutjava.basicsyntax

/**
 * Created by innobot-linux-7 on 4/9/19,04,Experiment.
 */
class KotlinControlFlow {
    fun kotlinIfExpression() {
        /*There is various type of if expression in Kotlin.
        1.if-else expression,2.if-else if-else ladder expression,3. nested if expression*/
        println("====== 1.if-else expression=======")
        val num1 = 10
        val num2 = 20
        val num3 = 30
        val result = if (num1 > num2) {
            "$num1 is greater than $num2"
        } else {
            "$num1 is smaller than $num2"
        }
        println(result)
        /*Using if-else expression in one single line statement is like ternary operator in Java.
        Kotlin does not support any ternary operator.
        val result1 = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"
        println(result1)*/
        println("====== 2.if-else if-else ladder expression=======")
        val num = 10
        val result1 = if (num > 0) {
            "$num is positive"
        } else if (num < 0) {
            "$num is negative"
        } else {
            "$num is zero"
        }
        println(result1)
        println("====== 3. nested if expression=======")

        val result2 = if (num1 > num2) {

            val max = if (num1 > num3) {
                num1
            } else {
                num3
            }
            "body of if " + max
        } else if (num2 > num3) {
            "body of else if" + num2
        } else {
            "body of else " + num3
        }
        println("$result2")
    }

    fun kotlinWhenExpression() {
        println("============when as an Expression============")
        var number = 4
        var numberProvided = when (number) {
            1 -> "One"
            2 -> "Two"
            3 -> "Three"
            4 -> "Four"
            5 -> "Five"
            else -> "invalid number"
        }
        println("You provide $numberProvided")
        println("============when Without Expression============")
        when (number) {
            1 -> println("One")
            2 -> println("Two")
            3 -> println("Three")
            4 -> println("Four")
            5 -> println("Five")
            else -> println("invalid number")
        }
        println("============Multiple Statement of when Using Braces============")
        var numberval = 1
        when (numberval) {
            1 -> {
                println("Monday")
                println("First day of the week")
            }
            7 -> println("Sunday")
            else -> println("Other days")
        }
        println("============Multiple branches of when============")
        var number1 = 8
        when (number1) {
            3, 4, 5, 6 ->
                println("It is summer season")
            7, 8, 9 ->
                println("It is rainy season")
            10, 11 ->
                println("It is autumn season")
            12, 1, 2 ->
                println("It is winter season")
            else -> println("invalid input")
        }
        println("============Using when in the range============")
        var number2 = 7
        when (number2) {
            in 1..5 -> println("Input is provided in the range 1 to 5")
            in 6..10 -> println("Input is provided in the range 6 to 10")
            else -> println("none of the above")
        }
    }

    fun kotlinForLoop() {
        println("============Iterate through array============")
        /* A simple example of iterating the elements of array.*/
        val marks = arrayOf(80, 85, 60, 90, 70)
        for (item in marks) {
            println(item)
        }
        /*If the body of for loop contains only one single line of statement, it is not necessary to enclose within curly braces {}.*/
        for (item in marks)
            println(item)
        /* The elements of an array are iterated on the basis of indices (index) of array*/
        for (item in marks.indices)
            println("marks[$item]: " + marks[item])
        println("============Iterate through range============")
        print("for (i in 1..5) print(i) = ")
        for (i in 1..5) print(i)
        println()
        print("for (i in 5..1) print(i) = ")
        for (i in 5..1) print(i)             // prints nothing
        println()
        print("for (i in 5 downTo 1) print(i) = ")
        for (i in 5 downTo 1) print(i)
        println()
        print("for (i in 5 downTo 2) print(i) = ")
        for (i in 5 downTo 2) print(i)
        println()
        print("for (i in 1..5 step 2) print(i) = ")
        for (i in 1..5 step 2) print(i)
        println()
        print("for (i in 5 downTo 1 step 2) print(i) = ")
        for (i in 5 downTo 1 step 2) print(i)
    }

    fun kotlinWhileLoop() {
        println("============while Loop============")
        var i = 1
        while (i <= 5) {
            println(i)
            i++
        }
        println("============Infinite while Loop============")
        while (true) {
            println("infinite loop")
        }
    }

    fun kotlinDoWhileLoop() {
        println("============do -while loop============")
        var i = 1
        do {
            println(i)
            i++
        } while (i <= 5)
        println("============do -while loop even condition of while if false============")
        var ii = 6
        do {
            println(ii)
            ii++
        } while (ii <= 5)
    }

    fun kotlinReturnAndJump() {
        /* There are three jump expressions in Kotlin. 1.break,2.continue,3.return */
        println("============Break Expression============")
        for (i in 1..5) {
            if (i == 3) {
                break
            }
            println(i)
        }
        println("============Labeled break Expression============")
        loop@ for (i in 1..3) {
            for (j in 1..3) {
                println("i = $i and j = $j")
                if (i == 2)
                    break@loop
            }
        }
        println("============continue Jump Structure============")
        for (i in 1..3) {
            println("i = $i")
            if (i == 2) {
                continue
            }
            println("this is below if")
        }
        println("============Labeled continue Expression============")
        labelname@ for (i in 1..3) {
            for (j in 1..3) {
                println("i = $i and j = $j")
                if (i == 2) {
                    continue@labelname
                }
                println("this is below if")
            }
        }
    }
}