package classesobjetos.aula16

class Funcionario {
    var nome: String = ""
    var sobrenome: String = ""
    var horasTrabalhadas = 0.0
    var valorHora = 0.0

    fun nomeCompleto(){
        println("Nome: $nome $sobrenome")
    }
    fun calcularSalario(){
        val resultado = horasTrabalhadas * valorHora
        print("O valor total é de R$$resultado")
    }
    fun incrementarHoras(novoValor: Double){
        horasTrabalhadas += novoValor
    }
}
