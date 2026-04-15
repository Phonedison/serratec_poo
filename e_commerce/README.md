# 🧾 Exercício: Sistema de Pedidos

O caso de estudo representa a implementação de um sistema de pedidos utilizando **Programação Orientada a Objetos (POO)** em Java. O objetivo é simular o fluxo de um pedido de compra, desde a criação do cliente até o fechamento do pedido com cálculo de valores.

<img src="https://github.com/user-attachments/assets/fddcdbcd-5ea2-4416-9f59-ca7fd9394aca"/>

---

### 🎯 Objetivo

Aplicar conceitos fundamentais de POO, como:

- Encapsulamento
- Associação entre classes
- Responsabilidade única
- Organização em camadas (entidades e usuário)

O sistema foi estruturado para representar um cenário real de compras, com clientes, produtos e pedidos.

### 🏗️ Estrutura do Projeto

O sistema foi dividido em classes com responsabilidades bem definidas:

### 👤 Cliente

Responsável por representar o usuário que realiza o pedido.

- Atributos:
  - nome
  - endereço
  - lista de pedidos

### 📦 Pedido

Representa uma compra realizada pelo cliente.

- Atributos:
  - número do pedido
  - data
  - lista de itens
  - cliente associado

- Responsabilidades:
  - Adicionar produtos ao pedido
  - Calcular o valor total
  - Aplicar regra de frete
  - Exibir recibo final

### 🛒 ItemPedido

Representa um item dentro do pedido.

- Atributos:
  - produto
  - quantidade

- Responsabilidade:
  - Calcular subtotal automaticamente

### 🏷️ Produto

Define os produtos disponíveis para compra.

- Atributos:
  - nome
  - valor

### 📍 Endereço

Armazena os dados de localização do cliente.

- Atributos:
  - rua
  - bairro
  - cidade

### ⚙️ Funcionalidades

- O sistema permite:
  - Criar clientes com endereço
  - Criar pedidos vinculados a um cliente
  - Adicionar produtos ao pedido
  - Calcular automaticamente:
    - subtotal dos itens
    - total da compra
    - frete
- Exibir um recibo completo no console

### 🛡️ Regras de Negócio

Para garantir o funcionamento correto do sistema:

- Cálculo automático de subtotal:
  - Cada item calcula seu valor com base na quantidade e no preço do produto

- Regra de frete:
  - Compras acima de R$ 250,00 → Frete grátis
  - Compras abaixo de R$ 250,00 → Frete de R$ 25,00
- Total do pedido:
  - Soma de todos os itens + frete

<img align="right" src="https://private-user-images.githubusercontent.com/74038190/240885248-ff1b5f32-9420-4dde-b2b9-ed2c0aa17459.gif" width="400">

### 💻 Exemplo de Execução

Ao rodar o sistema, será exibido um recibo semelhante a:

```bash
===== RECIBO =====
Pedido: 1
Data: 2026-04-14
Cliente: Lucas

--- ITENS ---
2 x Fone de ouvido | Subtotal R$ 30.00
1 x Geladeira | Subtotal R$ 5000.00
1 x Fogão | Subtotal R$ 2500.00

Total de itens: 4
Total: R$ 7530.00
Frete: R$ 0.00
TOTAL FINAL: R$ 7530.00
```

---

## 🛠️ Como Executar o Projeto

#### 1. Pré-requisitos

```
- Java JDK 11 ou superior
```

Verifique com:

```bash
java -version
```

#### 2.Clonar o Repositório

```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
```

```bash
cd seu-repositorio
```

#### 3. Compilar o Projeto

```bash
javac src/\*_/_.java
```

#### 4.Executar

```bash
java -cp src App
```
