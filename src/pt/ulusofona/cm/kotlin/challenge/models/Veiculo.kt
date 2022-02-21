package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

open abstract class Veiculo (val identificador: String): Movimentavel {

    var posicao: Posicao
    var dataDeAquisicao: Date

    init {
        this.posicao = Posicao(0,0)
        this.dataDeAquisicao = Date()
    }

    abstract fun requerCarta(): Boolean

    fun atualizaData() {
        this.dataDeAquisicao = Date()
    }

}