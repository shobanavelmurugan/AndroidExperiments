package com.innobot.learnkotlinwithoutjava.basicsyntax

/**
 * Created by innobot-linux-7 on 3/9/19,03,Experiment.
 */
/*
var (Mutable variable): We can change the value of variable declared using var keyword later in the program.
val (Immutable variable): We cannot change the value of variable which is declared using val keyword.*/
class KotlinVariables {
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
    fun variableSample() {
        //salary = 40000 // not execute  change to var
        salary1 = 30001// excecute
        println("salary of salary1 $salary1")
        println("Your Int Value is $a")
        println("Your Double  Value is $d")
        println("Your Float Value is $f")
        println("Your Long Value is $l")
        println("Your Short Value is $s")
        println("Your Byte Value is $b")
    }


}