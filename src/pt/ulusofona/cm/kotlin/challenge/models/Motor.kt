package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor (val cavalos: Int, val cilindrada: Int): Ligavel{

    val ligado:Boolean = false
    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {
        TODO("Not yet implemented")
    }

    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }




}