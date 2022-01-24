package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    } // se a senha que cadastrei for igual a senha passada, retorna verdadeiro, se não, falso
}

// classe abstrata que herda da classe abstrata funcionário e implementa a interface autenticavel

// o que diferencia a classe funcionário da classe funcionário admin é o atributo senha e o método autenticável