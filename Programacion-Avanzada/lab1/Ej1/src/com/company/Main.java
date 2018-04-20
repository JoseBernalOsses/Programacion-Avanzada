package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        String voto;
        int nulos=0;
        double totalvotos=0;
        double p1,p2,p3,pn;
        Candidato candidato1;
	    candidato1 = new Candidato("Jose" , 19);
        Candidato candidato2;
        candidato2 = new Candidato("Javier" , 22);
        Candidato candidato3;
        candidato3 = new Candidato("Martin" , 20);
        System.out.println("Por que candidato vota? (a,b o c, pulse f pa salir ejejje");

        Scanner votos = new Scanner(System.in);
        voto = votos.nextLine();
        while(!voto.equalsIgnoreCase("f")) {
            switch(voto) {
                case "a": candidato1.setVotos(candidato1.getVotos()+1);
                    totalvotos=totalvotos+1;
                    voto = votos.nextLine();
                    break;
                case "b": candidato2.setVotos(candidato2.getVotos()+1);
                    totalvotos=totalvotos+1;
                    voto = votos.nextLine();
                    break;
                case "c": candidato3.setVotos(candidato3.getVotos()+1);
                    totalvotos=totalvotos+1;
                    voto = votos.nextLine();
                    break;
                default: System.out.println("Ingrese un valor valido");
                    totalvotos=totalvotos+1;
                    nulos++;
                    voto = votos.nextLine();
                    break;

            }
        }
        p1=(candidato1.getVotos()/totalvotos)*100 ;
        p2=(candidato2.getVotos()/totalvotos)*100 ;
        p3=(candidato3.getVotos()/totalvotos)*100 ;
        pn=(nulos/totalvotos)*100;
        System.out.println("La cantidad de votos para "+candidato1.getNombre()+" de edad "+candidato1.getEdad()+" recibio "+candidato1.getVotos()+" votos, siendo este el "+ p1 +"% del total de los votos");
        System.out.println("La cantidad de votos para "+candidato2.getNombre()+" de edad "+candidato2.getEdad()+" recibio "+candidato2.getVotos()+" votos, siendo este el "+ p2 +"% del total de los votos");
        System.out.println("La cantidad de votos para "+candidato3.getNombre()+" de edad "+candidato3.getEdad()+" recibio "+candidato3.getVotos()+" votos, siendo este el "+ p3 +"% del total de los votos");
        System.out.println("La cantidad de votos nulos fue "+ nulos+", esto es el "+pn+"% del total de votos");
        if((candidato1.getVotos()>candidato2.getVotos())&&(candidato1.getVotos()>candidato3.getVotos())){
            System.out.println("El ganador es "+candidato1.getNombre());
        }
        if((candidato2.getVotos()>candidato1.getVotos())&&(candidato2.getVotos()>candidato3.getVotos())){
            System.out.println("El ganador es "+candidato2.getNombre());
        }
        if((candidato3.getVotos()>candidato1.getVotos())&&(candidato3.getVotos()>candidato2.getVotos())){
            System.out.println("El ganador es "+candidato3.getNombre());
        }
    }
}
