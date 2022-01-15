package com.prachi.assignmentsunstone.local.interfaces

import com.prachi.assignmentsunstone.constants.Extras.API_KEY
import com.prachi.assignmentsunstone.local.responses.ResponseModel
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface APIClient {


    @Headers("Authorization: $API_KEY")
    @GET("search")
    suspend fun getResponseFromAPI(
        @Query("query") query: String
    ): ResponseModel


}