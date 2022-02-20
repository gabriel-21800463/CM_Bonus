package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

open class Veiculo (val identificador: String) {

    public val posicao: Posicao = Posicao(0,0)
    public val dataDeAquisicao: Date = Date(2020,2,1)

    fun requerCarta(): Boolean{
        return false
    }

}