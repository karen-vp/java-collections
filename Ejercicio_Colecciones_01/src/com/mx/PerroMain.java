package com.mx;

import java.util.ArrayList;
import java.util.Scanner;
import com.mx.modelo.Perro;
import com.mx.servicio.PerroServicio;

public class PerroMain {

    public static void main(String[] args) {
        boolean terminar = true;
        String respuesta = "";
        Scanner s = new Scanner(System.in);

        ArrayList<Perro> listaPerros = new ArrayList<>();

        while (terminar) {
            Perro perro = PerroServicio.crearPerro();
            listaPerros.add(perro);
            System.out.println("Quieres seguir agregando? S/N");
            respuesta = s.nextLine().toUpperCase();
            if(respuesta.equals("N")){
                terminar = false;
            }
        }
        System.out.println(listaPerros);
        //System.out.println("Gracias por usar el programa");

        System.out.println("Introduzca el nombre del perro");
        respuesta = s.nextLine();
        System.out.println(PerroServicio.buscarPerro(listaPerros, respuesta));
     
    }
}
