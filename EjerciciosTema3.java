package com.everis.iniciacionJava;

import java.sql.SQLOutput;
import java.util.*;

public class EjerciciosTema3 {

    // 1. Determinar si la nota es un aprobado o un suspenso.

    public static void calificaciones(float nota) {

        if (nota < 5.0) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Aprobado");
        }

    }

    // 2. Poniendo el número del mes que diga que mes es.

    public static void meses(int mes) {
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;

            default:
                System.out.println("Introduce un mes correcto");
                break;
        }
    }

    // 3. Poner los meses restantes a partir del número de mes introducido.

    public static String mesesRestantes(int numMes) {

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Noviembre", "Diciembre"};

        String frase = "";

        if (numMes < 1 || numMes > 12) {
            frase = "El mes no existe";
            System.out.println(frase);
        } else {
            for (int i = numMes; i <= meses.length; i++) {
                frase += meses[i - 1] + " ";
            }
        }
        System.out.println(frase);
        return frase;
    }

    // 4. Suma los números comprendidos entre dos números, no incluidos.

    public static void sumaIntervalo(int numInicio, int numFin) {
        int resultado = 0;
        if (numInicio == numFin) {
            System.out.println("La suma de los dos números es 0");
        } else {
            if (numInicio > numFin) {
                while (numFin < numInicio) {
                    numFin++;
                    resultado += numFin;
                }
                System.out.println(resultado - numInicio);
            } else {
                while (numInicio < numFin) {
                    numInicio++;
                    resultado += numInicio;
                }
                System.out.println(resultado - numFin);
            }
        }
    }

    // 5. Suma los números comprendidos entre dos números, incluidos.

    public static void sumaIntervalo2(int a, int b) {
        int limInferior = (a < b) ? a : b;
        int limSuperior = (a > b) ? a : b;

        int suma = (a == b) ? limInferior : 0;

        do {
            suma += limInferior;
            limInferior++;
        } while (limInferior <= limSuperior);

        System.out.println(suma);


    }

    // 6. Números pares entre dos números con bucle for.

    public static void numPares(int a, int b) {

    }

    // 7. Método que reciba un array de enteros y multiplique por 2 cada elemento de dentro. Bucle for each.

    public static void arraymultiplica(int[] arrayuno) {
        for (int i : arrayuno) {
            //int resultado = i*2;
            System.out.println(i * 2);
        }
    }

    // 8. Método que acepte una lista de enteros como parámetro y muestre la lista ordenada.

    public static void arrayorden(int[] arraydos) {
        Arrays.sort(arraydos);
        for (int i : arraydos) {
            System.out.println(i);
        }
    }

    // 9. Método que acepte una lista de enteros como parámetro y que devuelva otra lista con el mismo orden pero sin los números pares.

    public static void arrayImpar(int[] arraytres) {
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < arraytres.length; i++) {
            if (arraytres[i] % 2 != 0) {
                arrayList.add(arraytres[i]);
            }
        }
        System.out.println(arrayList.toString());
    }

    // 10. Repetido.

    // 11. Método que acepte una lista de enteros como parámetro y que devuelva otra lista con el mismo orden pero sin los números pares.

    public static void arrayPares(int[] arraycuatro) {
        ArrayList arrayListPar = new ArrayList();

        for (int i = 0; i < arraycuatro.length; i++) {
            if (arraycuatro[i] % 2 == 0) {
                arrayListPar.add(arraycuatro[i]);
            }
        }
        System.out.println(arrayListPar.toString());
    }

    // 12. Método que reciba una colección de strings y devuelva una lista con los elementos distintos de la misma.

    public static void arrayDistintos(String[] arrayseis){
        ArrayList <String> nuevalista = new ArrayList <String>();
        for (String palabra: arrayseis) {
            if(!nuevalista.contains(palabra)){
                nuevalista.add(palabra);
            }
        }
        System.out.println(nuevalista.toString());
    }

    // 13. Método que acepte una colección de strings y muestre por pantalla los elementos ordenados.

    public static void coleccionOrdenada(String[] arraysiete) {
        ArrayList<String> listaOrdenada = new ArrayList<String>();

        for (String x : arraysiete) {
            listaOrdenada.add(x);
        }
        Collections.sort(listaOrdenada);
        System.out.println(listaOrdenada);
    }

    // 14. Método que acepte un número que representa el número de un mes y devuelva el nombre del mes, utilizando mapas.

    public static void nombreMes(int numMes){
        HashMap<Integer, String> numeroMeses = new HashMap <>();

        numeroMeses.put(1, "Enero");
        numeroMeses.put(2, "Febrero");
        numeroMeses.put(3, "Marzo");
        numeroMeses.put(4, "Abril");
        numeroMeses.put(5, "Mayo");
        numeroMeses.put(6, "Junio");
        numeroMeses.put(7, "Julio");
        numeroMeses.put(8, "Agosto");
        numeroMeses.put(9, "Septiembre");
        numeroMeses.put(10, "Octubre");
        numeroMeses.put(11, "Noviembre");
        numeroMeses.put(12, "Diciembre");

        System.out.println(numeroMeses.get(numMes));
    }
}