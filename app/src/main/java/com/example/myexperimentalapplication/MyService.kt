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

// => MainActivity.ktへ