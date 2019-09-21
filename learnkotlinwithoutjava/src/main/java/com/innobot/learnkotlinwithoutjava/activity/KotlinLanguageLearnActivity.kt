package com.innobot.learnkotlinwithoutjava.activity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.view.View
import com.innobot.learnkotlinwithoutjava.R
import com.innobot.learnkotlinwithoutjava.adapter.BasicSyntaxAdapter
import com.innobot.learnkotlinwithoutjava.kotlinlang.BasicSyntax
import com.innobot.learnkotlinwithoutjava.kotlinlang.Idioms
import kotlinx.android.synthetic.main.activity_basic.*

class KotlinLanguageLearnActivity : AppCompatActivity() {
    // Initializing an empty ArrayList to be filled with animals
    var basicSyntax: ArrayList<String> = ArrayList()// static Array List

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_language_learn)
        InitViews()
        /*Basic Syntax*/

    }

    private fun InitViews() {
        loadBasicsList()
        // Creates a vertical Layout Manager
        recycleView_basic_syntax_list.layoutManager = GridLayoutManager(this, 2)
        // Access the RecyclerView Adapter and load the data into it
        recycleView_basic_syntax_list.adapter = BasicSyntaxAdapter(this, basicSyntax)
        recycleView_basic_syntax_list.addOnItemClickListener(object : OnItemClickListener {
            override fun onItemClicked(position: Int, view: View) {
                validateList(position, view)
            }
        })
    }

    private fun loadBasicsList() {
        /*  Add Values to ArrayList*/
        basicSyntax.add("Kotlin Basic Syntax")
        basicSyntax.add("Kotlin Idioms")
    }

    private fun validateList(position: Int, view: View) {
        if (position == 0) {
            BasicSyntax().BasicSyntax()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 1) {
            Idioms().kotlinKcollection()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
    }
}
