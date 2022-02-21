package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor (val cavalos: Int, val cilindrada: Int): Ligavel{

    var ligado:Boolean = false

    override fun ligar() {
        if (this.ligado) {
            throw VeiculoLigadoException("!!!!")
        } else {
            this.ligado= true
        }
    }

    override fun desligar() {
        if (!this.ligado) {
            throw VeiculoDesligadoException("!!!")
        } else {
            this.ligado = false
        }
    }

    override fun estaLigado(): Boolean {
        return this.ligado
    }


    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }

}