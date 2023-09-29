# BPM_3

Este projeto consiste em duas classes principais, `Pessoa` e `Turma`, e dois conjuntos de testes, `PessoaTest` e `TurmaTest`.

## Classes Principais

### Classe Pessoa

A classe `Pessoa` representa uma pessoa com as seguintes propriedades:

- `int id`: O identificador da pessoa.
- `String nome`: O nome da pessoa.

### Classe Turma

A classe `Turma` representa uma turma de pessoas. Ela possui uma lista de pessoas e os seguintes métodos principais:

- `void adicionarPessoa(Pessoa pessoa) throws Exception`: Adiciona uma pessoa à turma, verificando se a pessoa é válida e se não há duplicatas no ID.
- `void removerTodasPessoas()`: Remove todas as pessoas da turma.

## Testes

### Testes da Classe Pessoa

A classe de teste `PessoaTest` testa os métodos da classe `Pessoa`, incluindo o método `valido()` que verifica a validade da pessoa. Os casos de teste incluem:

- Caso válido.
- ID negativo.
- Nome vazio.
- ID zero e nome vazio.

### Testes da Classe Turma

A classe de teste `TurmaTest` testa os métodos da classe `Turma`, incluindo a adição e remoção de pessoas, bem como a detecção de duplicatas de ID. Os casos de teste incluem:

- Lançamento de exceção para pessoa inválida.
- Lançamento de exceção para pessoa duplicada.
- Adição bem-sucedida de uma pessoa.
- Remoção de todas as pessoas.
- Remoção de pessoas de uma lista vazia.
- Verificação da remoção real de pessoas da lista.


