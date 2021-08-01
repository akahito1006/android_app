package com.example.myexperimentalapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Kotlin内で要素のテキストを変更するコード
        val textView: TextView = findViewById(R.id.textArea)
        textView.text = "modified text"

//        javaに引数を渡して、java経由でテキストを変更するコード
        textView.text = SubComponent.javaModified("this works fine!")

//        Kotlinで定義した変数をjavaに渡してテキストを変更するコード
        val otherTextView: TextView = findViewById(R.id.targetNumber)
        val kotNumber: Int = 1980
        val kotString: String = kotNumber.toString()
        otherTextView.text = SubComponent.javaModified(kotString)

//        ほかの要素のテキストを取得して、代入する。写す
        val rightTextView: TextView = findViewById(R.id.targetNumber2)
        otherTextView.text = rightTextView.text

    }
}