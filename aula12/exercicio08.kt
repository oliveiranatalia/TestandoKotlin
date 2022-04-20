//Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis.
// Isto é, x deve ficar com o valor de y e y deve ficar com o valor de x. Mostre os valores depois da troca
fun main() {
    print("Insira o valor de x: ")
    var x = readln().toInt()
    print("Insira o valor de y: ")
    var y = readln().toInt()
    var z = 0
    z = x
    x = y
    y = z
    print("Invertendo valores, x passar a ser $x e y, $y .")
}