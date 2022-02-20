package pt.ulusofona.cm.kotlin.challenge.models

open class Posicao (val x: Int, val y: Int){

    fun alterarPosicaoPara(x: Int,y: Int){}

    override fun toString(): String {
        return "Posicao | x:$x | y:$y)"
    }

}