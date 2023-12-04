package com.example.approom

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.approom.controller.Contato
import com.example.approom.controller.ContatoAcoes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContatoTela(
    estado: Contato,
    evento: (ContatoAcoes) -> Unit
){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    evento(ContatoAcoes.VisualizarDialog)
                }
            ){
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Adicionar Contato"
                )
            }
        }
    ){_ ->

    }
}