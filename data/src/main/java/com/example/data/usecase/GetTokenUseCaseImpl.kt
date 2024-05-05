package com.example.data.usecase

import com.example.domain.usecase.login.GetTokenUseCase
import javax.inject.Inject

class GetTokenUseCaseImpl @Inject constructor(): GetTokenUseCase {

    override suspend fun invoke(): String? {
        TODO("Not yet implemented")
    }
}