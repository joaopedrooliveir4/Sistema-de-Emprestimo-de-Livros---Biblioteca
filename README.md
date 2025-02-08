# Sistema de Empréstimo de Livros - Biblioteca

Este projeto simula um sistema simples de gerenciamento de uma biblioteca utilizando conceitos de Programação Orientada a Objetos (POO) em Java. O sistema permite o registro de livros, reserva, empréstimo, devolução e aplicação de multas a alunos e professores.

## Funcionalidades

- **Cadastro de Livros**: Livros podem ser registrados na biblioteca e exibidos na lista.
- **Reserva de Livros**: Usuários podem reservar livros.
- **Empréstimo de Livros**: Livros podem ser emprestados a alunos ou professores, com controle de data de empréstimo e devolução.
- **Multa**: Alunos e professores podem receber multas.
- **Cancelamento de Reserva**: Usuários podem cancelar reservas de livros.

## Estrutura do Projeto

### Classes

- **Pessoa (abstract)**: Classe base para alunos e professores. Possui os atributos `id` e `nome`, além de um método abstrato `multa()`.
  - **Aluno**: Subclasse de *Pessoa* que implementa a lógica de multa para alunos.
  - **Professor**: Subclasse de *Pessoa* que implementa a lógica de multa para professores.

- **Reservavel (interface)**: Interface para garantir que objetos possam ser reservados e que a reserva possa ser cancelada. 
  - **Livro**: Implementa a interface *Reservavel* e representa os livros da biblioteca. Contém métodos para reservar e cancelar reservas.

- **Biblioteca**: Gerencia a lista de livros e fornece métodos para exibir os livros disponíveis.

- **Emprestimo**: Representa o empréstimo de um livro para uma pessoa (aluno ou professor). Armazena a data de empréstimo e devolução, além de fornecer métodos para exibir detalhes do empréstimo.

## Como Usar

1. **Compilar o código**
   
   Primeiro, compile o código Java no terminal (ou use uma IDE como IntelliJ IDEA ou Eclipse):

   ```bash
   javac Main.java
Executar o código

Para rodar o programa e testar suas funcionalidades, execute o seguinte comando:

bash
Copiar
Editar
java Main
Fluxo de execução:

O sistema vai exibir os livros disponíveis na biblioteca.
Um livro será reservado e emprestado para um aluno.
O empréstimo será mostrado no console, incluindo a data de empréstimo e devolução.

Exemplo de saída:

Livros na biblioteca:
Harry Potter e a pedra filosofal
Programação Orientda a Objetos com Java
A bela e a fera
O mágico de OZ

Detalhes do Empréstimo:
Livro: O Senhor dos Anéis
Emprestado para: João
Data do empréstimo: 2025-02-08
Livro ainda não foi devolvido.

Livro O Senhor dos Anéis devolvido por João em 2025-02-15
Detalhes do Empréstimo:
Livro: O Senhor dos Anéis
Emprestado para: João
Data do empréstimo: 2025-02-08
Data da devolução: 2025-02-15

Tecnologias Utilizadas
Java 8+: Para o desenvolvimento da aplicação.
LocalDate: Para gerenciar datas de empréstimos e devoluções.
Licença
Este projeto é de uso educacional e está licenciado sob a Licença MIT.

Contribuições:
Se quiser contribuir com melhorias ou novas funcionalidades, fique à vontade para fazer um fork deste repositório, enviar um pull request ou abrir uma issue!

Desenvolvido por João Pedro Oliveira - 2025

### Explicação das seções:

1. **Objetivo**: Explica o propósito do projeto.
2. **Funcionalidades**: Descreve o que o sistema pode fazer.
3. **Estrutura do Projeto**: Explica brevemente a estrutura das classes e interfaces no código.
4. **Como Usar**: Passo a passo para compilar e rodar o código.
5. **Tecnologias Utilizadas**: Menciona as tecnologias e versões que o projeto utiliza.
6. **Licença**: Explica a licença do projeto (no caso, você pode escolher a licença MIT para código aberto).
7. **Contribuições**: Abre espaço para outras pessoas contribuírem.

Esse `README.md` vai deixar o projeto mais organizado e acessível para quem for ler ou usar no futuro