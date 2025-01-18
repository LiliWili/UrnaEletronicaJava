# Urna Eletrônica em Java

Este é um programa em Java que simula o funcionamento de uma urna eletrônica simplificada. O projeto foi desenvolvido com o objetivo de praticar conceitos de Programação Orientada a Objetos (POO).

## Descrição do Projeto

O programa permite que os usuários votem em candidatos fictícios. Após a votação, o sistema apura os resultados e exibe:

- Número de votos para cada candidato.
- Percentual de votos válidos de cada candidato.
- Quantidade de votos nulos.
- Nome do candidato vencedor ou empate.

## Candidatos

Os candidatos pré-configurados são:

- *01* - Ada Lovelace  
- *02* - Alan Turing  
- *03* - Marie Curie  
- *04* - Albert Einstein  
- *05* - Ludwig van Beethoven  

## Funcionalidades

- *Entrada de votos*: O sistema aceita números de 01 a 05 para os candidatos. Outros números são contabilizados como votos nulos.
- *Validação de votos*: Garante que apenas números válidos sejam registrados.
- *Apuração dos resultados*: Calcula os votos de cada candidato e identifica o vencedor.
- *Exibição dos resultados*: Mostra os votos individuais, percentuais, número de votos nulos e o vencedor ou empate.

## Estrutura do Projeto

- *Candidato*: Classe que representa os candidatos, com atributos para nome, número e quantidade de votos.
- *UrnaEletronica*: Classe principal que gerencia os candidatos, votos e apuração.
- *SimulacaoUrna*: Classe com o método main que executa a simulação completa da urna.

## Tecnologias Utilizadas

- *Linguagem*: Java
- *Ambiente de Desenvolvimento*: Visual Studio Code

## Como Executar o Projeto

Caso não tenha o JDK instalado, baixe e instale através do [site oficial do Java](https://www.oracle.com/java/technologies/javase-jdk-downloads.html).

1. Clone este repositório:
   ```
   git clone https://github.com/LiliWili/UrnaEletronicaJava.git
   
2. Compile os arquivos no terminal:
   ```
   javac UrnaEletronicaJava.java Candidato.java
3.  Execute o programa:
    ```
    java SimulacaoUrna
5. Siga as instruções do terminal para registrar os votos
