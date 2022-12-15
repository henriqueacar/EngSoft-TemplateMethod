import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TigreTest {

    Tigre tigre;

    @BeforeEach
    void setUp(){
        tigre = new Tigre();
        tigre.setNome("Carlinhos");
        tigre.setPeso(200f);
    }

    @Test
    void deveRetornarNomeCientifico(){
        assertEquals("Panthera tigris tigris", tigre.getNomeCientifico());
    }

    @Test
    void deveRetornarTipo(){
        assertEquals("Tigre", tigre.getTipo());
    }

    @Test
    void deveRetornarInformacao(){
        assertEquals("Animal{nome='Carlinhos', peso=200.0}", tigre.toString());
    }

}