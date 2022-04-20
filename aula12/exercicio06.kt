//Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais.
fun main(){
    print("Insira o valor da cotação atual: ")
    val cotacao = readln().toFloat()
    print("Insira o valor a ser covertido: ");
    val dolar = readln().toFloat()
    val real = dolar * cotacao
    print("O valor convertido é de $real reais")
}