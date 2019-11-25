/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import org.japo.java.libraries.UtilesCalculos;

import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class TestUtilesCalculos {

    public static void pedirNumero() {
        String msgUsr = "Introduce un numero: ";
        String msgErr = "Error";

        UtilesEntrada entrada = new UtilesEntrada();
        int n = entrada.leerEntero(msgUsr, msgErr);

        UtilesCalculos calculos = new UtilesCalculos();

        System.out.println("Demo Librería UtilesCalculos");

        System.out.println("============================");

        System.out.println("Número entero ...: " + n);

        System.out.println("Paridad .........: " + calculos.validarParidad(n));

        System.out.println("Positividad .....: " + calculos.validarPositivo(n));

        System.out.println("Primitiva .......: " + calculos.validarNumeroPrimitiva(n));

        System.out.println("Tipo IVA ........: " + calculos.validarTipoIVA(n));

        System.out.println("Cuadrado ........: " + calculos.calcularCuadrado(n));
    }

}
