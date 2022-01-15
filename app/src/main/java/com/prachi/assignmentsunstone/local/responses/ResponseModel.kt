package com.prachi.assignmentsunstone.local.responses


import com.google.gson.annotations.SerializedName
import com.prachi.assignmentsunstone.local.responses.PhotoModel

data class ResponseModel(
    @SerializedName("next_page")
    val nextPage: String,
    @SerializedName("page")
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    @SerializedName("photos")
    val photoModels: List<PhotoModel>,
    @SerializedName("total_results")
    val totalResults: Int
)