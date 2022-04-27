package classesobjetos.aula16.funcionario

fun main() {
    val novoFuncionario = Funcionario("Luis", "Silva", 10.0, 25.50)
    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8.0)
    novoFuncionario.calcularSalario()

    var listaFuncionarios = ArrayList<Funcionario>()
    val funcionario1 = Funcionario("Ana", "Maria", 14.0, 20.8)
    listaFuncionarios.add(funcionario1)

    val funcionario2 = Funcionario("Ana", "Fernanda", 13.0, 10.8)
    listaFuncionarios.add(funcionario2)

    val funcionario3 = Funcionario("Ana", "Letícia", 5.0, 46.9)
    listaFuncionarios.add(funcionario3)

    val funcionario4 = Funcionario("Ana", "Joana", 23.0, 30.0)
    listaFuncionarios.add(funcionario4)

    val funcionario5 = Funcionario("Ana", "Alana", 100.0, 10.2)
    listaFuncionarios.add(funcionario5)

    val funcionario6 = Funcionario("Ana", "Marcela", 11.0, 79.8)
    listaFuncionarios.add(funcionario6)

    val funcionario7 = Funcionario("Ana", "Pereira", 48.0, 10.0)
    listaFuncionarios.add(funcionario7)

    val funcionario8 = Funcionario("Ana", "Valentina", 70.0, 50.8)
    listaFuncionarios.add(funcionario8)

    val funcionario9 = Funcionario("Ana", "Martins", 90.0, 60.0)
    listaFuncionarios.add(funcionario9)

    listaFuncionarios.forEach { i ->
        i.nomeCompleto()
        i.calcularSalario()
        println("Valor hora: R$${i.horasTrabalhadas}\n")
    }
}
