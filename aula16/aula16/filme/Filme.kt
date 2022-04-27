package classesobjetos.filme

class Filme(var titulo:String, var duracaoEmMinutos: Int) {

    fun exibirDuracaoEmHoras(){
        val horas = duracaoEmMinutos / 60
        val minutos = duracaoEmMinutos % 60
        println("O filme $titulo possui $horas horas e $minutos minutos de duração.")
    }
}