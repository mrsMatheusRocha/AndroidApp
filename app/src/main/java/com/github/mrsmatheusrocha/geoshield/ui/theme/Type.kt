package com.github.mrsmatheusrocha.geoshield.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.github.mrsmatheusrocha.geoshield.R

val Teko = FontFamily(Font(R.font.teko_regular))
val Roboto = FontFamily(Font(R.font.roboto_regular))

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Teko,
        fontWeight = FontWeight.Bold,
        fontSize = 42.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)