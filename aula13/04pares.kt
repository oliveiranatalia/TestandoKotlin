import kotlin.system.exitProcess
//receba 10 int num e exiba os que são pares
fun main() {
    calculadora()
}
fun retornar(){
    try {
        println("\n1 Para começar novamente  - 2 Para sair")
        var escolha = readln().toInt()
        if (escolha == 1) {
            calculadora()
        } else if (escolha == 2) {
            exitProcess(0)
        } else {
            print("--- Valor não reconhecido\n")
            retornar()
        }
    } catch (ex: NumberFormatException) {
        print("--- Valor não reconhecido\n")
        retornar()
    }
}
fun calculadora(){
    try {
        var numeros = IntArray(10)
        var ind = 1
        println("Insira 10 números inteiros")
        for (i: Int in numeros.indices) {
            print("Insira o $ind º número: ")
            numeros[i] = readln().toInt()
            ind += 1
        }
        for (i: Int in numeros.indices) {
            if(numeros[i] % 2 == 0){
                print("${numeros[i]}, ")
            }
        }
        print(" são pares.")
        retornar()
    }catch (ex: NumberFormatException) {
        print("--- Valor não reconhecido\n")
        retornar()
    }
}
