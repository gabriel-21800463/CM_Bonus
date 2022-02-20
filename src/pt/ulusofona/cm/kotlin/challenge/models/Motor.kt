package pt.ulusofona.cm.kotlin.challenge.models

class Motor (val cavalos: Int, val cilindrada: Int){

    val ligado:Boolean = false

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }


}