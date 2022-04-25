package classesobjetos.aula16

fun main() {
    val novoFuncionario = Funcionario()
    novoFuncionario.nome = "Luis"
    novoFuncionario.sobrenome = "Silva"
    novoFuncionario.horasTrabalhadas = 10
    novoFuncionario.valorHora = 25.50

    println(novoFuncionario.nomeCompleto())
    println(novoFuncionario.calcularSalario())
    novoFuncionario.incrementarHoras(8.0, 25.50)
    println(novoFuncionario.calcularSalario())

    val listaFuncionarios = ArrayList<Funcionario>()
    listaFuncionarios.add(novoFuncionario)

    val funcionario1 = Funcionario()
    funcionario1.nome = "Ana"
    funcionario1.sobrenome = "Maria"
    funcionario1.horasTrabalhadas = 14
    funcionario1.valorHora = 20.8
    listaFuncionarios.add(funcionario1)

    val funcionario2 = Funcionario()
    funcionario2.nome = "Ana"
    funcionario2.sobrenome = "Fernanda"
    funcionario2.horasTrabalhadas = 13
    funcionario2.valorHora = 10.8
    listaFuncionarios.add(funcionario2)

    val funcionario3 = Funcionario()
    funcionario3.nome = "Ana"
    funcionario3.sobrenome = "Letícia"
    funcionario3.horasTrabalhadas = 5
    funcionario3.valorHora = 46.9
    listaFuncionarios.add(funcionario3)

    val funcionario4 = Funcionario()
    funcionario4.nome = "Ana"
    funcionario4.sobrenome = "Joana"
    funcionario4.horasTrabalhadas = 23
    funcionario4.valorHora = 30.0
    listaFuncionarios.add(funcionario4)

    val funcionario5 = Funcionario()
    funcionario5.nome = "Ana"
    funcionario5.sobrenome = "Alana"
    funcionario5.horasTrabalhadas = 100
    funcionario5.valorHora = 10.2
    listaFuncionarios.add(funcionario5)

    val funcionario6 = Funcionario()
    funcionario6.nome = "Ana"
    funcionario6.sobrenome = "Marcela"
    funcionario6.horasTrabalhadas = 11
    funcionario6.valorHora = 79.8
    listaFuncionarios.add(funcionario6)

    val funcionario7 = Funcionario()
    funcionario7.nome = "Ana"
    funcionario7.sobrenome = "Pereira"
    funcionario7.horasTrabalhadas = 48
    funcionario7.valorHora = 10.0
    listaFuncionarios.add(funcionario7)

    val funcionario8 = Funcionario()
    funcionario8.nome = "Ana"
    funcionario8.sobrenome = "Valentina"
    funcionario8.horasTrabalhadas = 70
    funcionario8.valorHora = 50.8
    listaFuncionarios.add(funcionario8)

    val funcionario9 = Funcionario()
    funcionario9.nome = "Ana"
    funcionario9.sobrenome = "Martins"
    funcionario9.horasTrabalhadas = 90
    funcionario9.valorHora = 60.0
    listaFuncionarios.add(funcionario9)

    listaFuncionarios.forEach { funcionario ->
        funcionario.nomeCompleto()
        println("Horas Trabalhadas: ${funcionario.horasTrabalhadas}")
        println("Valor por hora: ${funcionario.valorHora}")
        funcionario.calcularSalario()
        println("------------------------------------")
    }
}