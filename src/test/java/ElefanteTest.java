import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElefanteTest {

    Elefante elefante;

    @BeforeEach
    void setUp(){
        elefante = new Elefante();
        elefante.setNome("Juju");
        elefante.setPeso(3500f);
    }

    @Test
    void deveRetornarNomeCientifico(){
        assertEquals("Loxodonta cyclotis", elefante.getNomeCientifico());
    }

    @Test
    void deveRetornarTipo(){
        assertEquals("Elefante", elefante.getTipo());
    }

    @Test
    void deveRetornarInformacao(){
        assertEquals("Animal{nome='Juju', peso=3500.0}", elefante.toString());
    }

}