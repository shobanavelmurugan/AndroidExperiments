package com.innobot.learnkotlinwithoutjava.oops

/**
 * Created by innobot-linux-7 on 12/9/19,12,Experiment.
 */
class KotlinClassesAndObjects {
    /*Kotlin Class
    Kotlin class is similar to Java class, a class is a blueprint for the objects which have common properties. Kotlin classes are declared using keyword
    class. Kotlin class has a class header which specifies its type parameters, constructor etc. and the class body which is surrounded by curly braces.
    class className constructor(){   // class header
    // property
    // member function
} */
    fun callClassAndObjects() {
        Account()
        var acc = Account()
        acc.insert(832345, "Ankit", 1000f) //accessing member function
        println("${acc.name}") //accessing class property
    }

    class Account {
        var acc_no: Int = 0
        var name: String? = null
        var amount: Float = 0f
        /*Kotlin Object
        Object is real time entity or may be a logical entity which has state and behavior. It has the characteristics:
        state: it represents value of an object.
        behavior: it represent the functionality of an object.*/
        fun insert(ac: Int, n: String, am: Float) {
            acc_no = ac
            name = n
            amount = am
            println("Account no: ${acc_no} holder :${name} amount :${amount}")
        }

        fun deposit() {
            //deposite code
        }

        fun withdraw() {
            // withdraw code
        }

        fun checkBalance() {
            //balance check code
        }

    }
}