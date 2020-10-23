# Linguagem para criação de questões de múltipla escolha em html

* Trabalho 4 da disciplina de Construção de Compiladores ministrada pelo Prof. Dr. Daniel Lucrédio
* Semestre 2020/1 ENPE

## Propósito

Este trabalho consiste em implementar um compilador completo para uma linguagem de escolha do grupo.
A escolha foi desenvolver uma nova linguagem para geração de questões múltipla escolha em html.
O compilador possui análise léxica, sintática e semântica e, por final, um gerador de código html restrito a questões de múltipla escolha utilizando a tag \<form\>.

### Tecnologias utilizadas

* java 11
* NetBeans 12
* maven 4.0
* antlr4 4.7.2

### Antlr4

Antlr(ANother Tool for Language Recognition) é um gerador de parser baseado em LL(*) para ler, processar, executar ou traduzir texto estruturado ou arquivos binários. É amplamente usado para construir linguagens, ferramentas e estruturas. A partir de uma gramática, ANTLR gera um analisador que pode construir e percorrer árvores de análise.

### Maven

O Maven é um gerenciador de build e dependências baseado no conceito de project object model (POM). Ele é usado neste projeto para gerenciar as dependências do código sem a necessidade de adicionar bibliotecas juntamente ao código.

### Estrutura da linguagem criada
A linguagem criada segue a seguinte estrutura:
```
inicio

<!--  estilo do comentário -->

titulo(“ texto que será adicionado na tag <title> ”)
enunciado(" texto de explicação dos questionários")

definir Identificador_da_questão {
    pergunta(“ enunciado do respectivo questionário “)
    op(“ texto da alternativa ”)
    .
    .   “sem limite de opções”
    .
}
.
.  “sem limite de questões”
.
fim
```
* Diferentes questões não podem possuir mesmo identificador.
* Diferentes questões não podem possuir mesmo enunciado
* As alternativas de uma mesma questão não podem ser iguais


### Compilação

* Esse projeto foi feito no NetBeans 12, utilizando maven 4.0 para tratar as dependências e antlr4 4.7.2. para gerar o parser e gramática da nova linguagem. Não há necessidade de baixar o antlr4 separadamente, pois ele já esta integrado ao projeto por meio de plugin e dependência maven (verificar o arquivo pom.xml)
* Após realizar o download do código, na sua IDE de escolha, importe o projeto como um projeto maven
* Compile o código para baixar as dependências necessárias
* Se tudo ocorrer como deveria uma nova pasta chamada “target” será criada no diretório do projeto
* Dentro dessa pasta deverá existir um executável java ”Trabalho4Compiladores-1.0-SNAPSHOT-jar-with-dependencies.jar”


### Execução

Para executar o projeto na linha de comando utilize(sem utilizar os colchetes):
```
java -jar [caminho para Trabalho4Compiladores-1.0-SNAPSHOT-jar-with-dependencies.jar]
[caminho para o código a ser compilado] [caminho para o arquivo de saída]
```

### Participantes

| Alunos                | RA     |
| --------------------- | ------ |
| Vitor Moreira Moreale | 756190 |
| Leonardo Ryu Takaki   | 760491 |
