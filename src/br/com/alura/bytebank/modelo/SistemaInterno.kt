package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    } // método que recebe um "funcionário" autenticável e uma senha; se a senha passada desse funcionário for igual a senha cadastrada, entra no no sistema

}

