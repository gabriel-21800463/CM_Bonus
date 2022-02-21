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


    val car1: Veiculo = Carro("22-83-GG", Motor(75, 1200))
    val car2: Veiculo = Carro("54-11-SF", Motor(100, 1600))
    val car3: Carro = Carro("72-12-BA", Motor(75, 1200))
    val bike1: Veiculo = Bicicleta("185767257")
    val bike2: Veiculo = Bicicleta("183957752")
    val bike3: Veiculo = Bicicleta("157575657")
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

    pessoas.get(0).moverPara(423423, 3324234)
    println(pessoas.get(0).posicao)
    pessoas.get(0).moverPara(42343, 21344)
    println(pessoas.get(0).posicao)

   // pessoas.get(0).desligaCarro(car3)

    val bike4: Veiculo = Bicicleta("1119912")
    bike4.moverPara(44322, 212121)
    //bike4.moverPara(44322, 212121)
    println(bike4)
}

