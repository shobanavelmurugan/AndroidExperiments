package com.innobot.learnkotlinwithoutjava.activity

// Using R.layout.activity_main from the 'main' source set
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.innobot.learnkotlinwithoutjava.R
import com.innobot.learnkotlinwithoutjava.adapter.BasicSyntaxAdapter
import kotlinx.android.extensions.CacheImplementation
import kotlinx.android.extensions.ContainerOptions
import kotlinx.android.synthetic.main.activity_basic.*

@ContainerOptions(CacheImplementation.SPARSE_ARRAY)
class MainBasicActivity : AppCompatActivity() {
    // Initializing an empty ArrayList to be filled with animals
    val animals: ArrayList<String> = ArrayList() // static Array List
    var basicSyntax: ArrayList<String> = ArrayList()

    var isShowList: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        InitViews()
    }

    private fun InitViews() {
        loadBasicsList()
        //get string from resource file
        //txtView.text = getString(R.string.kt_variables)
        // Button set on Click Listener
        btnShowList.setOnClickListener {
            if (isShowList) {
                isShowList = false
                //View Visibility and Hide
                recycleView_basic_syntax_list.visibility = View.GONE
            } else {
                isShowList = true
                recycleView_basic_syntax_list.visibility = View.VISIBLE
            }
        }
        // Creates a vertical Layout Manager
        recycleView_basic_syntax_list.layoutManager = LinearLayoutManager(this)
        // Access the RecyclerView Adapter and load the data into it
        recycleView_basic_syntax_list.adapter = BasicSyntaxAdapter(this, basicSyntax)
        recycleView_basic_syntax_list.addOnItemClickListener(object : OnItemClickListener {
            override fun onItemClicked(position: Int, view: View) {
                Toast.makeText(this@MainBasicActivity, "clicked on " + basicSyntax.get(position), Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun loadBasicsList() {
        basicSyntax.add(getString(R.string.kt_variables)) // or
        basicSyntax.add("Kotlin Variables")
    }
}

interface OnItemClickListener {
    fun onItemClicked(position: Int, view: View)
}

fun RecyclerView.addOnItemClickListener(onClickListener: OnItemClickListener) {
    this.addOnChildAttachStateChangeListener(object : RecyclerView.OnChildAttachStateChangeListener {
        override fun onChildViewDetachedFromWindow(view: View) {
            view.setOnClickListener(null)
        }

        override fun onChildViewAttachedToWindow(view: View) {
            view.setOnClickListener {
                val holder = getChildViewHolder(view)
                onClickListener.onItemClicked(holder.adapterPosition, view)
            }
        }
    })
}

