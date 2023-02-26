package atividade4;

import java.util.Scanner;
public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean sensorAguaOK = true;
        boolean sensorCapsulaOK = false;
        
        if(sensorAguaOK){
            System.out.println("A agua esta na temperatura certa");
        }
        else{
            System.out.println("Aguarde a agua aumentar a temperatura");
        }
        
        if(sensorCapsulaOK){
            System.out.println("Voce ja pode fazer seu cafe");
        }
        else{
            System.out.println("coloque uma capsula na maquina");
        }
    }
}
