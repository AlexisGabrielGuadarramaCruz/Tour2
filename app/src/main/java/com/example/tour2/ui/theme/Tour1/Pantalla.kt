package com.example.tour2.ui.theme.Tour1


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Pantalla() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF264F4B)),   // fondo de toda la pantalla
        verticalArrangement = Arrangement.Center,
    ) {
        TourImagenes()                          // el carrusel
        Spacer(modifier = Modifier.height(0.dp))
        ControlesAudio()                       // los botones de audio
    }
}

