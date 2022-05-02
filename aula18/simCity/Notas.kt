package classesobjetos.aula18.simCity

import kotlin.system.exitProcess

class Notas {
    private var notasAlunos = ArrayList<Nota>()

    private fun inserirNotas():String{
        print("Insira o nome do(a) aluno(a): ")
        val nome = readln()

        for(i in 1 .. 4){
            print("\nAvaliação de número: ")
            val posicao = readln().toInt()
            if(posicao < 1 || posicao > 4){
                println("Valor não reconhecido.\n")
                menu()
            } else {
                print("Insira a nota: ")
                val nota = readln().toDouble()
                if(nota < 0 || nota > 10){
                    println("Valor não reconhecido.\n")
                    menu()
                } else {
                    notasAlunos.add(Nota(posicao, nota))
                }
            }
        }
        return nome
    }

    private fun exibirNotas(){
        notasAlunos.forEach{
            it.listaNotas()
        }
    }

    private fun calcularMedia(){
        var total = 0.0
        for (i in notasAlunos.indices) total += i
        if(total == 0.0) inserirNotas()
        print("\nA média final de é de $total")

    }

    fun menu(){
        print("\n---------------------------------\n         média global\n---------------------------------\n")
        println("Insira a opção desejada:\n   1 - Inserir notas\n   2 - Exibir notas\n   3 - Exibir média final\n" +
                "   4 - Sair")
        when(readln().toInt()){
            1 -> {
                inserirNotas()
                menu()}
            2 -> {
                exibirNotas()
                menu()}
            3 -> {
                calcularMedia()
                menu()}
            4 -> {
                print("Fechando ...")
                exitProcess(0)
            }
            else -> {
                println("Valor inválido\n")
                menu()}
        }
    }
}
