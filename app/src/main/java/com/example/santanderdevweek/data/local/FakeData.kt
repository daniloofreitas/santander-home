package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Danilo Freitas")
        val cartao = Cartao("4564")
        return Conta(
            "94875843-5",
            "1834-4",
            "R$ 9.311.200,3",
            "R$ 10.502.000,00",
            cliente,
            cartao
        );
    }
}