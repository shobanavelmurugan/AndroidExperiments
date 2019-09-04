package com.innobot.learnkotlinwithoutjava.basicsyntax

/**
 * Created by innobot-linux-7 on 3/9/19,03,Experiment.
 */
class KotlinBasicSyntax {
    //Variables
    var language = "Java"
    val salary = 30000
    var salary1 = 30000
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1
    val value1 = 'A' //or
    val flag = true
    val id = arrayOf(1, 2, 3, 4, 5)
    val asc = Array(5, { i -> i * 2 }) //asc[0,2,4,6,8]
    val text = "Hello, JavaTpoint"
    val text1 = "Hello, \tJavaTpoint" //or
    val text2 = "Hello, JavaT\bpoint\n" //or
    val text3 = "Hello, \nJavaTpoint"
    val text4 = """  
             Welcome   
                 To  
           JavaTpoint  
    """
    var convertionVal = 10

    fun kotlinVariableSample() {
        /*
        var (Mutable variable): We can change the value of variable declared using var keyword later in the program.
        val (Immutable variable): We cannot change the value of variable which is declared using val keyword.*/
        //salary = 40000 // not execute  change to var
        salary1 = 30001// excecute
        println("===========Variables=============")
        println("Language is $language")
        println("salary is $salary")
        println("salary updated is $salary1")
    }

    fun kotlinDataTypeSample() {
        /*   Kotlin built in data type are categorized as following different categories:
         1.Number,2.Character,3.Boolean,4.Array,5.String */
        println("===========Data Types======Number=======")
        println("Your Int Value is $a")
        println("Your Double  Value is $d")
        println("Your Float Value is $f")
        println("Your Long Value is $l")
        println("Your Short Value is $s")
        println("Your Byte Value is $b")
        println("===========Data Types======Character=======")
        val value2: Char
        value2 = 'A'
        println("Your Char Value is $value2")
        println("===========Data Types======Boolean=======")
        println("Your boolean Value is $flag")
        println("===========Data Types======Array=======")
        println("library function arrayOf() First Value is " + id[0])
        println("library function arrayOf() Last Value is " + id[id.size - 1])
        println("using Array() constructor " + asc)
        /*  Escaped String: Escape String is declared within double quote (" ") and
       may contain escape characters like '\n', '\t', '\b' etc*/
        println("===========Data Types======String=======")
        println("Your String Value text is $text")
        println("Your Escaped String Value text1 is $text1")
        println("Your Escaped String Value text2 is $text2")
        println("Your Escaped String Value text3 is $text3")
        /*  Raw String: Row String is declared within triple quote (""" """). It provides facility to declare String in new lines
        and contain multiple lines. Row String cannot contain any escape character.*/
        println("Your Raw String Value text4 is $text4")
    }

    fun kotlinTypeConversion() {
        /*  However in Kotlin, conversion is done by explicit in which smaller data type is converted into
         larger data type and vice-versa. This is done by using helper function.
         val value2: Long = convertionVal  //Compile error, type mismatch  */
        println("Convertion var to Long Value is ${convertionVal.toLong()}")
        println("Convertion var to Byte Value is ${convertionVal.toByte()}")
        println("Convertion var to Short Value is ${convertionVal.toShort()}")
        println("Convertion var to Int Value is ${convertionVal.toInt()}")
        println("Convertion var to Float Value is ${convertionVal.toFloat()}")
        println("Convertion var to Double Value is ${convertionVal.toDouble()}")
        println("Convertion var to Char Value is ${convertionVal.toChar()}")
    }

    fun kotlinOperators() {
        /* Operators are special characters which perform operation on operands (values or variable).
        There are various kind of operators available in Kotlin.
        1.Arithmetic operator,2.Relation operator,3.Assignment operator,4.Unary operator,5.Bitwise operation,6.Logical operator*/
        var a = 10
        var b = 5
        println("=========1.Arithmetic operator=======")
        println("Addition Value is ${a + b}")
        println("Subtraction Value is ${a - b}")
        println("Multiply Value is ${a * b}")
        println("Division Value is ${a / b}")
        println("Modulus Value is ${a % b}")
        println("=========2.Relation operator=======")
        val maxval = if (a > b) {
            println("a is greater than b.")
        } else if (a < b) {
            println("a is Less than b.")
        } else if (a >= b) {
            println("a is greater than or equal to b.")
        } else if (a <= b) {
            println("a is Less than or equal to b.")
        } else if (a == b) {
            println("a equal to b.")
        } else if (a != b) {
            println("a is not equal to b")
        } else {
        }
        println("max = $maxval")
        println("=========3.Assignment operator=======")
        a += b
        println("add and assign a+=b :" + a)
        a -= b
        println("subtract and assign a-=b :" + a)
        a *= b
        println("multiply and assign a*=b :" + a)
        a /= b
        println("divide and assign a/=b :" + a)
        a %= b
        println("mod and assign a%=b :" + a)
        println("=========4.Unary operator=======")
        var flag = true
        println("unary plus +a :" + +a)
        println("unary minus -b :" + -b)
        println("increment by 1 ++a :" + ++a)
        println("decrement by 1 --b :" + --b)
        println("!flag :" + !flag)
        println("=========5.Logical operator=======")
        var aa = 10
        var bb = 5
        var cc = 15
        var result: Boolean
        result = (aa > bb) && (aa > cc)
        println("(aa>bb) && (aa>cc) :" + result)
        result = (aa > bb) || (aa > cc)
        println("(aa>bb) || (aa>cc) :" + result)
        result = !flag
        println("!flag :" + result)
        println("=========6.Bitwise operator=======")
        println("signed shift left a.shl(b): " + a.shl(b))
        println("signed shift right a.shr(b): " + a.shr(b))
        println("unsigned shift right a.ushr(b:) " + a.ushr(b))
        println("bitwise and a.and(b): " + a.and(b))
        println("bitwise or a.or(b): " + a.or(b))
        println("bitwise xor a.xor(b): " + a.xor(b))
        println("bitwise inverse a.inv(): " + a.inv())
    }

    fun kotlinInputOutput() {
        /* print(): print() method is used to print values provided inside the method "()".
         println(): println() method is used to print values provided inside the method "()" and moves cursor to the beginning of next line.*/
        println("=========Output=======")
        println("print() and println() methods: " + 10)
        println("print() and println() methods: Welcome to  JavaTpoint")
        print("print() and println() methods: " + 20)
        print("print() and println() methods: Hello")
        println("=========Input=======")
        println("Enter your name")
        val name = readLine()
        println("Enter your age")
        var age: Int = Integer.valueOf(readLine())
        println("Your name is $name and your age is $age")
    }

    fun kotlinComment() {
        /*  1. Single line comment. 2.Multi line comment.*/
        println("Single comment Hello World!")
        /* this statement
            is used
            for print */
        println("Single comment Hello World!")

    }
}