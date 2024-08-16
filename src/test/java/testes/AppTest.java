package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import testes.models.repositories.TestUnityRepository;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void verificaEmail(){
        TestUnityRepository unidadeTeste = new TestUnityRepository();
        boolean retorno = unidadeTeste.criaUnidade("leandroclaytonpgmail.com");


        assertFalse("Esperava que email não fosse correto", retorno);
        
        retorno = unidadeTeste.criaUnidade("leandroclaytonp@gmailcom");

        assertFalse("Esperava que email não fosse correto", retorno);
        
        retorno = unidadeTeste.criaUnidade("leandroclaytonp@gmail.com");

        assertTrue("Email correto", retorno);
    }

    @Test
    public void verificaSenha(){


        TestUnityRepository
    }
    
}
