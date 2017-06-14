import org.junit.*;

import static org.junit.Assert.*;

public class TikiTakaTest {
    @Test
    public void verificarTest() throws Exception {
        assertEquals("Tiki-Taka",TikiTaka.verificar(120));
    }

}