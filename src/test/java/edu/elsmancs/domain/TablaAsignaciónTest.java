package edu.elsmancs.domain;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import edu.elsmancs.domain.TablaAsignacion;

public class TablaAsignacionTest {

    @Test
    public void comprobarLongitudTabla() {
        TablaAsignacion letra = new TablaAsignacion("78484464T");
        assertEquals("T", letra.getLetra());
    }
}
