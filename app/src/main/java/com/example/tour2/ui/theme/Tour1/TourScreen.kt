package com.example.tour2.ui.theme.Tour1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tour2.R

@Composable
fun TourImagenes() {
    val fotos = listOf(
        R.drawable.tour1,
        R.drawable.tour2,
        R.drawable.tour3,
        R.drawable.tour4
    )

    val estadoPager = rememberPagerState(pageCount = { fotos.size })

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF264F4B)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(300.dp))

        HorizontalPager(
            state = estadoPager,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) { pagina ->
            Image(
                painter = painterResource(id = fotos[pagina]),
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                contentDescription = "Foto ${pagina + 1}"
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            ControlesAudio()
        }
    }
}