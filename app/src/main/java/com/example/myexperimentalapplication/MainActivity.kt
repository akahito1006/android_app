package com.example.myexperimentalapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
//
////-----------Retrofitの使い方---------
//// 参考；https://qiita.com/naoi/items/5036adc8d33638911deb
////        1. Serviceインターフェイスの定義；どのパスにどんなHTTPメソッドでアクセスするかを定義する
////        2. Retrofitクラスのインスタンス化；Builderクラスを通してインスタンスを取得する
////              インスタンス取得の際にベースとなるURLを設定する
////        3. RetrofitクラスからServiceインターフェイスの実装クラスを生成する
////          ------以下がonCreateの中------
////        4. Service（実装クラス）からCallクラスを取得する
////        5. CallクラスでHTTP通信を実行する
////----------------------------------
//
//    // MyService.ktより =>
//// 2.Retroクラスのインスタンス化
////      Retrofit本体
//    private val retrofit = Retrofit.Builder().apply {
//        // baseUrlプロパティはokhttp3.HttpUrlでもOK
//        baseUrl("http://10.0.2.2:3000/")
//// buildメソッドを呼び出しインスタンスを取得する
//    }.build()
//
//    // 3.Service（実装クラス）の取得
//// サービスクラスの実装オブジェクト取得
//    private val service = retrofit.create(MyService::class.java)
//
//
//    private val scope = CoroutineScope(Dispatchers.IO)
//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        fun onGetButtonClick(view: View) {
//        // 4. Callクラスの取得とHTTP通信
//            val get = service.getRawResponseForPosts()
//        // HTTP通信を行う2つのメソッドから選ぶ
//        // execute()；同期処理。ワーカスレッドで呼び出すことになる
//        // enqueue(Callback callback)；HTTP通信が終わった後の処理をCallbackクラスで渡す必要がある。コールバック内はMainスレッドで実行される
//        // 5. 今回は同期処理のため、取得したCallクラスのexecuteメソッドを呼び出す
//            scope.launch {
//                val responseBody = get.execute()
//                // レスポンスから文字列の取得
//                // 実行結果はokhttp3.RequestBodyで受け取るため、bodyメソッドでレスポンスの内容を取得する
//                // サイトにstringメソッドでJSON文字列を取得する
//                responseBody.body()?.let {
//                    myViewModel.result.postValue(it.string())
//                }
//            }
//        }
//
//
//
//        val textView: TextView = findViewById(R.id.textArea)
//
////        ほかの要素のテキストを取得して、代入する。写す
////        val rightTextView: TextView = findViewById(R.id.targetNumber2)
////        val otherTextView: TextView = findViewById(R.id.targetNumber)
////        otherTextView.text = rightTextView.text
//
////      初期化
//        val answer: String = "100 bn."
//        var value: Int = 1
//        var mode: String = "bn."
////      bnがある場合、bnを消して、modeにbnを格納しておく
////        ------ここを使う?-----
//        if (answer.indexOf(" bn.") != -1) {
//            value = answer.replace(" bn.", "").toInt()
//            mode = " bn."
//        }
////        -------------------
////      値を代入したい要素をきめる
//        val leftTextView: TextView = findViewById(R.id.targetNumber)
////      javaの関数を呼び出し、引数を渡す。
////        引数１：bnを取ったanswer
////        引数２：取り外したbn
////          説明・・・呼び出される関数は、さらにjava内で変数の受け渡しの都合から別の関数を利用しmodeを処理している。
//        leftTextView.text = SubComponent.javaModified(value.toString(), mode)
//
//
////      -----カンマを付けるアルゴリズムの修正コード-----
////      javaのFloatは数字でない文字を無視して型変換する。KotlinのtoFloatは無視できない
////      命名数を含む文字（1,000 bn.）
//        val originalValue: String = "12,345.67899 bn."
////        val floatNumber: Float = stringNumber.toFloat()
////        -> java.lang.NumberFormatException: For input string: "1,000 bn."
////        -> 解決策: 型の変換が起きる直前に、正規表現でIntを抽出する
//        val floatStr: String = originalValue.replace("[^0-9.]|[.]\$".toRegex(), "")
//        val floatNumber: Float = floatStr.toFloat()
////        -> さらに、含まれる文字（命名数）をmodeに格納しておく
//        mode = originalValue.replace("[^a-z]|[,]".toRegex(), "")
//
////      結論(update)：originalValueを変えずに、マイナス符号を除く文字列を取り除いてjavaに値を渡すには、
//        textView.text =
//            SubComponent.javaModified(
//                originalValue.replace("[^0-9.-]|[.]\$".toRegex(), "").toString(),
////                また、modeに命名数を渡す場合には、
//                originalValue.replace("[0-9,-]|[.]\\b".toRegex(), ""))
//
////      ★重要：modeの値に応じた別の処理を場合分けして行うには、
//        var mode_number: Int =
//            when (originalValue.replace("[0-9,-]|[.]\\b".toRegex(), "")) {
//                " mill." -> 0
//                " bn." -> 1
//                " trillion" -> 2
//                else -> 3
//            }
//
//        leftTextView.text = "MODE_NUMBER $mode_number"
//
//        val rightTextView: TextView = findViewById(R.id.targetNumber2)
//        rightTextView.text = originalValue
////        ------------------------------------------
//
//        SubComponent.makeArray(rightTextView)
//        SubComponent.makeArray(leftTextView)

//        for (item in list) {
//            item.text = "append some text"
//        }
    }

}