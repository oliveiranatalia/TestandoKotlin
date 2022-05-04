package classesobjetos.aula20.banco

class ContaCorrente {
    val bank = Banco()
    var valor = 0.0
    val sis = Sistema()

    fun abrirConta() {
        print("\nAguarde ...\nVocê precisa depositar um valor inicial para ativar sua conta.\nDeseja realizar a operação? S/N ")
        when(readln()){
            "s" -> {print("Insira o valor que quer depositar: ")
                valor = readln().toDouble()
                if(valor > 0.0){
                    print("Abertura de conta concluída!")
                }else{
                    print("O valor precisa ser acima de 0. Tente novamente.")
                    bank.abrirConta()}}
            "n" -> {print("Aguarde ... ")
                bank.abrirConta()}
        }
    }

    fun saldo() {
        print("Carregando ....\nSaldo atual: $valor ")
            sis.menu3()
    }
}
