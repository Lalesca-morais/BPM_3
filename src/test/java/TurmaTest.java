import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {
    Turma turma = new Turma();

    public TurmaTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        Pessoa pessoa1 = new Pessoa(1, "Fulano");
        Pessoa pessoa2 = new Pessoa(2, "Beltrano");
        Pessoa pessoa3 = new Pessoa(3, "Ciclano");
        this.turma = new Turma();
        this.turma.adicionarPessoa(pessoa1);
        this.turma.adicionarPessoa(pessoa2);
        this.turma.adicionarPessoa(pessoa3);
    }

    @AfterEach
    public void tearDown() {
        this.turma.removerTodasPessoas();
    }

    @Test
    public void deveRetornarExcecaoPessoaInvalida() {
        try {
            this.turma.adicionarPessoa(new Pessoa(-1, "teste"));
        } catch (Exception var2) {
            assert var2.getMessage().equals("Objeto pessoa inválido");
        }

    }

    @Test
    public void deveRetornarExcecaoPessoaExistente() {
        try {
            this.turma.adicionarPessoa(new Pessoa(1, "teste"));
        } catch (Exception var2) {
            assert var2.getMessage().equals("Objeto pessoa já está atribuido a turma");
        }

    }

    @Test
    public void deveRetornarSucessoAdicionarPessoa() throws Exception {
        this.turma.adicionarPessoa(new Pessoa(4, "teste"));
        assert this.turma.getPessoas().size() == 4;

    }

    @Test
    public void deveRetornarSucessoRemoverTodasPessoa() throws Exception {
        this.turma.removerTodasPessoas();
        assertTrue(Turma.getPessoas().isEmpty());

    }

    @Test
    @DisplayName("deve remover pessoas lista vazia")
    public void removerTodasPessoas() {
        turma.removerTodasPessoas();
        assertTrue(turma.getPessoas().isEmpty());
    }

    @Test
    @DisplayName("deve remover pessoas lista nao vazia")
    public void testRemover2() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(6,"João"));
        pessoas.add(new Pessoa(7,"Maria"));

        turma.removerTodasPessoas();
        assertTrue(turma.getPessoas().isEmpty());
    }

    @Test
    @DisplayName("deve verificar se realmente foram removidos da lista")
    public void testRemover3() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(8,"Camila"));
        pessoas.add(new Pessoa(9,"Joaquim"));
        turma.removerTodasPessoas();

        assertFalse(turma.getPessoas().contains(new Pessoa(8,"Camila")));
        assertFalse(turma.getPessoas().contains(new Pessoa(9,"Joaquim")));
    }

    @Test
    @DisplayName("teste adicionar pessoa duplicada")
    public void testAdicionarPessoa1() throws Exception {
        Pessoa pessoa1 = new Pessoa(10, "Henrique");
        Pessoa pessoa2 = new Pessoa(10, "Henrique");

        turma.adicionarPessoa(pessoa1);

        assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa2));
    }

    @Test
    @DisplayName("teste adicionar nome vazio")
    public void testAdicionarPessoa2() {
        Pessoa pessoa = new Pessoa(0, "");

        assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa));
    }
}