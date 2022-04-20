//Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu
fun main(){
    print("Insira a sua idade: ")
    val idade = readln().toInt()
    val dias = idade * 365
    println("Você já viveu $dias dias!")
}