import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AlertDetailScreen(alertId: String?, onBack: () -> Unit) {
    val alerta = mockAlertas.find { it.id == alertId }
    var resolvido by remember { mutableStateOf(alerta?.resolvido ?: false) }

    Scaffold { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            alerta?.let {
                Text(text = "Detalhes: ${it.id}", style = MaterialTheme.typography.headlineLarge)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Tipo: ${it.tipoAlerta}", style = MaterialTheme.typography.bodyLarge)
                Text("Data de Emissão: ${it.dataEmissao}")
                Text("População Afetada: ${it.regiao.populacaoAfetada} pessoas")

                Spacer(modifier = Modifier.height(32.dp))

                // Interação: Agente resolvendo o alerta
                Button(
                    onClick = { resolvido = true },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = !resolvido
                ) {
                    val text = if (resolvido) "Alerta Mitigado" else "Dar Baixa (Confirmar Resolução)"
                    Text(
                        text = text,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedButton(onClick = onBack, modifier = Modifier.fillMaxWidth()) {
                    Text("Voltar", style = MaterialTheme.typography.bodyLarge,)
                }
            }
        }
    }
}