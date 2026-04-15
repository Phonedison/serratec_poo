# 🚛 Exercício: Sistema de Gestão de Veículos

O caso de estudo representa a implementação de um sistema de gestão de frotas utilizando Java 17+. O objetivo é simular o controle de locação (frete) e obrigações tributárias (IPVA) de diferentes tipos de veículos, aplicando regras de negócio baseadas em idade e capacidade.

<img src="https://github.com/user-attachments/assets/fddcdbcd-5ea2-4416-9f59-ca7fd9394aca"/>

---

### 🎯 Objetivo

Aplicar conceitos avançados de POO e novos recursos da linguagem, como:

- Sealed Classes _(Classes Seladas para controle de hierarquia)_
- Polimorfismo através de Interfaces
- Tratamento de Exceções robusto
- Lógica de Negócio condicional _(regras de governo e sobrecarga)_

### 🏗️ Estrutura do Projeto

O sistema utiliza uma hierarquia restrita para garantir que apenas tipos autorizados de veículos sejam criados:

#### 📑 Interfaces

- **Fretavel:** Define o contrato para locação baseada em carga e tempo.
- **Tributavel:** Define o contrato para cálculos de impostos governamentais.

#### 🚗 Veiculo (Classe Mãe - abstract sealed)

Classe base que centraliza os dados comuns a todos os veículos.

- Atributos:
  - placa (final)
  - marca (final)
  - anoFabricacao (final)
  - valorLocacaoDiaria
  - precoFipe

#### 🚛 Caminhao (Classe Filha - final)

Especialização para transporte de grandes cargas.

- **Atributo exclusivo**: capacidadeCargaToneladas (final)
  Comportamento: Possui taxa de sobrecarga caso exceda sua capacidade.
- **🏎️ CarroPasseio _(Classe Filha - final)_**
  Especialização para veículos leves e transporte de passageiros.

---

### ⚙️ Funcionalidades

- O sistema permite:
  - Calcular o valor de locação com validação de carga.
  - Calcular o IPVA baseado na tabela FIPE e idade do veículo.
  - Validar dados na criação do objeto _(impedindo valores negativos ou placas vazias)_.

### 🛡️ Regras de Negócio

Para garantir o cumprimento das leis e rentabilidade:

- **Regra de Frete (Caminhão)**:
  - Se pesoCarga > capacidadeCargaToneladas → Acréscimo de 10% sobre o valor total.

- **Regra do Governo (IPVA)**:
  - Veículos com mais de 20 anos: Isentos (R$ 0.00).
  - CarroPasseio: 4% do valor FIPE.
  - Caminhão: 1.5% do valor FIPE.
- **Segurança de Dados**:
  - Uso de try-catch no main para capturar qualquer parâmetro inválido enviado aos construtores ou métodos.

### 💻 Exemplo de Execução

Ao rodar o sistema, o tratamento de exceções e cálculos serão exibidos:

```Bash
===== RELATÓRIO CAMINHÃO =====
Aluguel Caminhão (Carga 12t / 5 dias): R$ 2750,00 | IPVA Caminhão Novo: R$ 3000,00
Aluguel Caminhão (Carga 12t / 5 dias): R$ 2750,00 | IPVA Caminhão Antigo: R$ 0,00

===== RELATÓRIO CARRO PASSEIO =====
IPVA Carro Novo: R$ 600,00
IPVA Carro Antigo: R$ 0,00

===== ERRO DE SISTEMA =====
Erro: A placa do veículo não pode ser nula ou vazia.
```

---

### 🛠️ Como Executar o Projeto

#### 1. Pré-requisitos

```Bash
Java JDK 17 ou superior (Necessário para Sealed Classes)
```

##### 2. Compilar o Projeto

```Bash
javac classes/_.java interfaces/_.java main/Main.java
```

##### 3. Executar

```Bash
java main.Main
```
