package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class Model {
    private Integer contador;


    public Model(){
        this.contador=0;

    }

    public Integer Suma(){
        contador++;
        return contador;

    }
    public Integer Resta(){
        contador--;
        return contador;

    }

}
