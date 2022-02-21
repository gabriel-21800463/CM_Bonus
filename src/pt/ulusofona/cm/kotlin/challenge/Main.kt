package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*
import java.time.LocalDate
import java.util.*


val veiculos: ArrayList<Veiculo> = ArrayList()
val pessoas: ArrayList<Pessoa> = ArrayList()

fun main() {

    val pessoa1 = Pessoa("Isabella", LocalDate.of(1880, 7, 30))
    val pessoa2 = Pessoa("Marcella", LocalDate.of(2013, 1, 1))
    val pessoa3 = Pessoa("Joel", LocalDate.of(1994, 6, 25))
    val pessoa4 = Pessoa("Eduardo", LocalDate.of(1500, 4, 13))
    pessoas.add(pessoa1)
    pessoas.add(pessoa2)
    pessoas.add(pessoa3)
    pessoas.add(pessoa4)


    val car1: Veiculo = Carro("22-83-GG", Motor(75, 1300))
    val car2: Veiculo = Carro("54-11-SF", Motor(100, 1400))
    val car3: Carro = Carro("72-12-BA", Motor(75, 1500))
    val bike1: Veiculo = Bicicleta("01")
    val bike2: Veiculo = Bicicleta("02")
    val bike3: Veiculo = Bicicleta("03")
    veiculos.add(car1)
    veiculos.add(car2)
    veiculos.add(car3)
    veiculos.add(bike1)
    veiculos.add(bike2)
    veiculos.add(bike3)

    pessoas.get(0).comprarVeiculo(car1)
    pessoas.get(0).comprarVeiculo(car2)
    pessoas.get(0).comprarVeiculo(car3)
    pessoas.get(0).venderVeiculo("22-83-GG", pessoas.get(1))

    println(pessoas.get(1).pesquisarVeiculo("22-83-GG"))

    pessoas.get(0).moverPara(10, 10)
    println(pessoas.get(0).posicao)
    pessoas.get(0).moverPara(13, 12)
    println(pessoas.get(0).posicao)

   // pessoas.get(0).desligaCarro(car3)

    val bike4: Veiculo = Bicicleta("04")
    bike4.moverPara(16, 20)
    //bike4.moverPara(16, 20)
    println(bike4)
}

