package com.example.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val defaultTypography = androidx.compose.material3.Typography()
// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = defaultTypography.titleLarge,
    titleMedium = defaultTypography.titleMedium,
    titleSmall = defaultTypography.titleSmall,
    labelLarge = defaultTypography.labelLarge,
    labelMedium = defaultTypography.labelMedium,
    labelSmall = defaultTypography.labelSmall,
    bodyLarge = defaultTypography.bodyLarge,
    bodyMedium = defaultTypography.bodyMedium,
    bodySmall = defaultTypography.bodySmall,
    displayLarge = defaultTypography.displayLarge,
    displayMedium = defaultTypography.displayMedium,
    displaySmall = defaultTypography.displaySmall,
    headlineLarge = defaultTypography.headlineLarge,
    headlineMedium = defaultTypography.headlineMedium,
    headlineSmall = defaultTypography.headlineSmall,
)