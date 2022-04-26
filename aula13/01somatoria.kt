package br.aula13
import kotlin.system.exitProcess

//programa que leia 5 valores inteiros, armazene-os em um vetor e exiba a soma
fun main() {
    println("--------------------------------\n         Somatório\nInsira apenas números inteiros\n--------------------------------")
    somatorio()
}
fun somatorio(){
    try {
        var ind = 1
        var soma = 0
        var numeros = IntArray(5)
        numeros.forEach { numeros ->
            print("Insira o $ind número: ")
            var valor = readln().toInt()
            ind += 1
            soma += valor
        }
        print(soma)
        retorno()
    } catch (ex: NumberFormatException) {
        println("Valor não reconhecido.\n")
        somatorio()
    }
}
fun retorno(){
    try {
        print("\n-- 1 Começar novamente   2 Sair: ")
        val escolha = readln().toInt()
        if (escolha == 1) {
            somatorio()
        } else if (escolha == 2){
            exitProcess(0)
        } else {
            print("-- valor inválido\n")
            retorno()
        }
    } catch(ex: java.lang.NumberFormatException){
        print("-- Insira apenas números\n")
        retorno()
    }
}
