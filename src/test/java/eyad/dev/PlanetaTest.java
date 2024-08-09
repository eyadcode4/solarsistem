package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

    



public class PlanetaTest {
      @Test
    void testValoresDeLosAtributos() {
        Planeta planeta = new Planeta("planeta1", 1, 5.97E24, 1.0, 12742, 149597870, Planeta.tipoPlaneta.TERRESTRE, true, 365, 24);
        assertEquals("planeta1", planeta.nombre);
        assertEquals(1, planeta.cantSatelites);
        assertEquals(5.97E24, planeta.masakgE24);
        assertEquals(1.0, planeta.volumenkm3);
        assertEquals(12742, planeta.diametrokm);
        assertEquals(149597870, planeta.distanciamediaSol);
        assertEquals(Planeta.tipoPlaneta.TERRESTRE, planeta.tipo);
        assertTrue(planeta.observable);
        assertEquals(365, planeta.periodoOrbital);
        assertEquals(24, planeta.rotacion);
    }

    @Test
    void testCalcularDensidad() {
        Planeta planeta = new Planeta("planeta1", 1, 5.97E24, 1.0, 12742, 149597870, Planeta.tipoPlaneta.TERRESTRE, true, 365, 24);
        assertEquals(5.97E24, planeta.calcularDensidad());
    }

    @Test
    void testSeConsideraExterior() {
        Planeta planetaInterior = new Planeta("planeta2", 1, 5.97E24, 1.0, 12711, 149597865, Planeta.tipoPlaneta.TERRESTRE, true, 365, 24);
        Planeta planetaExterior = new Planeta("planeta3", 1, 6.0036E24, 2.0, 20000, 1495978700, Planeta.tipoPlaneta.GASEOSO, false, 400, 40);
        assertFalse(planetaInterior.esExterior());
        assertTrue(planetaExterior.esExterior());
    }

    @Test
    void testImprimir() {
        Planeta planeta = new Planeta("planeta2", 1, 5.97E24, 1.0, 12711, 149597865, Planeta.tipoPlaneta.TERRESTRE, true, 365, 24);
        planeta.imprimir();
        
    }
}
