package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Denis"
    var cpf: String = "123.456.789-00"
}
fun main() {
    val denis = Pessoa()

    println(denis.nome)
    println(denis.cpf)
}