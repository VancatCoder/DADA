package com.scujcc.dada.function

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.scujcc.dada.R
import kotlinx.android.synthetic.main.search_activity.*

class SearchActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)

        buttonClick()
    }

    private fun buttonClick() {

        back.setOnClickListener { finish() }
        search.setOnClickListener { Toast.makeText(applicationContext,"搜索按钮", Toast.LENGTH_SHORT).show() }
    }
}
