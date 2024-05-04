package com.example.domain.usecase.login

interface SignUpUseCase {

    suspend operator fun invoke(
        id: String,
        username: String,
        password: String
    ): Result<Boolean> // 회원가입 성공 여부
}