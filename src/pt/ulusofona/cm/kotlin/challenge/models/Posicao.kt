package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

data class Posicao (var x: Int, var y: Int){

    fun alterarPosicaoPara(x: Int, y: Int) {
        if (this.x == x && this.y == y) {
            throw AlterarPosicaoException("O veiculo já está nessa posição")
        } else {
            this.x = x
            this.y = y
        }
    }

    override fun toString(): String {
        return "Posicao | x:${this.x} | y:${this.y}"
    }

}