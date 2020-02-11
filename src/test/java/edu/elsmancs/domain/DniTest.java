package edu.elsmancs.domain;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DniTest {

    private static final char[] letrasNoPermitidas = {'I', 'Ñ', 'O', 'U'};

    private static final String[] casosTestPass = { //casos OK
            "78484464T", "72376173A", "01817200Q", "95882054E", "63587725Q",
            "26861694V", "21616083Q", "26868974Y", "40135330P", "89044648X",
            "80117501Z", "34168723S", "76857238R", "66714505S", "66499420A"};

    @Test
    public void getParteNumericaDni_stringEsNumero() {
        Dni objetoDniCif = null;
        for (String dni : casosTestPass) {
            objetoDniCif = new Dni(dni);
            assertTrue(objetoDniCif.isDniNumero(
                    objetoDniCif.extraerParteNumericaDni()));
        }
    }
}
