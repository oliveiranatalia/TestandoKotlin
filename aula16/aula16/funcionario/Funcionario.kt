package classesobjetos.aula16.funcionario
class Funcionario (var nome: String, var sobrenome: String, var horasTrabalhadas: Double, var valorHora: Double){

    fun nomeCompleto(){
        println("Nome: $nome $sobrenome")
    }
    fun calcularSalario(){
        val resultado = horasTrabalhadas * valorHora
        println("O valor total é de R$$resultado")
    }
    fun incrementarHoras(novoValor: Double){
        horasTrabalhadas += novoValor
    }
}
