package edu.elsmancs.domain;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TablaAsignacionTest {

    private static TablaAsignacion tabla;

    @BeforeClass
    public static void crearTabla() {
        tabla = new TablaAsignacion();
    }

    @Test
    public void getLetraTablaAsignacion() {
        assertEquals('T', tabla.getLetra(0));
        assertEquals('E' , tabla.getLetra(22));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getLetraFueraLimitesTablaAsignacion() {
        tabla.getLetra(100);
    }

    @Test
    public void calcularLetra() {

        String[] casosTest = { //casos OK
                "78484464T","72376173A","01817200Q","95882054E","63587725Q",
                "26861694V","21616083Q","26868974Y","40135330P","89044648X",
                "80117501Z","34168723S","76857238R","66714505S","66499420A"};

        assertTrue(TablaAsignacion.calcLetra(List.of(casosTest), tabla));
    }
}
