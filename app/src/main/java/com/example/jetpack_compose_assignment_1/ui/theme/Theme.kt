package com.example.jetpack_compose_assignment_1.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF1565C0), // PrimaryColor
    secondary = Color(0xFF90CAF9), // SecondaryColor
    surface = Color(0xFFE3F2FD), // CardColor
    onPrimary = Color.White,
    onSecondary = Color(0xFF546E7A), // TextSecondary
    onSurface = Color(0xFF0D47A1), // TextPrimary
    onBackground = Color(0xFF546E7A), // TextSecondary
    background = Color(0xFFE3ECF5) // Light background for Scaffold
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF1565C0),
    secondary = Color(0xFF90CAF9),
    surface = Color(0xFFE3F2FD),
    onPrimary = Color.White,
    onSecondary = Color(0xFF546E7A),
    onSurface = Color(0xFF0D47A1),
    onBackground = Color(0xFF546E7A),
    background = Color(0xFF1C2526) // Darker background
)

@Composable
fun jetpackcomposeassignment1Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = MaterialTheme.typography,
        content = content
    )
}