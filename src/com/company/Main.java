package com.company;


public class Main {

    public static void main(String[] args) {
        // llamar función suma y darle valores
        int resultado = 0;
        resultado = suma(1, 3, 5);
        System.out.println(resultado);

        // crear un objeto miCoche y añadirle una puerta
        Coche miCoche = new Coche();
        miCoche.AnadirPuerta();
        // mostrar el numero de puertas que tiene el objeto
        System.out.println(miCoche.puertas);

    }
    //función de 3 parámetros que devuelve la suma de ellos
    public static int suma(int param1, int param2, int param3) {
        return param1 + param2 + param3;

    }
}
// crear una clase Coche
class Coche {

    public int puertas = 3; // variable que alamacene el número de puertas

    public void AnadirPuerta() { // función que incrementa el número de puertas
        this.puertas ++;
    }
}
