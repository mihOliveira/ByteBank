package br.com.alura.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() = salario * 0.05 //To change initializer of created properties use File | Settings | File Templates.


}

// classe analista que herda os atributos e sobrescreve o método bonificação da classe abstrata funcionário