package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

data class Pessoa (val nome:String, val dataDeNascimento: Date): Movimentavel {

    var veiculos: ArrayList<Veiculo> = ArrayList()
    var carta: Carta? = null
    var posicao: Posicao = Posicao(0,0)

    fun comprarVeiculo(veiculo: Veiculo) {
        veiculo.atualizaData()
        veiculos.add(veiculo)
    }

    init {
        veiculos = ArrayList()
    }

    @Throws(VeiculoNaoEncontradoException::class)
    fun pesquisarVeiculo(identificador: String): Veiculo {
        for (veiculo in veiculos) {
            if (veiculo.identificador.equals(identificador) ) {
                return veiculo
            }
        }
        return throw VeiculoNaoEncontradoException("!!!")
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa) {
        for (veiculo in veiculos) {
            if (veiculo.identificador.equals(identificador) ) {
                comprador.comprarVeiculo(veiculo)
                veiculos.remove(veiculo)
                break
            }
        }
    }

    @Throws(AlterarPosicaoException::class, PessoaSemCartaException::class)
    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {
        for (veiculo in veiculos) {
            if (veiculo.identificador.equals(identificador) ) {
                if (veiculo.requerCarta() && !temCarta()) {
                    throw PessoaSemCartaException("$nome não tem carta para conduzir o veículo indicado")
                }
                veiculo.moverPara(x, y)
                break
            }
        }
    }

    fun temCarta(): Boolean {

        if(carta == null){
            return false
        }
        return true
    }

    fun ligarCarro(carro:Carro){
        carro.motor.ligar()
    }
    fun desligaCarro(carro:Carro){
        carro.motor.desligar()
    }

    @Throws(MenorDeIdadeException::class)
    fun tirarCarta() {
        val dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val formatter = SimpleDateFormat("dd/MM/yyyy")
        val dateString =formatter.format(dataDeNascimento)
        val localDate = LocalDate.parse(dateString, dateTimeFormatter)
        val menorDeIdade = ChronoUnit.YEARS.between(localDate, LocalDate.now())

        if (menorDeIdade < 18) {
            throw MenorDeIdadeException("!!!!")
        } else {
            carta = Carta()
        }
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }

    override fun toString(): String {
        val formatter = SimpleDateFormat("dd-MM-yyyy")
        val dtNasc = formatter.format(dataDeNascimento)
        return "Pessoa | $nome | $dtNasc | Posicao | x:${this.posicao.x} | y:${this.posicao.y}"
    }

}