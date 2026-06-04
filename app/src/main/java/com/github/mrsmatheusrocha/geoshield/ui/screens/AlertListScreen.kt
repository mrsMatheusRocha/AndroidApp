import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun AlertListScreen(onNavigateToDetail: (String) -> Unit) {
    // Estado interativo (Filtro)
    var apenasGraves by remember { mutableStateOf(false) }

    val alertasExibidos = if (apenasGraves) {
        mockAlertas.filter { it.nivelGravidade >= 4 }
    } else {
        mockAlertas
    }

    Scaffold() { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Alertas Ativos", style = MaterialTheme.typography.headlineLarge)
                // Botão de filtro (Interação)
                FilterChip(
                    selected = apenasGraves,
                    onClick = { apenasGraves = !apenasGraves },
                    label = {
                        Text(
                            "Alta Gravidade",
                            style = MaterialTheme.typography.bodyLarge,
                        )
                    }
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {
                items(alertasExibidos) { alerta ->
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp).clickable {
                            onNavigateToDetail(alerta.id)
                        },
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(text = alerta.tipoAlerta, fontWeight = FontWeight.Bold)
                            Text(text = "Região: ${alerta.regiao.nomeRisco}")
                            Text(text = "Gravidade: Nível ${alerta.nivelGravidade}", color = Color.Red)
                        }
                    }
                }
            }
        }
    }
}