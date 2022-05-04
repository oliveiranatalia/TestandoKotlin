package classesobjetos.aula20.petShop

class Pet (var nome: String, var especie: String, var peso: Double,var idade: Int){
    fun exibirPet() {
        println("Pet: $nome - $especie. Peso: $peso kg - Idade $idade anos")
    }
}