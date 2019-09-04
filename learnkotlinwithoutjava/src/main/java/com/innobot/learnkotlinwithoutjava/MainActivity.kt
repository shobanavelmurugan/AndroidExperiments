package com.innobot.learnkotlinwithoutjava

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.innobot.learnkotlinwithoutjava.kotlinserious.AppConstants
// Using R.layout.activity_main from the 'main' source set
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Initializing an empty ArrayList to be filled with animals
    val animals: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Instead of findViewById<TextView>(R.id.textView)
        txtView.text = "Hello World!"
        hello.text = "Animal Adapter"
        // Instead of findViewById<TextView>(R.id.textView)
        txtFlower.text = "Flower Adapter"
        // Loads animals into the ArrayList
        addAnimals()
        // Creates a vertical Layout Manager
        recycleView_animal_list.layoutManager = GridLayoutManager(this, 3)
        recycleView_flower_list.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
//        rv_animal_list.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        recycleView_animal_list.adapter = AnimalAdapter(animals, this)
        recycleView_flower_list.adapter = FlowerAdapter(animals, this)
        AppConstants.NUMBER
    }

    private fun addAnimals() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")
    }
}
