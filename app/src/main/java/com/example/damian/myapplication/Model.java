package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class Model {
    private Integer contador;


    public Model(){
        this.contador=0;

    }

    //Incrementa el valor y almacena resultado
    public void Suma(){
        contador++;


    }

    //Decrementa el valor y almacena resultado
    public void Resta(){
        contador--;
    }

    //Método que devuelve el número acumulado
    public Integer getContador(){
        return contador;
    }

}
