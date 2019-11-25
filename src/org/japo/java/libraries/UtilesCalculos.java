/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;


/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class UtilesCalculos {
    // Lotería Primitiva
static final int PRIM_MIN = 1;
static final int PRIM_MAX = 49;
// Tipos IVA
static  final int IVA01 = 4;
static final int IVA02 = 10;
static final int IVA03 = 21;    

 // Validar paridad
public static boolean validarParidad(int n) {
 return n % 2 == 0;
 }
 // Validar positivo
 public static boolean validarPositivo(int n) {
 return n != 0;
 }
 // Validar primitiva - Entre 1 y 49
 public static boolean validarNumeroPrimitiva(int n) {
 return n >= PRIM_MIN  && n <= PRIM_MAX;
 }
 // Validar IVA
 public static boolean validarTipoIVA(int iva) {
 return iva == IVA01 || iva == IVA02 || iva == IVA03;
}
 public static int calcularCuadrado(int n){
return n*n;
 }
}
