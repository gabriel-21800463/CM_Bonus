package pt.ulusofona.cm.kotlin.challenge.models

open class Posicao (var x: Int= 0, var y: Int= 0){

    fun alterarPosicaoPara(x: Int,y: Int){}

    override fun toString(): String {
        return "Posicao | x:$x | y:$y)"
    }

}