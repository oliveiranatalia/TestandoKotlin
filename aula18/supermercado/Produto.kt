package classesobjetos.aula18.supermercado

class Produto(var nome: String, var qtd: Int, var valor: Double){
    fun lista(){
        print("\nProduto: $nome\nUnidades: $qtd\nValor unitário: $valor\n")
    }
}