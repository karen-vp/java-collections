package com.mx.servicio;

import com.mx.modelo.Perro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerroServicio {
    public static Scanner s = new Scanner(System.in);
    public static Perro crearPerro(){
        Perro perro = new Perro();
        System.out.println("Escribe la raza del perro");
        perro.setNombreRaza(s.nextLine());
        return perro;
    }

    public static ArrayList<Perro> buscarPerro(ArrayList<Perro> perros, String nombre) {
        boolean perroPresente = false;
        for (Perro perro : perros) {
            if (perro.getNombreRaza().equals(nombre)) {
                perros.remove(perro);
                perroPresente = true;
            }
        }
        if(!perroPresente){
            System.out.println("No se encuentra el perro presente en la lista");
        }
        return perros;
    }
}
