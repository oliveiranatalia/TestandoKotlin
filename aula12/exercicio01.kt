//Crie um algoritmo que leia um número inteiro e mostre seu antecessor
fun main(){
    print("Digite um número inteiro: ")
    val num = readln().toInt()
    val anterior = num - 1
    print("O número anterior é $anterior")
}