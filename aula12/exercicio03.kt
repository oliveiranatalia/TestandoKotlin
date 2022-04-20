//Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5
fun main(){
    print("Insira um número: ")
    val num = readln().toInt()
    if(num % 5 == 0 ){
        print("Esse número é múltiplo de 5!")
    } else {
        print("Esse número não é múltiplo de 5.")
    }
}