data class AlertaEvento(
    val id: String,
    val tipoAlerta: String,
    val nivelGravidade: Int, // 1 a 5
    val dataEmissao: String,
    val regiao: Regiao,
    var resolvido: Boolean = false
)