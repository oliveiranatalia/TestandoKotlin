package classesobjetos.aula18.simCity

class Nota(private var posicao: Int, private var nota: Double){
    fun listaNotas() {
        print("\n $posicao ª nota: $nota")
    }
}
