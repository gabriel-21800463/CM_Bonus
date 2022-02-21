package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta (identificador: String): Veiculo(identificador), Movimentavel {

    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Bicicleta | $identificador | data de aquisicao | Posicao | x:0 | y:0"
    }
}