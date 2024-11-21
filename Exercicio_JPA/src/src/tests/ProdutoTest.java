package src.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.main.dao.IProdutoDAO;
import src.main.dao.ProdutoDAO;
import src.main.domain.Produto;

public class ProdutoTest {

    IProdutoDAO dao = new ProdutoDAO();
    Produto produto = new Produto();

    @Before
    public void inicio(){
        produto.setCodigo("123");
        produto.setNome("elias");
    }

    @Test
    public void testInicial(){

        Produto produto1 = dao.cadastrar(produto);
        Assert.assertNotNull(produto1);

    }

}
