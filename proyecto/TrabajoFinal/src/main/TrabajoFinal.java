/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Funciones.*;
import Procedimientos.*;
import ResultadoF.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Gaona y Ruben Condoy
 */
public class TrabajoFinal {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        boolean bandera = true;
        int cont = 0;
        String result;
        System.out.println("--> SELECCIONE LA OPCION QUE DESEA <--");
        while (bandera) {
            System.out.println("Inserte 1 para crear Facebook\n"
                    + "Inserte 2 para crear Twiter\n"
                    + "Inserte 3 para crear Whatsapp\n"
                    + "Inserte 4 para crear Telegram\n"
                    + "Inserte 5 para crear Signal\n"
                    + "Inserte 6 para crear Instagram\n"
                    + "Inserte 7 para crear Flickr\n");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                result = funcion.crearFacebook();
                System.out.println(result);

            } else {
                if (opcion == 2) {
                    procedimiento.crearTwitter();

                } else {
                    if (opcion == 3) {
                        result = funcion.crearWhatsapp();
                        System.out.println(result);
                    } else {
                        if (opcion == 4) {
                            procedimiento.crearTelegram();

                        } else {
                            if (opcion == 5) {
                                result = funcion.crearSignal();
                                System.out.println(result);

                            } else {
                                if (opcion == 6) {
                                    procedimiento.crearInstagram();

                                } else {
                                    if (opcion == 7) {
                                        result = funcion.crearFlickr();
                                        System.out.println(result);

                                    } else {
                                        JOptionPane.showMessageDialog(
                                                null, "ERROR ESA OPCION NO "
                                                + "EXISTE!!!");

                                    }

                                }
                            }

                        }

                    }

                }

            }
            System.out.println("Ingrese (si) si desea terminar el proceso"
                    + "o (no) si desea continuar");
            entrada.nextLine();
            String op = entrada.nextLine();
            if (op.equals("si")) {
                bandera = false;
                cont = cont;
                System.out.println(resultadoF.obtenermensaje(cont));
            } else {
                if (op.equals("no")) {
                    cont = cont + 1;
                    System.out.println(resultadoF.obtenermensaje(cont));
                }

            }

        }

    }

}
