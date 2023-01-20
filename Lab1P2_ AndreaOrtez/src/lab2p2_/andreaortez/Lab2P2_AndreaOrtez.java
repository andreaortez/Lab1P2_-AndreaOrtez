package lab2p2_.andreaortez;

import java.text.ParseException;
import java.util.Scanner;

public class Lab2P2_AndreaOrtez {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        Metodos M = new Metodos();

        int opcion = 0;
        int menu = menu(opcion);

        while (menu != 4) {
            switch (menu) {
                case 1: {
                    System.out.print("\nNumero de discos: ");
                    int n = sc.nextInt();
                    M.setCont(1);
                    M.Torres(n, 1, 2, 3);
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("\nIngrese cadena: ");
                    String cad = sc.nextLine();
                    String[] datos = cad.split(",");
                    System.out.println(M.ImprimirArray(M.Fecha(datos)));
                    break;
                }
                case 3: {
                    System.out.print("\nIngrese el valor de k: ");
                    int k = sc.nextInt();
                    System.out.println(M.SumatoriaR(k, 0, 0));
                    System.out.println();
                    break;
                }
            }
            menu = menu(opcion);
        }
    }

    public static int menu(int opcion) {
        System.out.println("-- MENU --");
        System.out.println("1-> Torres de Hanói\n2-> Fecha\n3-> Sumatoria\n4-> Salir");
        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
}
