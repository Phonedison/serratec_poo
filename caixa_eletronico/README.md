<img src="https://private-user-images.githubusercontent.com/74038190/240304579-c288471c-be67-4fbb-af44-1c63ee9ed280.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NzU0MjI4NjksIm5iZiI6MTc3NTQyMjU2OSwicGF0aCI6Ii83NDAzODE5MC8yNDAzMDQ1NzktYzI4ODQ3MWMtYmU2Ny00ZmJiLWFmNDQtMWM2M2VlOWVkMjgwLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNjA0MDUlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjYwNDA1VDIwNTYwOVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTljZWU1MjI0NzE4MzNkM2U1NDc3YmQyNjNmYTYzYTcwNThmNDg2Yjg3NjczNGJmOTYzNzQxM2MwZjM1MmU3YTAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.M7mMfF2nWekhIJTLvnl2JL-QeWlE9U1Ica30eCopLw4"/>

<br/>

# Exercício: Simulador de Caixa Eletrônico

Este projeto documenta a evolução de um sistema de terminal bancário, partindo de uma abordagem procedural até a implementação de Programação Orientada a Objetos (POO) em Java.

---

<img src="https://github.com/user-attachments/assets/fddcdbcd-5ea2-4416-9f59-ca7fd9394aca"/>

## Fase 1: Lógica Estruturada

### 📌 Objetivo

- A pratica e utilização de laços de repetição (while / do while) e estruturas de seleção (switch / case) para a criação de menus interativos em ambiente de console.

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

<img align="right" src="https://private-user-images.githubusercontent.com/74038190/240885248-ff1b5f32-9420-4dde-b2b9-ed2c0aa17459.gif?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NzU0MjIyMjcsIm5iZiI6MTc3NTQyMTkyNywicGF0aCI6Ii83NDAzODE5MC8yNDA4ODUyNDgtZmYxYjVmMzItOTQyMC00ZGRlLWIyYjktZWQyYzBhYTE3NDU5LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNjA0MDUlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjYwNDA1VDIwNDUyN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTVhYmE3OGIxN2QwMzJiN2I3YjNiNjEzMzAzZmJiOTBjYzEzZjNlMTFiOGM2OTIwNjBkMzM1ZTNmZjQ2NzQ0NWYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.yoBqkOpgO8WcHDJhkvLrFyyXcerZOBY97n51wwtWZcc" width="400">

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
