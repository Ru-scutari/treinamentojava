import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {


    @Test
    public void retornaFizzMultiploDeTres(){
        FizzBuzz numeroTeste1 = new FizzBuzz();
        String resultado1 = numeroTeste1.metodoFizz(3);
        Assert.assertEquals(resultado1, "Fizz");
    }

    @Test
    public void retornaBuzzMultiploDeCinco(){
        FizzBuzz numeroTeste2 = new FizzBuzz();
        String resultado2 = numeroTeste2.metodoFizz(5);
        Assert.assertEquals(resultado2, "Buzz");
    }

    @Test
    public void retornaFizzBuzzMultiplos(){
        FizzBuzz numeroTeste3 = new FizzBuzz();
        String resultado3 = numeroTeste3.metodoFizz(15);
        Assert.assertEquals(resultado3,"FizzBuzz");
    }

    @Test
    public void retornaMesmoNumero(){
        FizzBuzz numeroTeste4 = new FizzBuzz();
        String resultado4 = numeroTeste4.metodoFizz(7);
        Assert.assertEquals(resultado4, "7");
    }
}
