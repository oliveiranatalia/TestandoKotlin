package classesobjetos.filme

fun main() {
    val filme1 = Filme("Os Vingadores", 142)
    filme1.exibirDuracaoEmHoras()
    val filme2 = Filme("Hotal Transilvânia", 93)
    filme2.exibirDuracaoEmHoras()
    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}")
    val filme3 = Filme("The Imitation Game", 115)
    filme3.exibirDuracaoEmHoras()
    val filme4 = Filme("Batman Begins", 150)
    filme4.exibirDuracaoEmHoras()
    val filme5 = Filme("Encanto",110 )
    filme5.exibirDuracaoEmHoras()
    val filme6 = Filme("Shang-Chi e a Lenda dos Dez Anéis",130)
    filme6.exibirDuracaoEmHoras()
    val filme7 = Filme("Cruella", 129)
    filme7.exibirDuracaoEmHoras()
}