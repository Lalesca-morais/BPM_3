import java.util.ArrayList;

public class Turma {
    static ArrayList<Pessoa> pessoas = new ArrayList();
    public Turma() {
    }
    public static ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
    public void adicionarPessoa(Pessoa pessoa) throws Exception {
        if (!pessoa.valido()) {
            throw new Exception("Objeto pessoa inválido");
        } else if (this.pessoas.stream().anyMatch((it) -> {
            return it.getId() == pessoa.getId();
        })) {
            throw new Exception("Objeto pessoa já está atribuido a turma");
        } else {
            this.pessoas.add(pessoa);
        }
    }
    public void removerTodasPessoas() {
        this.pessoas.clear();
    }
}
