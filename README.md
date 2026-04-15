# 💻 Exercícios Práticos - Java & Programação Orientada a Objetos

### 📖 Visão Geral

Este repositório centraliza a resolução de desafios práticos propostos durante a formação. O foco é documentar a evolução na lógica de programação, aplicação de Estruturas de Dados e boas práticas de Clean Code em Java.

<br/>
<br/>

<img align="left" src="https://user-images.githubusercontent.com/74038190/216649426-0c2ee152-84d8-4707-85c4-27a378d2f78a.gif" width="200">

### ⚙️ Metodologia e Aprendizado

A progressão dos exercícios segue um cronograma, priorizando:

**Encapsulamento e Composição:** Organização de classes em camadas de entidades e serviços. <br/>
**Abstração e Contratos:** Uso intensivo de Interfaces para definir comportamentos (`Fretavel`, `Tributavel`, `Contas`).<br/>
**Hierarquias Rígidas:** Implementação de Sealed Classes para controle estrito de herança.<br/>
**Resiliência:** Tratamento de exceções customizadas para garantir a integridade dos dados.<br/>

---

<br/>

## 🛠️ Tecnologias e Ferramentas

- **Linguagem**: `Java 17+ (LTS)`
- **Paradigma**: `Orientação a Objetos (POO)`
- **Ferramentas**: `VS Code / IntelliJ, Git & GitHub`

### 📂 Estrutura de Atividades

#### 1. Lógica e Estruturas de Controle

- **Simulador de Caixa Eletrônico**
  - Conceitos: do / while, switch / case, acumuladores e regras de negócio de segurança.

#### 2. Composição e Regras de Negócio

- **E-Commerce**: Associação entre classes (`Pedido -> ItemPedido -> Produto`), cálculo automático de frete e subtotais.

#### 3. POO Avançada (JDK 17)

- **Sistema de Veículos**: Uso de `abstract sealed class`, polimorfismo, alíquotas de IPVA e validação de parâmetros via `try-catch`.

<br/>

# 📂 Árvore de Diretórios

```
serratec_poo/
├── 📁 caixa_eletronico           # Simulador de transações bancárias
│   ├── 📁 src
│   │   ├── 📁 interfaces
│   │   │   └── ☕ Contas.java
│   │   ├── ☕ Caixa.java
│   │   ├── ☕ Confirmacao.java
│   │   ├── ☕ ContaBancaria.java
│   │   ├── ☕ Main.java
│   │   └── ☕ Separador.java
│   └── 📝 README.md
├── 📁 e_commerce                 # Sistema de pedidos e logística
│   ├── 📁 src
│   │   ├── 📁 entidades
│   │   │   ├── ☕ ItemPedido.java
│   │   │   ├── ☕ Pedido.java
│   │   │   └── ☕ Produto.java
│   │   ├── 📁 user
│   │   │   ├── ☕ Cliente.java
│   │   │   └── ☕ Endereco.java
│   │   └── ☕ App.java
│   └── 📝 README.md
├── 📁 sistema_veiculos           # Gestão de frota com Sealed Classes
│   ├── 📁 src
│   │   ├── 📁 classes
│   │   │   ├── ☕ Caminhao.java
│   │   │   ├── ☕ CarroPasseio.java
│   │   │   └── ☕ Veiculo.java
│   │   ├── 📁 interfaces
│   │   │   ├── ☕ Fretavel.java
│   │   │   └── ☕ Tributavel.java
│   │   └── ☕ App.java
│   └── 📝 README.md
├── ⚙️ .gitignore
└── 📝 README.md                  # Documentação principal do repositório
```

---

## 🚀 Como testar os exercícios

### 📂 Índice de Exercícios

| Exercícios                | Descrição                                        | Caminho do Projeto                        |
| :------------------------ | :----------------------------------------------- | :---------------------------------------- |
| **01 - Caixa Eletrônico** | `Interfaces`, `Switch Case`, `Acumuladores`      | [Caixa Eletrônica](./caixa_eletronico/)   |
| **02 - E-Commerce**       | `Associação`, `Composição`, `Calculos Dinâmicos` | [E-commerce](./e_commerce/)               |
| **03 - Sistema Veículos** | `Sealed Classes`, `Polimorfismo`, `Exceções`     | [Sistema de Veículos](./sistema_veiculos) |

<br/>

**Para rodar qualquer um dos projetos localmente:**

#### 1. Clone o repositório:

```Bash
git clone https://github.com/phonedison/Atividades.git
```

#### 2. Acesse a pasta do exercício:

```Bash
# Exemplo para o Sistema de Veículos
cd sistema_veiculos
javac src/interfaces/*.java src/classes/*.java src/App.java
java -cp src App
```

---

### Realizado por [Lucas leal da Silva](https://github.com/Phonedison)

<a href="https://github.com/Phonedison">
  <img src ="https://avatars.githubusercontent.com/u/7592603?v=4" width="250" />
</a>
