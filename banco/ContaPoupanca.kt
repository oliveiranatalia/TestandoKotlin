package classesobjetos.aula20.banco

class ContaPoupanca {
    var valor = 0.0
    val sis = Sistema()

    fun abrirConta(){
        print("\nCarregando ....\nAbertura de conta concluída!\nDeseja transferir valores para sua conta? S/N ")
        when(readln()){
            "s" -> depositar()
            "n" -> sis.menu3()
            else -> sis.menu3()
        }
    }
    fun depositar(){
        print("\nCarregando ....\nInsira o valor que quer depositar: ")
        valor = readln().toDouble()
    }
    fun saldo() {
        print("Carregando ....\nSaldo atual: $valor ")
        sis.menu3()
    }
}