package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente, // relacionamento chamado de composição; pode-se usar os atributos e métodoss da classe Cliente ao instanciar Conta
    val numero: Int
) {
    var saldo = 0.0
        protected set
    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    } // iniciar método ao instaciar classe

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    } // método para depositar

    abstract fun saca(valor: Double) // método abstrato pra sacar

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    } // método para transferir
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}