package com.company;

public class Candidato {
    private String nombre;
    private int edad;
    private int votos;

    public Candidato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.votos = 0;
    }

    //getter
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getVotos() {
        return this.votos;
    }

    //SETTER
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setVotos(int votos) {
        this.votos = votos;
    }
}
