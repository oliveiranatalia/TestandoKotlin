package classesobjetos.aula16

class Funcionario {
    var nome: String = ""
    var sobrenome: String = ""
    var horasTrabalhadas = 0
    var valorHora = 0.0

    fun nomeCompleto(){
        print("Nome: $nome $sobrenome")
    }
    fun calcularSalario(){
        val resultado = horasTrabalhadas * valorHora
        println("O valor total é de R$ $resultado.")
    }
    fun incrementarHoras(valorHora: Double, novoValor: Double): Double {
        this.valorHora = valorHora + novoValor
        return valorHora
    }
}