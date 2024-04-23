package com.youtube.jovemtranquilao.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) {

        numeroPar();
        stringIgual();
        stringInicia();
        datas();

    }
    private static void numeroPar(){
        Integer numero = 2;

        if (numero % 2 == 0) {
            //executo codigo daqui verdadeiro
            System.out.println("par");
        }
        else {
            //executo aqui quando falso
            System.out.println("impar");

        }
    }
    private static void stringIgual(){
        String frase = "hoje e segunda feira seis da tarde";

        if (frase.contains("segunda feira")) {
            if (frase.contains("seis da tarde")){
                System.out.println("hora de alegria");
            }
            else{
                System.out.println(" dia de tristeza");
            }
        }
        else if(frase.contains("sexta feira") || frase.contains("sabado") || frase.contains("domingo")) {
            System.out.println("dia de alegria");
        }
        else {
            System.out.println("dia normal");
        }
    }

    private static void stringInicia(){
        String palavra = "Jonas";

        if (palavra.startsWith("a")) {
            System.out.println("palavra iniciada em a");
        }
        else {
            System.out.println("palavra iniciada com outra letra");
        }
    }

    private static void datas() {
        try {
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/04/2024");
            if (data.before(new Date())){
                System.out.println("esse dia ja passou");
            }
            else {
                System.out.println("esse dia esta por vir");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
