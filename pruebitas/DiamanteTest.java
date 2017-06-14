import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by fborja on 14/6/17.
 */
public class DiamanteTest {
    @Test
    public void isóseles() throws Exception {
        assertEquals("*************",Diamante.isóseles(7));
    }
    @Test
    public void isóselesTruncado() throws Exception {
        assertEquals("      *",Diamante.isóselesTruncado(7));
    }
    @Test
    public void rombo() throws Exception {
        assertEquals("        *",Diamante.rombo(8));
    }

    @Test
    public void romboRotuladoIniciales() throws Exception {
        assertEquals("   *",Diamante.romboRotulado(3));
    }
    @Test
    public void romboRotuladoNombre() throws Exception {
        assertEquals("      *",Diamante.romboRotulado(6));
    }


}