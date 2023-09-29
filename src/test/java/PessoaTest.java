import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PessoaTest {

    @Test
    @DisplayName("Caso valido")
    public void testValido1() {
        Pessoa pessoa = new Pessoa(1, "Joana");
        assertTrue(pessoa.valido());
    }

    @Test
    @DisplayName("Id negativo")
    public void testValido2() {
        Pessoa pessoa = new Pessoa(-25, "Camila");
        assertFalse(pessoa.valido());
    }

    @Test
    @DisplayName("Caso nome vazio")
    public void testValido3() {
        Pessoa pessoa = new Pessoa(6, "");
        assertFalse(pessoa.valido());
    }

    @Test
    @DisplayName("Caso Id zero e nome vazio")
    public void testValido4() {
        Pessoa pessoa = new Pessoa(0, "");
        assertFalse(pessoa.valido());
    }
}
