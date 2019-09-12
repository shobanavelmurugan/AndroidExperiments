package com.innobot.learnkotlinwithoutjava.basicsyntax

/**
 * Created by innobot-linux-7 on 12/9/19,12,Experiment.
 */
class KotlinFunctions {
    /* functions are declared using fun keyword. There are two types of functions depending on whether it is available in standard library or defined by user.
        1.Standard library function 2.User defined function*/
    /* 1.Standard Function*/
    fun KotlinStandardFunction() {
        //Standard Function
        var number = 25
        var result = Math.sqrt(number.toDouble())
        println("Standard Function:Square root of $number is $result")
        //User Defined Function
        KotlinUserDefined()
    }

    /* 2.User defined Function*/
    fun KotlinUserDefined() {
        var num1 = 5
        var num2 = 6
        println("sum = " + (num1 + num2))
        functionReturntype1(5, 6)
        functionReturntype2(5, 6)
    }

    fun functionReturntype1(number1: Int, number2: Int) {
        println("User defined Function:sum = " + (number1 + number2))
    }

    fun functionReturntype2(number1: Int, number2: Int): Int {
        val add = number1 + number2
        println("User defined Function:sum =  $add")
        return add
    }

    /*Recursion Function*/
    fun KotlinRecursionFunction() {
        //1
        RecursionFunction()
        //2
        val number = 5
        var result: Long
        result = RecursionFactorial1(number)
        println("RecursionFactorial1 of $number = $result")
        //3 Tail Recursion
        val number1 = 100000.toLong()
        val result1 = recursiveSum(number1)
        println("sun of upto $number1 number = $result1")
        //4 Tail Recursion factorial
        result = factorial(number)
        println("Factorial of $number = $result")
    }

    fun RecursionFunction() {
        var count = 0
        count++
        if (count <= 5) {
            println("hello " + count)
            RecursionFunction()
        }
    }

    fun RecursionFactorial1(n: Int): Long {
        return if (n == 1) {
            n.toLong()
        } else {
            n * RecursionFactorial1(n - 1)
        }
    }

    tailrec fun recursiveSum(n: Long, semiresult: Long = 0): Long {
        return if (n <= 0) {
            semiresult
        } else {
            recursiveSum((n - 1), n + semiresult)
        }
    }

    tailrec fun factorial(n: Int, run: Int = 1): Long {
        return if (n == 1) {
            run.toLong()
        } else {
            factorial(n - 1, run * n)
        }
    }

    /*Default and Named Function*/
    fun KotlinDefaultAndNamedFunction() {
        /* Type Default */
        DNFType1()
        DNFType1(3)
        DNFType1(3, 'a')
        /* Type Named */
        DNFType1(latter = 'a')
    }

    fun DNFType1(num: Int = 5, latter: Char = 'x') {
        print("parameter in function definition $num and $latter")
    }

    fun KotlinLambdaAndHighOrderFunction() {
        /* Lambda Function*/
        val myLambda: (Int) -> Unit = { s: Int -> println(s) } //lambda function
        addNumber(5, 10, myLambda)
        /* Higher Order Function */
        val fn: (String, String) -> String = { org, portal -> "$org develop $portal" }
        myFun("sssit.org", "javatpoint.com", fn)
    }

    fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit) {   //high level function lambda as parameter
        val add = a + b
        mylambda(add) // println(add)
    }

    fun myFun(org: String, portal: String, fn: (String, String) -> String): Unit {
        val result = fn(org, portal)
        println(result)
    }

    /* An inline function is declare with a keyword inline
    * The virtual function or local function cannot be declared as inline. Following are some expressions and declarations which are not supported
    * anywhere inside the inline functions:1.Declaration of local classes,2.Declaration of inner nested classes,3.Function expressions,
    * 4.Declarations of local function,5.Default value for optional parameters*/
    fun KotlinInlineFunction() {
        inlineFunction({ println("calling inline functions") })
        //Non local control flow
        inlineFunction({
            println("calling inline functions")
            return
        }, { println("next parameter in inline functions") })
        //noinline modifier
        inlineFunctionExample({ println("calling inline functions") },
                { println("next parameter in inline functions") })

        println("this is main function closing")
    }

    inline fun inlineFunction(myFun: () -> Unit) {
        myFun()
        print("code inside inline function")
    }

    inline fun inlineFunction(myFun: () -> Unit, nxtFun: () -> Unit) {
        myFun()
        nxtFun()
        print("code inside inline function")
    }

    inline fun inlineFunctionExample(myFun: () -> Unit, noinline nxtFun: () -> Unit) {
        myFun()
        nxtFun()
        println("code inside inline function")
    }
}