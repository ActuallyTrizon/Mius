package com.trizon.mius.domain.usecase

import com.trizon.mius.data.model.ExampleModel
import com.trizon.mius.data.model.Resource
import com.trizon.mius.data.repository.ExampleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Domain-layer use case that exposes the list of example items to the
 * presentation layer, keeping view models decoupled from [ExampleRepository].
 */
class GetExamplesUseCase @Inject constructor(
    private val exampleRepository: ExampleRepository,
) {
    operator fun invoke(): Flow<Resource<List<ExampleModel>>> = exampleRepository.getExamples()
}
