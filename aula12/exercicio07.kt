//Escreva um algoritmo para ler as dimensões de um retângulo (base e altura) calcular e imprimir a área
fun main(){
    print("Insira o valor da base: ")
    val b = readln().toInt()
    print("Insira o valor da altura: ")
    val h = readln().toInt()
    val a = b * h
    print("A área do retângulo é de $a")
}