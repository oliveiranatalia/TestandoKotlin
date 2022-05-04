package classesobjetos.aula20.banco

import kotlin.system.exitProcess

class Sistema {
     val bank = Banco()

     fun menu3(){
        println("\n---------------------------------\n  Insira como deseja prosseguir:")
        println("\n   (v) - Verificar saldo\n   (e) - Exibir dados cadastrais\n   (s) - Sair")
        when(readln()){
            "v" -> {bank.saldo()
                menu3()}
            "e" -> {bank.dadosCadastro()
                menu3()}
            "s" -> {println("Fechando, até mais ....")
                exitProcess(0)}
            else ->{println("Valor inválido. Tente novamente.")
                menu2()
            }
        }
    }

     fun menu2(){
        println("\n---------------------------------\n  Insira como deseja prosseguir:")
        println("\n   (a) - Abrir conta\n   (e) - Exibir dados cadastrais\n   (s) - Sair")
        when(readln()){
            "a" -> {bank.abrirConta()
                menu3()}
            "e" -> {bank.dadosCadastro()
                menu3()}
            "s" -> {println("Fechando, até mais ....")
                exitProcess(0)}
            else ->{println("Valor inválido. Tente novamente.")
                menu2()}
        }
    }
     fun menu1(){
        println("\n---------------------------------\n       Sistema bancário" +
                "\n---------------------------------\n  Insira como deseja prosseguir:")
        println("\n   (c) - Cadastro pessoal\n   (s) - Sair")
        when(readln()){
            "c" -> {bank.cadastroBanco()
                menu2()}
            "s" -> {println("Fechando, até mais ....")
                exitProcess(0)}
            else ->{println("Valor inválido. Tente novamente.")
                menu1()}
        }
    }
}