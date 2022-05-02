package classesobjetos.aula18.supermercado

import kotlin.system.exitProcess

class Caixa {
    private var listaItems = ArrayList<Produto>()
    var x = 0

    fun cadastrarItens() {
        println("\nQuantos itens você quer inserir? ")
        x = readln().toInt()
        for (i in 1..x) {
            print("\nItem: ")
            val nome = readln()

            print("Quantas unidades: ")
            val qtd = readln().toInt()

            print("Valor: ")
            val valor = readln().toDouble()
            listaItems.add(Produto(nome, qtd, valor))
        }
    }

    fun mostrarItens() {
        listaItems.forEach{
            it.lista()
        }

    }

    fun valorItens(){
        var total = 0.0
        listaItems.forEach {
            it.lista()
            total += (it.qtd * it.valor)
        }
        println("\nValor total: R$"+total)
    }

    fun menu() {
        println("-------------------------------------\n   1 - Inserir produtos no carrinho\n" +
                "   2 - Visualizar carrinho de compras\n   3 - Visualizar valor do carrinho\n   4 - Sair")
        when (readln().toInt()) {
            1 -> {
                cadastrarItens()
                menu()
            }
            2 -> {
                mostrarItens()
                menu()
            }
            3 -> {
                valorItens()
                menu()
            }
            4 -> {
                print("Fechando ...")
                exitProcess(0)
            }
            else -> {
                println("Valor inválido\n")
                menu()
            }
        }
    }
}