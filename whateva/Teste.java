package whateva;
import junit.framework.TestCase;

public class Teste extends TestCase {
    public void testExecutaCalculo(){
        float VL01 = 10;
        float VL02 = 10;
        float retorna = 20;

        float ratornaresto = Calculo.ExecutaCalculo(VL01,VL02);
        assertEquals(retornaesperado,ratornaresto,0);
    }
}