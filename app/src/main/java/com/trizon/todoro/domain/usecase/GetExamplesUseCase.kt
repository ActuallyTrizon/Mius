package com.trizon.todoro.domain.usecase

import com.trizon.todoro.data.model.ExampleModel
import com.trizon.todoro.data.model.Resource
import com.trizon.todoro.data.repository.ExampleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetExamplesUseCase @Inject constructor(
    private val exampleRepository: ExampleRepository,
) {
    operator fun invoke(): Flow<Resource<List<ExampleModel>>> = exampleRepository.getExamples()
}
