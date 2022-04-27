package classesobjetos.aula16.livros

class Livros (var titulo: String, var qtdPaginas: Int, var paginasLidas:Int)  {
    fun verificarProgresso(){
        val porcentagem = paginasLidas * 100 / qtdPaginas
        println("Você leu $porcentagem% do livro!")}
}
