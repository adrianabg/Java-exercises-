package com.everis.iniciacionJava;

import com.everis.iniciacionJava.EjerciciosTema3;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        EjerciciosTema3 tema3 = new EjerciciosTema3();

        tema3.calificaciones(7f);

        tema3.meses(5);

        tema3.mesesRestantes(4);

        tema3.sumaIntervalo(7, 1);

        tema3.sumaIntervalo2(1, 5);

        int[] arrayuno = {1,2,3,4,5};
        tema3.arraymultiplica(arrayuno);

        int [] arraydos  = {7,2,4,8,3,9,1,5,10,6};
        tema3.arrayorden(arraydos);

        tema3.arrayImpar(arraydos);

        tema3.arrayPares(arraydos);

        String[] stringuno = {"a","a","a","b","b","c","d","d"};
        tema3.arrayDistintos(stringuno);

        String[] arraysiete = {"d","a","x","p","i","c","b"};
        tema3.coleccionOrdenada(arraysiete);

        tema3.nombreMes(4);

        //CorreccionEjercicios3.calificacion(6f);
        //CorreccionEjercicios3.calificacionTernaria(4f);
        //CorreccionEjercicios3.numPares(2,19);
    }
}
