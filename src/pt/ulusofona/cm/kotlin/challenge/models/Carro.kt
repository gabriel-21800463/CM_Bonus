package pt.ulusofona.cm.kotlin.challenge.models

class Carro (identificador: String, val motor: Motor): Veiculo(identificador) {

    override fun toString(): String {
        return "Carro | $identificador | data de aquisicao | Posicao | x:0 | y:0"
    }
}