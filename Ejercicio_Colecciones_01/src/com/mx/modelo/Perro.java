package com.mx.modelo;

public class Perro {

    private String nombreRaza;
    private int edad;
    private String color;

    public Perro() {
    }

    public Perro(String nombreRaza, int edad, String color) {
        this.nombreRaza = nombreRaza;
        this.edad = edad;
        this.color = color;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombreRaza='" + nombreRaza + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }
}
