package pt.ulusofona.cm.kotlin.challenge.models

class Bicicleta (identificador: String): Veiculo(identificador) {

    override fun toString(): String {
        return "Bicicleta | $identificador | data de aquisicao | Posicao | x:0 | y:0"
    }
}