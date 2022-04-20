//Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo
fun main(){
    print("Insira um número: ")
    val num = readln().toInt()
    if(num >= 0){
        print("O número $num é positivo.")
    }else{
        print("O número $num é negativo.")
    }
}