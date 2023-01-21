/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;

import java.util.Scanner;

/**
 *
 * @author Erick Gaona y Ruben Condoy
 */
public class procedimiento {

    static Scanner entrada = new Scanner(System.in);

    public static void crearTwitter() {
        String cadena = "";
        System.out.println("--> OPCION TWITTER SELECCIONADA <--");
        System.out.println("Ingrese un Nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su Nombres completos: ");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese sus Apellidos completos: ");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais: ");

        String pais = entrada.nextLine();
        System.out.println("Ingrese su Idioma: ");
        String idioma = entrada.nextLine();
        System.out.println("Ingrese su correo electronico: ");
        String correoE = entrada.nextLine();

        cadena = String.format("DATOS INGRESADOS TWITTER\n"
                + "Nombre de Usuario: %s\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "Pais: %s\n"
                + "Idioma: %s\n"
                + "Correo Electronico: %s\n",
                usuario,
                nombres,
                apellidos,
                edad,
                ciudad,
                pais,
                idioma,
                correoE);
        System.out.printf("%s\n", cadena);
    }

    public static void crearTelegram() {
        String cadena = "";
        System.out.println("--> OPCION TELEGRAM SELECCIONADA <--");
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su telefono: ");
        int telefono = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais: ");
        String pais = entrada.nextLine();
        System.out.println("Ingrese su Area de Interes: ");
        String areaI = entrada.nextLine();

        cadena = String.format("DATOS INGRESADOS TELEGRAM\n"
                + "Nombre de Usuario: %s\n"
                + "Telefono: %d\n"
                + "Ciudad: %s\n"
                + "Pais: %s\n"
                + "Area de Interes: %s\n",
                usuario,
                telefono,
                ciudad,
                pais,
                areaI);

        System.out.printf("%s\n", cadena);
    }

    public static void crearInstagram() {
        String cadena = "";
        System.out.println("--> OPCION INSTAGRAM SELECCIONADA <--");
        System.out.println("HA SELECCIONADO INSTAGRAM");
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();

        System.out.println("Ingrese su ciudad ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su Correo Electronico: ");
        String correoE = entrada.nextLine();

        cadena = String.format("DATOS INGRESADOS INSTAGRAM\n"
                + "Nombre de Usuario: %s\n"
                + "Ciudad: %s\n"
                + "Edad: %s\n"
                + "Correo Electronico: %s\n",
                usuario,
                ciudad,
                edad,
                correoE);

        System.out.printf("%s\n", cadena);
    }

}
