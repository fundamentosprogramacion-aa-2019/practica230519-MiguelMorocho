﻿/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

/**
 *
 * @author Morocho
 */
public class EstructuraFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 10;
        String mensaje1 = "reporte 1";
        String mensajefinal = "Fin del reporte";
        
        System.out.printf("€s", mensaje1);
        for (int i=0; i <= limite; i++){
            System.out.printf("contador %d\n", i);
        }
        System.out.printf("%s\n", mensajefinal);
    }
 }
