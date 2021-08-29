package com.example.myexperimentalapplication

import okhttp3.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.http.*

// Serviceの準備
interface MyService {

    @GET("posts")
    fun getRawResponseForPosts(): Call<ResponseBody>

    @POST("post")
    fun postRawRequestForPosts(@Body body:RequestBody): Call<ResponseBody>

    @PUT("posts/{id}")
    fun putRawRequestForPosts(@Path("id") id:String, @Body body:RequestBody): Call<ResponseBody>

    @DELETE("posts/{id}")
    fun deletePathParam(@Path("id") id:String): Call<ResponseBody>

    // JSON文字列として取得するには、RequestBosyやResponseBodyはOKHttpで提供されているクラスを利用する
    // 戻り値はCall型にし、サーバーから受け取るデータの型をジェネリクスで指定する
}

// Retroクラスのインスタンス化
//      Retrofit本体
private val retrofit = Retrofit.Builder().apply {
    // baseUrlプロパティはokhttp3.HttpUrlでもOK
    baseUrl("http://10.0.2.2:3000/")
// buildメソッドを呼び出しインスタンスを取得する
}.build()
