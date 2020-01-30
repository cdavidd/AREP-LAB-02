package edu.escuelaing.arep;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import edu.escuelaing.arep.calculos.Estadistica;
import edu.escuelaing.arep.model.LinkedList;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testMean() {
        DecimalFormat df = new DecimalFormat("#.00");
        LinkedList<Double> datos = new LinkedList<Double>();
        datos.add(15.0);
        datos.add(69.9);
        datos.add(6.5);
        datos.add(22.4);
        datos.add(28.4);
        datos.add(65.9);
        datos.add(19.4);
        datos.add(198.7);
        datos.add(38.8);
        datos.add(138.2);
        double mean = Estadistica.mean(datos);
        String res = df.format(mean);
        double r = 60.32;
        String res1 = df.format(r);
        assertEquals(res1, res);
    }

    @Test
    public void testStdDev() {
        DecimalFormat df = new DecimalFormat("#.00");
        LinkedList<Double> datos = new LinkedList<Double>();
        datos.add(160d);
        datos.add(591d);
        datos.add(114d);
        datos.add(229d);
        datos.add(230d);
        datos.add(270d);
        datos.add(128d);
        datos.add(1657d);
        datos.add(624d);
        datos.add(1503d);
        double std = Estadistica.stdDev(datos);
        String res = df.format(std);
        double r = 572.03;
        String res1 = df.format(r);
        assertEquals(res1, res);
    }
}