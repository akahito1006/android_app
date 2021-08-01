package com.example.myexperimentalapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ほかの要素のテキストを取得して、代入する。写す
//        val rightTextView: TextView = findViewById(R.id.targetNumber2)
//        val otherTextView: TextView = findViewById(R.id.targetNumber)
//        otherTextView.text = rightTextView.text

//      初期化
        val answer: String = "100 bn."
        var value: Int = 1
        var mode: String = "bn."
//      bnがある場合、bnを消して、modeにbnを格納しておく
        if (answer.indexOf(" bn.") != -1) {
            value = answer.replace(" bn.", "").toInt()
            mode = " bn."
        }
//      値を代入したい要素をきめる
        val leftTextView: TextView = findViewById(R.id.targetNumber)
//      javaの関数を呼び出し、引数を渡す。
//        引数１：bnを取ったanswer
//        引数２：取り外したbn
//          説明・・・呼び出される関数は、さらにjava内で変数の受け渡しの都合から別の関数を利用しmodeを処理している。
        leftTextView.text = SubComponent.javaModified(value.toString(), mode)
    }
}