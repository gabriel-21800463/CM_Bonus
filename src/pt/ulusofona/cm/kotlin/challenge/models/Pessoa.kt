package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa (val nome:String, val dataDeNascimento: Date, x: Int, y: Int): Posicao(x, y) {

    val veiculos:List<Veiculo>? = null
    val carta: Carta? = null
    val posicao: Posicao? = null

    fun comprarVeiculo( veiculo: Veiculo){}

    fun pesquisarVeiculo(indentificador: String): Veiculo {
        return Veiculo("A1")
    }

    fun venderVeiculo(indentificador: String, comprador: Pessoa){}

    fun moverVeiculoPara(identificador: String, x: Int, y:Int){}

    fun temCarta(): Boolean{
        return true
    }

    fun tirarCarta(){}


    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | Posicao | x:$x | y:$y"
    }


}