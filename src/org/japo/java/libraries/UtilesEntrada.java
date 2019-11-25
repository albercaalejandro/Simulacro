/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class UtilesEntrada {

    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static final int leerEntero(String msgUsr, String msgErr) {
        boolean semaforo = true;
        int n = 0;
        do {
            try {
                System.out.print(msgUsr);
                n = SCN.nextInt();
                semaforo = false;
            } catch (Exception e) {
                System.out.println(msgErr);
            }
            finally {
            SCN.nextLine();
            }
        } while (semaforo);
        return n;
    }

}
