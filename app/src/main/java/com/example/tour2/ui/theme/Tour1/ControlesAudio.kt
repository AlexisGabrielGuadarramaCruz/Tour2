package com.example.tour2.ui.theme.Tour1

import android.media.MediaPlayer
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.tour2.R

@Composable
fun ControlesAudio() {
    val contexto = LocalContext.current

    val reproductor = remember {
        MediaPlayer.create(contexto, R.raw.hacienda).apply {
            setOnCompletionListener {
                seekTo(0)
            }
        }
    }

    var estado by remember { mutableStateOf("detenido") }

    DisposableEffect(key1 = Unit) {
        onDispose {
            reproductor.release()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF264F4B))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Audio: $estado")

        Spacer(modifier = Modifier.height(18.dp))

        Row(
            modifier = Modifier.height(50.dp)
        ) {

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = {
                    reproductor.pause()
                    estado = "pausado"
                }
            ) {
                Text("Pausa")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = {
                    reproductor.start()
                    estado = "reproduciendo"
                }
            ) {
                Text("Play")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = {
                    reproductor.pause()
                    estado = "detenido"
                }
            ) {
                Text("Detener")
            }
        }
    }
}
