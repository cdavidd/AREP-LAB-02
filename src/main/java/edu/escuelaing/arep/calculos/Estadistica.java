package edu.escuelaing.arep.calculos;

import java.util.List;

public class Estadistica {

    /**
     * Metodo que calcula la media de los datos ingresados
     * 
     * @param datos son los datos a ingresar
     * @return double
     */
    public static double mean(List<Double> datos) {
        double cont = 0;
        for (double n : datos) {
            cont += n;
        }
        double promedio = cont /= datos.size();
        return promedio;
    }

    /**
     * Metodo que calcula la desviacion estandar de los datos ingresados
     * 
     * @param datos datos a ingresar
     * @return double
     */
    public static double stdDev(List<Double> datos) {
        int size = datos.size();
        double cont = 0;

        for (double n : datos) {
            cont += Math.pow((n - mean(datos)), 2);
        }
        cont /= (size - 1);
        return Math.sqrt(cont);
    }
}