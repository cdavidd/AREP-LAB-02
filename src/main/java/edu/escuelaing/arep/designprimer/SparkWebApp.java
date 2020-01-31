/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.designprimer;

import static spark.Spark.*;

import edu.escuelaing.arep.calculos.Estadistica;
import edu.escuelaing.arep.model.LinkedList;
import spark.Request;
import spark.Response;

/**
 *
 * @author cristian.lopez-a
 */
public class SparkWebApp {
    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    /**
     * @param req tipo Request
     * @param res tipo Response
     * @return pageContent contenido html de la pagina
     */
    public static String inputDataPage(Request req, Response res) {
        String pageContent = "<!DOCTYPE html>" + "<html>" + "<body>" + "<h1>Calcula la desviacion estandar y media</h1>"
                + "<p>Ingresar los numeros separados por coma ',' Ej: 1,2,3</p>" + "<form action=\"/results\">"
                + "  Datos a ingresar:<br>" + "  <input type=\"text\" name=\"datos\" placeholder=\"1,2,3\">" + "  <br>"
                + "  <input type=\"submit\" value=\"Calcular\">" + "</form>" + "</body>" + "</html>";
        return pageContent;
    }

    /**
     * @param req tipo Request
     * @param res tipo Response
     * @return pageContent contenido html de la pagina
     */
    public static String resultsPage(Request req, Response res) {
        String datos = req.queryParams("datos");
        String[] datoS = datos.split(",");
        LinkedList<Double> datosD = new LinkedList<>();
        for (String s : datoS) {
            datosD.add(Double.parseDouble(s));
        }
        String mean = String.valueOf(calcularMean(datosD));
        String std = String.valueOf(calcularstdDev(datosD));

        String pagina = "<!DOCTYPE html>" + "<html>" + "<body>" + "<h1>Resultados</h1>\n" + "La media es: " + mean
                + "<br>" + "La desviacion estandar es: " + std + "<br>" + "<a href=\"/\">Volver</a>" + "</body>"
                + "</html>";

        return pagina;
    }

    /**
     * @param datos tipo LinkedList<Double>
     * @return mean de los datos ingresados
     */
    public static Double calcularMean(LinkedList<Double> datos) {
        return Estadistica.mean(datos);
    }

    /**
     * @param datos tipo LinkedList<Double>
     * @return desviacion estandar de los datos ingresados
     */
    public static Double calcularstdDev(LinkedList<Double> datos) {
        return Estadistica.stdDev(datos);
    }

    /**
     * @return port retorne al puerto a la cual la aplicacion sale
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set(i.e. on localhost)
    }
}