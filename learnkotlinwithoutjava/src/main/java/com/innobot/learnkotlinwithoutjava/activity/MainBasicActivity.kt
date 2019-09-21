package com.innobot.learnkotlinwithoutjava.activity

// Using R.layout.activity_main from the 'main' source set
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.innobot.learnkotlinwithoutjava.R
import com.innobot.learnkotlinwithoutjava.adapter.BasicSyntaxAdapter
import com.innobot.learnkotlinwithoutjava.basicsyntax.KotlinBasicSyntax
import com.innobot.learnkotlinwithoutjava.basicsyntax.KotlinControlFlow
import com.innobot.learnkotlinwithoutjava.basicsyntax.KotlinFunctions
import kotlinx.android.extensions.CacheImplementation
import kotlinx.android.extensions.ContainerOptions
import kotlinx.android.synthetic.main.activity_basic.*

@ContainerOptions(CacheImplementation.SPARSE_ARRAY)
class MainBasicActivity : AppCompatActivity() {
    // Initializing an empty ArrayList to be filled with animals
    var basicSyntax: ArrayList<String> = ArrayList()// static Array List

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
                validateList(position, view)
            }
        })
        btnKotlinLang.setOnClickListener {
            val intent = Intent(this, KotlinLanguageLearnActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validateList(position: Int, view: View) {
        if (position == 0) {
            KotlinBasicSyntax().kotlinDataTypeSample()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 1) {
            KotlinBasicSyntax().kotlinVariableSample()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 2) {
            KotlinBasicSyntax().kotlinTypeConversion()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 3) {
            KotlinBasicSyntax().kotlinOperators()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 4) {
            KotlinBasicSyntax().kotlinInputOutput()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 5) {
            KotlinBasicSyntax().kotlinComment()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 6) {
            KotlinControlFlow().kotlinIfExpression()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 7) {
            KotlinControlFlow().kotlinWhenExpression()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 8) {
            KotlinControlFlow().kotlinForLoop()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 9) {
            KotlinControlFlow().kotlinWhileLoop()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 10) {
            KotlinControlFlow().kotlinDoWhileLoop()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 11) {
            KotlinControlFlow().kotlinReturnAndJump()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 12) {
            KotlinFunctions().KotlinStandardFunction()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 13) {
            KotlinFunctions().KotlinRecursionFunction()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 14) {
            KotlinFunctions().KotlinDefaultAndNamedFunction()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 15) {
            KotlinFunctions().KotlinLambdaAndHighOrderFunction()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
        if (position == 16) {
            KotlinFunctions().KotlinInlineFunction()
            Snackbar.make(view, basicSyntax.get(position) + " See Logcat", Snackbar.LENGTH_LONG).show()
        }
    }

    private fun loadBasicsList() {
        /*  Add Values to ArrayList*/
        basicSyntax.add("Kotlin Data Types")
        basicSyntax.add(getString(R.string.kt_variables)) // or
        basicSyntax.add(getString(R.string.kt_typeConvertion))
        basicSyntax.add(getString(R.string.kt_operators))
        basicSyntax.add(getString(R.string.kt_input_output))
        basicSyntax.add(getString(R.string.kt_comment))
        basicSyntax.add(getString(R.string.kt_if_expression))
        basicSyntax.add(getString(R.string.kt_when_expression))
        basicSyntax.add(getString(R.string.kt_for_loop))
        basicSyntax.add(getString(R.string.kt_while_loop))
        basicSyntax.add(getString(R.string.kt_do_while_loop))
        basicSyntax.add(getString(R.string.kt_return))
        basicSyntax.add(getString(R.string.kt_function))
        basicSyntax.add(getString(R.string.kt_function_rec))
        basicSyntax.add(getString(R.string.kt_function_default_named))
        basicSyntax.add(getString(R.string.kt_lambda_order_fun))
        basicSyntax.add(getString(R.string.kt_inline_function))
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

