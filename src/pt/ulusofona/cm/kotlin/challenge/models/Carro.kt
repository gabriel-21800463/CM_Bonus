package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import java.text.SimpleDateFormat

class Carro (identificador: String, var motor: Motor): Veiculo(identificador), Ligavel {

    override fun ligar() {
        motor.ligar()
    }

    override fun desligar() {
        motor.desligar()
    }

    override fun estaLigado(): Boolean {
        return motor.estaLigado()
    }

    override fun requerCarta(): Boolean {
        return true
    }

    @Throws(AlterarPosicaoException::class)
    override fun moverPara(x: Int, y: Int) {
        if(!motor.estaLigado()){
            motor.ligar()
        }
        posicao.alterarPosicaoPara(x, y)
        motor.desligar()
    }

    override fun toString(): String {
        val formatter = SimpleDateFormat("dd-MM-yyyy")
        val dataAquisicao = formatter.format(dataDeAquisicao)
        return "Carro | ${this.identificador} | $dataAquisicao | Posicao | x:${this.posicao.x} | y:${this.posicao.y}"
    }
}