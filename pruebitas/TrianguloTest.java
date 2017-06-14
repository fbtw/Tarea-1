
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrianguloTest {
    @Test
    public void asterisco() {
        assertEquals("*",Triangulo.asterisco());
    }

    @Test
    public void linea() {
        assertEquals("********",Triangulo.linea(8));
    }

    @Test
    public void triangulo_truncado() {
        assertEquals("*",Triangulo.triangulo_truncado(6));
    }

    @Test
    public void triangulo() {
        assertEquals("*******",Triangulo.triangulo(7));
    }

}