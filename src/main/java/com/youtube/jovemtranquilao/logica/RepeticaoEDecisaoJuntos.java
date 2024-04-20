package com.youtube.jovemtranquilao.logica;

import java.util.ArrayList;
import java.util.List;

public class RepeticaoEDecisaoJuntos {
    public static void main(String[] args) {
        List<Integer> listaDeUmADez = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            listaDeUmADez.add(i);
        }

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (Integer numero : listaDeUmADez){
            if (numero % 2 == 0){
                numerosPares.add(numero);
            }
            else {
                numerosImpares.add(numero);
            }
        }

        for (Integer numeroPar : numerosPares){
            System.out.println(numeroPar);
        }

        System.out.println();

        for (Integer numeroImpar : numerosImpares){
            System.out.println(numeroImpar);
        }
    }

}
