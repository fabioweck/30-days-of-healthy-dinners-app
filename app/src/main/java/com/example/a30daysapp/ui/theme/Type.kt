package com.example.a30daysapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a30daysapp.R

val RobotoSerif = FontFamily(
//    Font(R.font.robotoserif_black),
//    Font(R.font.robotoserif_blackitalic),
//    Font(R.font.robotoserif_bold),
//    Font(R.font.robotoserif_extrabold),
//    Font(R.font.robotoserif_bolditalic),
//    Font(R.font.robotoserif_extrabolditalic),
//    Font(R.font.robotoserif_extralight),
//    Font(R.font.robotoserif_extralightitalic),
//    Font(R.font.robotoserif_italic),
//    Font(R.font.robotoserif_light),
//    Font(R.font.robotoserif_lightitalic),
//    Font(R.font.robotoserif_medium),
//    Font(R.font.robotoserif_mediumitalic),
    Font(R.font.robotoserif_regular),
    Font(R.font.robotoserif_semibold, FontWeight.SemiBold),
    Font(R.font.robotoserif_semibolditalic, FontWeight.SemiBold),
//    Font(R.font.robotoserif_thin),
//    Font(R.font.robotoserif_thinitalic),
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = RobotoSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = RobotoSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelLarge = TextStyle(
        fontFamily = RobotoSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    labelMedium = TextStyle(
        fontFamily = RobotoSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = RobotoSerif,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        fontSize = 20.sp
    ),
)