package br.com.alura.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(), // ao instanciar cliente, se não passar o endereço, será utilizado o valor padrão
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}

// classe cliente que implementa a interface autenticável