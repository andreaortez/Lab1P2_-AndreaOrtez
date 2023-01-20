/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_.andreaortez;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario Autorizado
 */
public class Metodos {

    public int cont = 1;

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void Torres(int n, int origen, int auxiliar, int destino) {
        if (n == 1) {
            System.out.println(cont + " mover disco " + n + " de " + origen + " a " + destino);
            cont++;
            return;
        } else {
            Torres(n - 1, origen, destino, auxiliar);
        }
        System.out.println(cont + " mover disco " + n + " de " + origen + " a " + destino);
        cont++;
        Torres(n - 1, auxiliar, origen, destino);
    }

    public String[] Fecha(String[] cad) throws ParseException {
        for (int i = 0; i < cad.length; i++) {
            char a = cad[i].charAt(0);
            if (a < 48 || a > 57) {
                cad[i] = "No es una fecha";
            } else {
                String[] fecha = cad[i].split("/");
                int dia = Integer.parseInt(fecha[0]);
                int mes = Integer.parseInt(fecha[1]);
                int año = Integer.parseInt(fecha[2]);
                
                if (dia > 31) {
                    cad[i] = "No es una fecha";
                } else if (mes > 12) {
                    cad[i] = "No es una fecha";
                } else if (año > 2023) {
                    cad[i] = "No es una fecha";
                } else {
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date d = df.parse(cad[i]);
                    cad[i] = "Fecha válida: " + d;
                }
            }
        }
        return cad;
    }

    public String ImprimirArray(String[] array) {
        String cad = "";
        for (int i = 0; i < array.length; i++) {
            cad += array[i] + "\n";
        }
        return cad;
    }

//    public double Sumatoria(int k) {
//        double n = 0, y=0;
//        while (k > 0 && n <= k) {
//            y += (Math.pow(-1, n) / (2*n + 1));
//            n++;
//        }
//        double π = 4*y;
//        return π;
//    }
    public double SumatoriaR(int k, int n, double π) {
        if (n > k) {
            return (4 * π);
        } else {
            π += (Math.pow(-1, n) / (2 * n + 1));
            return SumatoriaR(k, n + 1, π);
        }
    }
}
