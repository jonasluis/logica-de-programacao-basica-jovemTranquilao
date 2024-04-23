package com.youtube.jovemtranquilao.orientaoAObjetos;

import java.util.Date;

public class Maternidade {

    public  Pessoa nascer(String name, String sexo){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(name);
        pessoa.setSexo(sexo);
        pessoa.setDataDeNascimento(new Date());
        return pessoa;
    }

}
