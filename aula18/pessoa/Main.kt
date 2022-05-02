package classesobjetos.aula18.pessoa

fun main(){
    val objeto1 = Pessoa(14,3,1870,"Albert Einstein")
    val objeto2 = Pessoa(4,1,1643,"Isac Newton")

    print("\n"+objeto1.informarNome())
    objeto1.calculaIdade()
    objeto1.ajustaDataNascimento()
    print("\n"+objeto2.informarNome())
    objeto2.calculaIdade()
    objeto2.ajustaDataNascimento()
}