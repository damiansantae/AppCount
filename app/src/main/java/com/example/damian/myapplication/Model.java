package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class Model {
    private Integer contador;


    public Model(){
        this.contador=0;

    }

    public void Suma(){
        contador++;


    }
    public void Resta(){
        contador--;


    }
    public Integer getContador(){
        return contador;
    }

}
