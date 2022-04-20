//Crie um algoritmo que, dada uma temperatura em Cº,  exiba uma mensagem informando o tipo do clima
fun main(){
    print("Insira uma temperatura: ")
    val valor = readln().toInt()
    if(valor <= 18){
        print("O clima é frio.")
    } else if(valor >= 19 && valor <= 23){
        print("O clima é agradável.")
    } else if (valor >= 24 && valor <= 35){
        print("O clima é quente.")
    } else {
        print("O clima é muito quente.")
    }
}