package classesobjetos.aula20.banco

import kotlin.system.exitProcess

class Banco {

    private val usuario = Usuario()
    private val salario = ContaSalario()
    private val poupanca = ContaPoupanca()
    private val corrente = ContaCorrente()

    fun saldo(){
        when(usuario.conta){
            1 -> salario.saldo()
            2 -> poupanca.saldo()
            3 -> corrente.saldo()
            else -> {println("Valor não reconhecido. Tente novamente.")
                abrirConta()
            }
        }
    }

    fun abrirConta(){
        println("Carregando ....\nQual o tipo de conta quer adquirir?\n   1 - Conta Salário   " +
                "2 - Conta Poupança   3 - Conta Corrente   4 - Sair")
        print("Insira a opção desejada (1/2/3/4): ")
        usuario.conta = readln().toInt()
        when(usuario.conta){
            1 -> salario.abrirConta()
            2 -> poupanca.abrirConta()
            3 -> corrente.abrirConta()
            4 -> {println("Fechando, até mais ....")
                exitProcess(0)}
            else ->{println("Valor não reconhecido. Tente novamente.")
                abrirConta()}
        }
    }

    fun dadosCadastro(){
        println("\n---------------------------------\n        Informações de registro")
        println("${usuario.nome} - ${usuario.idade} anos")
        println("Profissão: ${usuario.profissao}")
        println("Endereço: ${usuario.rua}, ${usuario.num}")
        println("CEP: ${usuario.cep} - ${usuario.cidade}")
    }

    fun cadastroBanco(){
        println("Carregando ....")
        print("Insira o seu nome: ")
        usuario.nome = readln()
        print("Insira a sua idade: ")
        usuario.idade = readln().toInt()
        print("Insira a sua profissão: ")
        usuario.profissao = readln()
        println("Carregando ....\nPrecisamos de algumas informações de contato\nAguarde.....")
        print("Insira bairro e cidade de sua residência: ")
        usuario.cidade = readln()
        print("O seu CEP (somente números): ")
        usuario.cep = readln().toInt()
        print("Número da residência e complemento:  ")
        usuario.num = readln()
        print("E, por fim, o nome da sua rua/avenida: ")
        usuario.rua = readln()
        print("Registrando informações ...")
    }
}