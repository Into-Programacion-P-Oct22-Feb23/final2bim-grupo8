/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author Erick Gaona y Ruben Condoy
 */
public class funcion {

    static Scanner entrada = new Scanner(System.in);

    public static String crearFacebook() {
        String cadena = "";
        System.out.println("--> OPCION FACEBOOK SELECCIONADA <--");
        System.out.println("Ingrese el usuario");
        String user = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese Ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese Pais");
        String pais = entrada.nextLine();
        System.out.println("Ingrese Correo Electronico");
        String correo = entrada.nextLine();

        cadena = String.format("Datos ingresados Facebook: \n"
                + "Usuario: %s\n"
                + "Edad:%d\n"
                + "Ciudad%s\n"
                + "Pais:%s\n"
                + "Correo Electronico:%s\n",
                user, edad, ciudad, pais, correo);

        return cadena;
    }

    public static String crearWhatsapp() {
        String cadena = "";
        System.out.println("--> OPCION WHATSAPP SELECCIONADA <--");
        System.out.println("Ingrese el usuario");
        String user = entrada.nextLine();
        System.out.println("Ingrese # telefono");
        int tel = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese Ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese Pais");
        String Pais = entrada.nextLine();

        cadena = String.format("Datos ingresados whatsapp: \n"
                + "Usuario: %s\n"
                + "#Telefono:%d\n"
                + "edad%d\n"
                + "Ciudad:%s\n"
                + "Pais:%s\n",
                user, edad, tel, ciudad, Pais);

        return cadena;
    }

    public static String crearSignal() {
        String cadena = "";
        System.out.println("--> OPCION SIGNAL SELECCIONADA <--");
        System.out.println("Ingrese un nombre de Usuario: ");
        String user = entrada.nextLine();
        System.out.println("Ingrese # telefono: ");
        int telefono = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais: ");
        String pais = entrada.nextLine();
        System.out.println("Ingrese  Hobby Principal: ");
        String hobby = entrada.nextLine();

        cadena = String.format("DATOS INGRESADOS SIGNAL\n"
                + "Nombre de Usuario: %s\n"
                + "#Telefono: %d\n"
                + "Ciudad: %s\n"
                + "Pais%s\n"
                + "Hobby Principal: %s\n",
                user,
                telefono,
                ciudad,
                pais,
                hobby);

        return cadena;
    }

    public static String crearFlickr() {
        String cadena = "";
        System.out.println("--> OPCION FLICKR SELECCIONADA <--");
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su Correo Electronico: ");
        String correoE = entrada.nextLine();

        cadena = String.format("DATOS INGRESADOS FLICKR\n"
                + "Nombre de Usuario: %s\n"
                + "Correo Electronico: %s\n",
                usuario,
                correoE);
        return cadena;
    }
}
