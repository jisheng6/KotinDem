package com.example.adminjs.kotlinddemo

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET

/**
 * Created by Adminjs on 2017/12/14.
 */
interface IService {
    @GET("/comic/book?key=f54c4c57143b8fad9bf3193cab52a81c")
    fun getData() : Observable<ResponseBody>
}