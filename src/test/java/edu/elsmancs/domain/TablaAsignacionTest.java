package edu.elsmancs.domain;

import org.junit.BeforeClass;
import org.junit.Test;

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
}
