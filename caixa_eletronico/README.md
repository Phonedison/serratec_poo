<img align="left" src="https://i.giphy.com/1uxiEScntiYAwZ2Joy.webp" width="150">

# Exercício: Simulador de Caixa Eletrônico

Este projeto documenta a evolução de um sistema de terminal bancário, partindo de uma abordagem procedural até a implementação de Programação Orientada a Objetos (POO) em Java.

---

<br/>
<br/>

## Fase 1: Lógica Estruturada

### 📌 Objetivo

A pratica e utilização de laços de repetição (while / do while) e estruturas de seleção (switch / case) para a criação de menus interativos em ambiente de console.

### ⚙️ Funcionalidades

O sistema oferece as seguintes opções ao usuário:

- **Ver Saldo:** Exibe o saldo atual da conta.
- **Depositar:** Permite adicionar valores ao saldo.
- **Sacar:** Permite a retirada de dinheiro, sujeita a verificações de segurança.
- **Sair:** Finaliza a execução do programa.

## Fase 2: Programação Orientada a Objetos (Implementado)

### 🏗️ Objetivo

Migrar a lógica anterior para uma estrutura de classes e objetos, seguindo os princípios de encapsulamento e organização de código.

### ⚙️ Mudanças Estruturais

A lógica foi encapsulada na classe ContaBancaria, que agora gerencia seu próprio estado:

- **Atributos:** numero, titular e saldo.
- **Construtor:** Garante a integridade dos dados na criação do objeto e aplica automaticamente o bônus de boas-vindas de R$ 50,00.
- **Métodos de Comportamento:**
  - depositar(double valor): Incrementa o saldo.
  - sacar(double valor): Realiza as validações de segurança antes de subtrair do saldo.

---

### 🛡️ Regras (Consolidadas)

Para garantir a conformidade com o enunciado, o sistema implementa as seguintes restrições:

- **Limite de Saques**: O usuário pode realizar no máximo 3 saques. Ao tentar o 4º saque, a operação é bloqueada com a mensagem: _"Limite de saques diários atingido"_.
- **Teto por Operação**: Cada saque individual não pode ultrapassar o valor de R$ 1.000,00.

- **Bônus de Entrada**: Toda conta nova inicia com R$ 50,00.

## 🛠️ Como Executar o Projeto

Siga as etapas abaixo para clonar, compilar e rodar o simulador em sua máquina local.

### 1. Pré-requisitos

Certifique-se de ter o JDK (Java Development Kit) instalado (versão 11 ou superior recomendada). Para verificar, digite no terminal:

```Bash
java -version
```

### 2. Clonar o Repositório

Abra o seu terminal ou prompt de comando e execute:

```Bash
git clone https://github.com/Phonedison/serratec_poo.git
```

Entre na pasta do projeto:

```Bash
cd caixa_eletronico
```

### 3. Compilação

Como o código-fonte está organizado dentro da pasta src, utilizaremos o comando abaixo para compilar todas as classes simultaneamente. Isso gerará os arquivos .class necessários.

```Bash
javac src/\*.java
```

### 4. Execução

Para iniciar o simulador, execute a classe Main. Como os arquivos compilados estão dentro de src, precisamos avisar ao Java onde procurar as classes usando o parâmetro de Classpath (-cp):

```Bash
java -cp src Main
```

---
