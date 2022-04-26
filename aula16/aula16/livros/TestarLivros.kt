package classesobjetos.aula16.livros

fun main() {
    val livroFavorito = Livros()
    livroFavorito.titulo = "O Pequeno Príncipe"
    livroFavorito.qtdPaginas = 98
    println("${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas.")
    livroFavorito.paginasLidas = 20
    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()
    println("----------------------")

    val livro1 = Livros()
    livro1.titulo = "Vigiar e Punir"
    livro1.qtdPaginas = 320
    livro1.paginasLidas = 30
    println("${livro1.titulo} possui ${livro1.qtdPaginas} páginas.")
    livro1.verificarProgresso()
    println("----------------------")
    val livro2 = Livros()
    livro2.titulo = "Sapiens"
    livro2.qtdPaginas = 400
    livro2.paginasLidas = 30
    println("${livro2.titulo} possui ${livro2.qtdPaginas} páginas.")
    livro2.verificarProgresso()
    println("----------------------")
    val livro3 = Livros()
    livro3.titulo = "Admirável Mundo Novo"
    livro3.qtdPaginas = 300
    livro3.paginasLidas = 300
    println("${livro3.titulo} possui ${livro3.qtdPaginas} páginas.")
    livro3.verificarProgresso()
    println("----------------------")
    val livro4 = Livros()
    livro4.titulo = "Guerra e Paz"
    livro4.qtdPaginas = 1000
    livro4.paginasLidas = 400
    println("${livro4.titulo} possui ${livro4.qtdPaginas} páginas.")
    livro4.verificarProgresso()
    println("----------------------")
    val livro5 = Livros()
    livro5.titulo = "O idiota"
    livro5.qtdPaginas = 203
    livro5.paginasLidas = 20
    println("${livro5.titulo} possui ${livro5.qtdPaginas} páginas.")
    livro5.verificarProgresso()
    println("----------------------")
    val livro6 = Livros()
    livro6.titulo = "A ilha"
    livro6.qtdPaginas = 280
    livro6.paginasLidas = 50
    println("${livro6.titulo} possui ${livro6.qtdPaginas} páginas.")
    livro6.verificarProgresso()
    println("----------------------")
    val livro7 = Livros()
    livro7.titulo = "Terrorismo"
    livro7.qtdPaginas = 380
    livro7.paginasLidas = 20
    println("${livro7.titulo} possui ${livro7.qtdPaginas} páginas.")
    livro7.verificarProgresso()
    println("----------------------")
    val livro8 = Livros()
    livro8.titulo = "Introdução a lógica"
    livro8.qtdPaginas = 170
    livro8.paginasLidas = 40
    println("${livro8.titulo} possui ${livro8.qtdPaginas} páginas.")
    livro8.verificarProgresso()
    println("----------------------")
    val livro9 = Livros()
    livro9.titulo = "Além do bem e do mal"
    livro9.qtdPaginas = 349
    livro9.paginasLidas = 20
    println("${livro9.titulo} possui ${livro9.qtdPaginas} páginas.")
    livro9.verificarProgresso()
    println("----------------------")
    val livro10 = Livros()
    livro10.titulo = "Ecce homo"
    livro10.qtdPaginas = 200
    livro10.paginasLidas = 70
    println("${livro10.titulo} possui ${livro10.qtdPaginas} páginas.")
    livro10.verificarProgresso()
}