package com.example.approom

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.approom.controller.Contato
import com.example.approom.controller.ContatoAcoes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdicionarDialog(
    modifier: Modifier = Modifier,
    estado: Contato,
    evento: (ContatoAcoes) -> Unit
){
    AlertDialog(
        modifier = modifier,
        onDismissRequest = {

        },
        title = { Text(text = "Adicionar Contato")},
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                TextField(
                    value = estado.nome,
                    onValueChange = {
                        evento(ContatoAcoes.SetNome(it))
                    },
                    placeholder = {
                        Text(text = "Nome")
                    }
                )
                TextField(
                    value = estado.sobrenome,
                    onValueChange = {
                        evento(ContatoAcoes.SetSobrenome(it))
                    },
                    placeholder = {
                        Text(text = "Sobrenome")
                    }
                )
                TextField(
                    value = estado.telefone,
                    onValueChange = {
                        evento(ContatoAcoes.SetTelefone(it))
                    },
                    placeholder = {
                        Text(text = "Telefone")
                    }
                )
            }
        },
        confirmButton = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.CenterEnd
            ){
                Button(
                    onClick = {
                        evento(ContatoAcoes.CadastrarContato)
                    }
                ) {
                    Text(text = "Cadastrar")
                }
            }
        }
    )
}