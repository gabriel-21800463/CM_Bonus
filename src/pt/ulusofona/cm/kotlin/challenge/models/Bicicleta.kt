package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import java.text.SimpleDateFormat

class Bicicleta (identificador: String): Veiculo(identificador){

    override fun requerCarta(): Boolean {
        return false
    }

    @Throws(AlterarPosicaoException::class)
    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }

    override fun toString(): String {
        val formatter = SimpleDateFormat("dd-MM-yyyy")
        val dataAquisicao = formatter.format(dataDeAquisicao)
        return "Bicicleta | $identificador | $dataAquisicao | Posicao | x:${posicao.x} | y:${posicao.y}"
    }
}