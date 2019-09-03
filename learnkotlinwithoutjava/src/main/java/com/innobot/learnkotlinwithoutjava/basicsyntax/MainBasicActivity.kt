package com.innobot.learnkotlinwithoutjava.basicsyntax

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.innobot.learnkotlinwithoutjava.R

/**
 * Created by innobot-linux-7 on 30/8/19,30,Experiment.
 */
class MainBasicActivity : AppCompatActivity() {

    val sample = 20
    var sample1 = 21
    var TAG: String = "MainBasicActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        InitFunctions()
        InitVariables()
        Log.d(TAG, "--------Variable Global---Init---" + sample)
        sample
        Log.d(TAG, "-----Variable Global---Init-----" + sample1++)
    }

    private fun InitVariables() {
        localVariables()
    }

    private fun localVariables() {
        val a = 1  // immediate assignment
        val b = 2   // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided
        c = 3       // deferred assignment
        println("----Local Variable-----------a = " + a + ", b = " + b + ", c = " + c)
        Log.d(TAG, "-----Local Variable---------" + "a = $a, b = $b, c = $c")
    }

    private fun InitFunctions() {
        /* 1. Function*/
        Log.d(TAG, "-----Function---Sum---------" + sum(10, 100))
        /* 2. Function Experession*/
        Log.d(TAG, "----Function---------sumExperession----- " + sumExperession(19, 23))
        /*Unit return type can be omitted:*/
        Log.d(TAG, "----Function-------------Reduntdant Unit----------- " + printSum(-1, 8))

    }

    /*  with Int return type:*/
    private fun sum(val1: Int, val2: Int): Int {
        return val1 + val2
    }

    fun sumExperession(a: Int, b: Int) = a + b
    fun printSum(a: Int, b: Int) {
        println("--------------------sum of $a and $b is ${a + b}")
    }
}