package classesobjetos.aula18.pessoa

class Pessoa(
    private var diaNascimento: Int,
    private var mesNascimento: Int,
    private var anoNascimento: Int,
    private var nomePessoa: String
){
    fun calculaIdade(){
        val diaAtual = 28
        val mesAtual = 4
        val anoAtual = 2022
        val idade = anoAtual - anoNascimento
        print(" teria $idade anos em $diaAtual/$mesAtual/$anoAtual.")
    }
    fun informarNome(): String{
        return nomePessoa
    }
    fun ajustaDataNascimento(){
        print("\n$nomePessoa nasceu em $diaNascimento do $mesNascimento de $anoNascimento.\n")
    }
}
