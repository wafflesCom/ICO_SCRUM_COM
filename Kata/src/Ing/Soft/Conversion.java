/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ing.Soft;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author waffles
 */
public class Conversion {

    int indice;
     StringTokenizer st;

    public int unidades(String c) {
        int num = 0;
        switch (c) {
            case "uno":
                num = 1;
                break;
            case "dos":
                num = 2;
                break;
            case "tres":
                num = 3;
                break;
            case "cuatro":
                num = 4;
                break;
            case "cinco":
                num = 5;
                break;
            case "seis":
                num = 6;
                break;
            case "siete":
                num = 7;
                break;
            case "ocho":
                num = 8;
                break;
            case "nueve":
                num = 9;
                return num;
            default:
                return decenas(c);
        }
        return num;
    }
    
     public int decenas(String c) {
        int num = 0;
        switch (c) {
            case "diez":
                num = 10;
                break;
            case "veinte":
                num = 20;
                break;
            case "treinta":
                num = 30;
                break;
            case "cuarenta":
                num = 40;
                break;
            case "cincuenta":
                num = 50;
                break;
            case "sesenta":
                num = 60;
                break;
            case "setenta":
                num = 70;
                break;
            case "ochenta":
                num = 80;
                break;
            case "noventa":
                num = 90;
                break;
            default:
                System.out.println(" ");
                break;
        }
        return num;
    }
     
     public int casos(String cadena, String c, String d){
     int numero = 0;
     switch(cadena.length()){
         case 3:
             return unidades(c)+decenas(d);
     }
     return numero;
     }

    public String get_String(String cadena) {
        st = new StringTokenizer(cadena);
        String token= "";
        if (indice < st.countTokens()) {
            token =st.nextElement().toString();
            indice++;
        }
        return token;
    }
    
    public void correr(){
    String cadena = JOptionPane.showInputDialog("Dame la cantidad en numeros");
    String ca = get_String(cadena);
        
        System.out.println(unidades(ca));
        
    }

}
