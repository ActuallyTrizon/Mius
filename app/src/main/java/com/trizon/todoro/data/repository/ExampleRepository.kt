package com.trizon.todoro.data.repository

import com.trizon.todoro.data.dao.ExampleDao
import com.trizon.todoro.data.model.ExampleModel
import com.trizon.todoro.data.model.Resource
import com.trizon.todoro.data.remote.AppApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleRepository @Inject constructor(
    private val appApi: AppApi,
    private val exampleDao: ExampleDao,
) {

    fun getExamples(): Flow<Resource<List<ExampleModel>>> = flow {
        emit(Resource.Loading)
        try {
            val response = appApi.getExampleResult()
            val body = response.body()
            if (response.isSuccessful && body != null) {
                emit(Resource.Success(body))
            } else {
                emit(Resource.Error("Request failed with code ${response.code()}"))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Unknown network error"))
        }
    }
}
