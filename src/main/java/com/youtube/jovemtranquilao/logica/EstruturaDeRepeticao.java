package com.youtube.jovemtranquilao.logica;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {

        //listaDePalvras();
        //forClassico();
        //forPuro();
        inverteString();
    }

    private static void listaDePalvras() {
        List <String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        for (String palavra : palavraList){
            System.out.println(palavra);
        }

        //palavraList.forEach(palavra -> System.out.println(palavra);
    }

    private static void forClassico() {
        List <String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        for (int posicao = 0 ; posicao < palavraList.size(); posicao++){
            System.out.println(palavraList.get(posicao));
        }


    }

    private static void forPuro() {

        for (int posicao = 0 ; posicao <= 10; posicao++){
            System.out.println(posicao);
        }
    }

    private static void inverteString() {
        String normal = "12345";
        String invertida = "";

        for (int posicao = normal.length() - 1 ; posicao >= 0; posicao--){
            invertida += normal.charAt(posicao);
        }
        System.out.println(invertida);
    }

}
