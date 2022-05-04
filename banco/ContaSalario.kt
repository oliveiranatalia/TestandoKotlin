package classesobjetos.aula20.banco

class ContaSalario {
    var empregadora = ""
    var bruto = 0.0

    fun abrirConta(){
        print("Carregando ....\nInsira o nome da sua empregadora: ")
        empregadora = readln()
        print("Insira o valor bruto do seu salário: ")
        bruto = readln().toDouble()
        print("Aguarde ...\n ....\nAbertura de conta concluída!")
    }

    fun saldo(){
        val liquido = bruto - 300
        print("\nCarregando ....\n$empregadora adicionou $liquido na sua conta.")
    }
}