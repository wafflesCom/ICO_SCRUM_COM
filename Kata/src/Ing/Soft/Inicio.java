/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ing.Soft;

import javax.swing.JOptionPane;

/**
 *
 * @author waffles
 */
public class Inicio {

    int indice;
    String cadena = JOptionPane.showInputDialog("Dame el numero:");
    String[] numeros = {" once", " doce", " trece", " catorce", " quince"};
    String numero, letra = " y";

    public char get_Char() {
        char[] charCadena = cadena.toCharArray();
        char c = 0;
        if (indice < charCadena.length) {
            c = charCadena[indice];
            indice++;
        }
        return c;
    }

    public String unidadTexto(char c) {
        String dato = "";
        switch (c) {
            case '1':
                dato = " uno";
                break;
            case '2':
                dato = " dos";
                break;
            case '3':
                dato = " tres";
                break;
            case '4':
                dato = " cuatro";
                break;
            case '5':
                dato = " cinco";
                break;
            case '6':
                dato = " seis";
                break;
            case '7':
                dato = " siete";
                break;
            case '8':
                dato = " ocho";
                break;
            case '9':
                dato = " nueve";
                break;
            default:
                dato = " ";
        }
        return dato;
    }

    public String decenaTexto(char c) {
        String dato = "";
        switch (c) {
            case '1':
                dato = " diez";
                break;
            case '2':
                dato = " veinte";
                break;
            case '3':
                dato = " treienta";
                break;
            case '4':
                dato = " cuarenta";
                break;
            case '5':
                dato = " cincuenta";
                break;
            case '6':
                dato = " sesenta";
                break;
            case '7':
                dato = " setenta";
                break;
            case '8':
                dato = " ochenta";
                break;
            case '9':
                dato = " noventa";
                break;
            default:
                dato = " ";
        }
        return dato;
    }

    public String centenaTexto(char c, char e) {
        String dato = "";
        switch (c) {
            case '1':
                if(e == '0'){
                dato = "cien";
                }else{
                dato = "ciento";
                }
                    
                
                break;
            case '2':
                dato = "doscientos";
                break;
            case '3':
                dato = "trescientos";
                break;
            case '4':
                dato = "cuatrocientos";
                break;
            case '5':
                dato = "quinientos";
                break;
            case '6':
                dato = "siscientos";
                break;
            case '7':
                dato = "setecientos";
                break;
            case '8':
                dato = "ochocientos";
                break;
            case '9':
                dato = "novecioentos";
                break;
            default:
                dato = " ";
        }
        return dato;
    }

    public String casosEspeciales(char e, char c) {
        String dato = "";
        switch (e) {
            case '1':
                dato = numeros[0];
                break;
            case '2':
                dato = numeros[1];
                break;
            case '3':
                dato = numeros[2];
                break;
            case '4':
                dato = numeros[3];
                break;
            case '5':
                dato = numeros[4];
                return dato;
            default:
                if (e == '0') {
                 dato = decenaTexto(c);
                }else{
                dato = decenaTexto(c) + letra + unidadTexto(e);
                }
                
                break;

        }
        return dato;
    }

    public static void main(String[] args) {
        Inicio app = new Inicio();
        Conversion ap = new Conversion();
        char c, e, u;
        if (app.cadena.length() == 2) {
            c = app.get_Char();
            e = app.get_Char();
            if (c == '1') {
                System.out.println(app.casosEspeciales(e, c));

            } else if (e == '0') {
                app.numero = app.decenaTexto(c);
                System.out.println(app.numero);
            } else {
                app.numero = app.decenaTexto(c) + app.letra + app.unidadTexto(e);
                System.out.println(app.numero);
            }

        } else if (app.cadena.length() == 3) {
            c = app.get_Char();
            e = app.get_Char();
            u = app.get_Char();
            if (e == '0') {
                app.numero = app.centenaTexto(c,u) + app.unidadTexto(u);
                System.out.println(app.numero);
            }else if(e == '1'){
            app.numero = app.centenaTexto(c,e) + app.casosEspeciales(u,e);
                System.out.println(app.numero);
            }else if(u == '0'){
                app.numero = app.centenaTexto(c, e) + app.decenaTexto(e);
                System.out.println(app.numero);
            }
            
            else{
            app.numero = app.centenaTexto(c,e)+ app.decenaTexto(e)+ app.letra+app.unidadTexto(u);
                System.out.println(app.numero);
            }
        } else if(app.cadena.length() == 1) {
            c = app.get_Char();
            System.out.println(app.unidadTexto(c));
        }else{
            System.out.println(" ");    
        }
        ap.correr();
        
    }
}
