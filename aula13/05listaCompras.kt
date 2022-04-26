//receba uma lista de compras e exiba a lista completa
fun main(){
    println("--------------------------------\n        lista de compras\n--------------------------------")
    itens()
}
fun itens() {
    try {
        print("Quantos itens você quer inserir? ")
        val x = readln().toInt()
        lista(x)
    } catch (ex: NumberFormatException){
        println("Valor não reconhecido.")
        itens()
    }
}
fun lista(x: Int){
    try {
        var listaCompras = arrayOfNulls<String>(x)
        for(i: Int in listaCompras.indices){
            print("Insira um novo item: ")
            listaCompras[i] = readln()
        }
        var ind = 1
        println("\n----- Lista completa:")
        for(i: Int in listaCompras.indices){
            println("$ind - ${listaCompras[i]}")
            ind += 1
        }
    } catch (ex: NumberFormatException){
        println("Valor não reconhecido.")
        lista(x)
    }
}