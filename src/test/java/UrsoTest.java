import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrsoTest {
    Urso urso;

    @BeforeEach
    void setUp(){
        urso = new Urso();
        urso.setNome("Rogério");
        urso.setPeso(90f);
    }

    @Test
    void deveRetornarNomeCientifico(){
        assertEquals("Ailuropoda melanoleuca", urso.getNomeCientifico());
    }

    @Test
    void deveRetornarInformacoes(){
        assertEquals("Animal{nome='Rogério', peso=90.0}", urso.toString());
    }
}