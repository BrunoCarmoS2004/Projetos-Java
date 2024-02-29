import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class SistemaTest {

    private static final String NomeCerto = "João Silva";
    private static final String DescricaoCerto = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
    private static final String CategoriaCerto = "Fruta";
    private static final String PrecoCerto = "51";
    private static final String QuantidadeCerto = "10";

    @Test
    public void NomeNull(){
        Produto produto = new Produto(null , DescricaoCerto, CategoriaCerto, PrecoCerto, QuantidadeCerto);
        Assertions.assertFalse(produto.isValido());
    }

    @Test
    public void PrecoComLetras(){
        Produto produto = new Produto(NomeCerto, DescricaoCerto, CategoriaCerto, PrecoCerto, QuantidadeCerto);
        Assertions.assertFalse(produto.isValido());
    }
}
