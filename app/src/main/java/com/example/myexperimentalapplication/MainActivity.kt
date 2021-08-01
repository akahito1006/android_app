package com.example.myexperimentalapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textArea)

//        ほかの要素のテキストを取得して、代入する。写す
//        val rightTextView: TextView = findViewById(R.id.targetNumber2)
//        val otherTextView: TextView = findViewById(R.id.targetNumber)
//        otherTextView.text = rightTextView.text

//      初期化
        val answer: String = "100 bn."
        var value: Int = 1
        var mode: String = "bn."
//      bnがある場合、bnを消して、modeにbnを格納しておく
//        ------ここを使う-----
        if (answer.indexOf(" bn.") != -1) {
            value = answer.replace(" bn.", "").toInt()
            mode = " bn."
        }
//        -------------------
//      値を代入したい要素をきめる
        val leftTextView: TextView = findViewById(R.id.targetNumber)
//      javaの関数を呼び出し、引数を渡す。
//        引数１：bnを取ったanswer
//        引数２：取り外したbn
//          説明・・・呼び出される関数は、さらにjava内で変数の受け渡しの都合から別の関数を利用しmodeを処理している。
        leftTextView.text = SubComponent.javaModified(value.toString(), mode)

//      -----カンマを付けるアルゴリズムの修正コード-----
//      javaのFloatは数字でない文字を無視して型変換する。KotlinのtoFloatは無視できない
//      命名数を含む文字（1,000 bn.）
        val stringNumber: String = "1,000 bn."
//        val floatNumber: Float = stringNumber.toFloat()
//        -> java.lang.NumberFormatException: For input string: "1,000 bn."
//        -> 解決策: 型の変換が起きる直前に、正規表現でIntを抽出する
            val intStr: String = stringNumber.replace("[^0-9]".toRegex(), "")
        val floatNumber: Float = intStr.toFloat()

        textView.text = floatNumber.toString()
    }
}