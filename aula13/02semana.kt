package br.aula13
import kotlin.system.exitProcess

//Receba um número inteiro (1-7) representando o dia da semana e exiba o nome do dia correspondente.
fun main(){
    println("\n---------------------------------\n         Dias da semana\n---------------------------------")
    semana()
}
fun semana() {
    try {
        val dias = arrayOf("", "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado")
        print("Insira um número entre 1 e 7: ")
        val num = readln().toInt()
        if (num == 0){
            semana()
        }
        for (i: Int in dias.indices) {
            println("\n$num equivale a ${dias[num]}\n")
            retorno()
        }
    }catch (ex: NumberFormatException) {
        println("--- Valor não reconhecido")
        retorno()
    }
}
fun retorno() {
    try {
        println("1 Para começar novamente  - 2 Para sair")
        var escolha = readln().toInt()
        if (escolha == 1) {
            semana()
        } else if (escolha == 2) {
            exitProcess(0)
        } else {
            println("--- Valor não reconhecido")
            retorno()
        }
    } catch (ex: NumberFormatException) {
        println("--- Valor não reconhecido")
        retorno()
    }
}
