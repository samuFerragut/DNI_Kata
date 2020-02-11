package edu.elsmancs.domain;

import java.util.List;

class TablaAsignacion {
    private final char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};

    TablaAsignacion() {};

    char calcularLetra(String DNI){
        int dni = Integer.parseInt(DNI);
        int posicion = dni % getModulo();
        return getLetra(posicion);
    }

    char getLetra(int posicion) throws ArrayIndexOutOfBoundsException {
        try{
            return this.tabla[posicion];
        }
        catch (ArrayIndexOutOfBoundsException exception){
            throw new ArrayIndexOutOfBoundsException(
                    "Posicion fuera de los limites de la tabla");
        }
    }

    private int getModulo() {
        return this.tabla.length;
    }

    static boolean calcLetra(List<String> casosTest, TablaAsignacion tabla){

        for (String dni : casosTest) {

            String parteNumericaDni = dni.substring(0, dni.length() - 1);
            char letraDni = dni.charAt(dni.length() - 1);

            if (tabla.calcularLetra( parteNumericaDni ) == letraDni) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
