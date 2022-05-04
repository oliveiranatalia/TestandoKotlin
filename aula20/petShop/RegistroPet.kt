package classesobjetos.aula20.petShop

import kotlin.system.exitProcess

class RegistroPet {
    val tutor = Tutor()
    val end = Endereco()
    var listaPets = ArrayList<Pet>()

    fun cadastroAnimal(){
        print("\nInsira o nome do pet: ")
        val nome = readln()
        print("Espécie: ")
        val especie = readln()
        print("Peso aproximado: ")
        val peso = readln().toDouble()
        print("Idade: ")
        val idade = readln().toInt()
        listaPets.add(Pet(nome, especie, peso, idade))
    }
    fun dadosTutor(){
        println("Carregando ....\nPrecisamos de algumas informações de contato")
        print("Insira o seu nome: ")
        tutor.nomeTutor = readln()
        print("Insira o telefone de contato com DDD: ")
        tutor.tel = readln()
        print("Insira o melhor e-mail para contatarmos: ")
        tutor.email = readln()

        print("Insira bairro e cidade de sua residência: ")
        end.cidade = readln()
        print("O seu CEP (somente números): ")
        end.cep = readln().toInt()
        print("Número da residência e complemento:  ")
        end.num = readln()
        print("E, por fim, o nome da sua rua/avenida: ")
        end.rua = readln()
        print("Registrando informações ...")

    }
    fun exibirCadastro(){
        println("\n---------------------------------\n        Informações de registro")
        listaPets.forEach{
            it.exibirPet()
        }
        println("Responsável: ${tutor.nomeTutor} - Tel: ${tutor.tel}")
        println("E-mail: ${tutor.email}")
        println("Rua:${end.rua}, ${end.num}")
        println("CEP: ${end.cep} - ${end.cidade}")
    }

    fun ultimo(){
        println("\n---------------------------------\n    Insira como deseja prosseguir:")
        println("\n   (c) - Cadastrar outro pet\n   (r) - Visualizar registro\n   (s) - Sair")
        when(readln()){
            "c" -> {cadastroAnimal()
                ultimo()}
            "r" -> {exibirCadastro()
                    ultimo()}
            "s" -> {println("Fechando, até mais ....")
                exitProcess(0)}
            else ->{
                println("Não entendi. Tente novamente.")
                ultimo()
            }
        }
    }

    fun continuacao(){
        println("\n---------------------------------\n  Insira como deseja prosseguir:")
        println("\n   (c) - Cadastrar outro pet\n   (d) - Inserir dados de contato\n   (s) - Sair")
        when(readln()){
            "c" -> {cadastroAnimal()
                continuacao()}
            "d" -> {dadosTutor()
                ultimo()}
            "s" -> {println("Fechando, até mais ....")
                exitProcess(0)}
            else ->{
                println("Não entendi. Tente novamente.")
                continuacao()
            }
        }
    }

    fun comeco(){
        println("\n---------------------------------\n             PetCare" +
                "\n---------------------------------\n  Insira como deseja prosseguir:")
        println("\n   (c) - Cadastrar pet\n   (s) - Sair")
        when(readln()){
            "c" -> {cadastroAnimal()
                continuacao()}
            "s" -> {println("Fechando, até mais ....")
                exitProcess(0)}
            else ->{
                println("Não entendi. Tente novamente.")
                comeco()
            }
        }
    }
}