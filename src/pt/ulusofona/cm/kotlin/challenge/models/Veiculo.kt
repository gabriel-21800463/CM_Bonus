package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

open class Veiculo (val identificador: String): Movimentavel {

    public val posicao: Posicao = Posicao(0,0)
    public val dataDeAquisicao: Date = Date(2020,2,1)

    fun requerCarta(): Boolean{
        return false
    }

    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
    }

}