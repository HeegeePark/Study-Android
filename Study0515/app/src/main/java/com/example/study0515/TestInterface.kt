package com.example.study0515

import retrofit2.Call
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface TestInterface {


    //Observable 사용
    //장점 : Callback를 신경쓰지 않아도 된다 && 비즈니스로직과 프로그래밍을 분리
    @GET("/")
    fun getGithub() : Observable<Github>

//    //Call 방법 사용
//    @GET("/user/{user}")
//    fun loadChance(@Query("q") status:String):
//            Call<List<Github>>


}