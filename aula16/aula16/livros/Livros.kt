package classesobjetos.aula16.livros

class Livros {

    var titulo = ""
    var qtdPaginas= 0
    var paginasLidas = 0
    fun verificarProgresso(){
        val porcentagem = paginasLidas * 100 / qtdPaginas
        println("Você leu $porcentagem% do livro!")}
}