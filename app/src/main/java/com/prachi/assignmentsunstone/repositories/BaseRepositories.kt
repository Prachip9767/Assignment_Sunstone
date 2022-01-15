package com.prachi.assignmentsunstone.repositories

import com.prachi.assignmentsunstone.local.Resource
import com.prachi.assignmentsunstone.local.ResponseHandler
import com.prachi.assignmentsunstone.local.interfaces.APIClient
import com.prachi.assignmentsunstone.local.responses.ResponseModel
import javax.inject.Inject

class BaseRepositories @Inject constructor(private val apiClient: APIClient) {

    private val responseHandler = ResponseHandler()

    suspend fun getResponseFromAPI(query: String): Resource<ResponseModel> {
        val response = apiClient.getResponseFromAPI(query)
        return try {
            responseHandler.handleSuccess(response)
        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }
}