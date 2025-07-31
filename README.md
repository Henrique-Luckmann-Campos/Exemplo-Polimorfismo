# Exemplo-Polimorfismo
Exemplo de Polimorfismo realizado na Faculdade de ADS no Senac

# 💰 Projeto Conta Bancária em Java

Este é um projeto simples em Java que simula o funcionamento de uma **conta bancária**, com foco em **programação orientada a objetos (POO)**, especialmente os princípios de **encapsulamento** e a base para **polimorfismo**.

---

## 📚 Conceitos Aplicados

### 🔒 Encapsulamento
Os atributos `numeroConta`, `titular` e `saldo` são **privados**, e só podem ser acessados e modificados por meio de **métodos públicos** (getters e ações como `depositar()` e `sacar()`), protegendo os dados da conta.

### 🤹 Polimorfismo (em construção)
O projeto pode ser estendido para aplicar **polimorfismo** criando outras classes, como:
- `ContaPoupanca`
- `ContaCorrente`
- `ContaSalario`

Todas poderiam **herdar de `ContaBancaria`** e **sobrescrever métodos como `sacar()`**, implementando regras diferentes para cada tipo de conta.

---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conta-bancaria-java.git



Saque inválido: valor maior que o saldo ou valor negativo.
Depósito inválido: o valor deve ser maior que zero.
Saldo atual: R$300.0

