/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodocalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author LAPONE
 */
public class MetodoCalculadora {

      public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 2"));
        
      Operacionees op = new Operacionees();
      int suma=op.sumar(n1, n2);
      int resta=op.restar(n1, n2);
      int multiplicacion=op.multiplicar(n1, n2);
      int division=op.division(n1, n2);
      int porcentaje=op.porcentaje(n1, n2);
      op.mostarResusltados(suma, resta, multiplicacion, division, porcentaje);
      
    }
}