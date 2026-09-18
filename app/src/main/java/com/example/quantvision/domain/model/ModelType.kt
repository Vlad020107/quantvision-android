package com.example.quantvision.domain.model

enum class ModelType(
    val displayName: String,
    val description: String
) {
    FLOAT_32(
        displayName = "Float32",
        description = "Исходная модель с полной точностью"
    ),
    FLOAT_16(
        displayName = "Float16",
        description = "Модель с весами половинной точности"
    ),
    INT_8(
        displayName = "Int8",
        description = "Квантованная 8-битная модель"
    )
}