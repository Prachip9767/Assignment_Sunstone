package com.prachi.assignmentsunstone.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.prachi.assignmentsunstone.local.responses.ResponseModel
import com.prachi.assignmentsunstone.local.Resource
import com.prachi.assignmentsunstone.repositories.BaseRepositories
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject


@HiltViewModel
class BaseViewModel @Inject constructor(private val baseRepositories: BaseRepositories) : ViewModel() {

    fun getResponseFromAPI(query: String): LiveData<Resource<ResponseModel>> {
        return liveData(Dispatchers.IO) {
            val response = baseRepositories.getResponseFromAPI(query)
            emit(response)
        }
    }
}