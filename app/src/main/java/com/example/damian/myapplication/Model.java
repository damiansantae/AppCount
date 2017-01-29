package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class Model {
    private Integer contador;

    public Model(){
        this.contador=0;
    }

    public Integer onClicked(Integer operacion){
        if(operacion==1){                               //1 para suma
            contador++;
        }else {                                         //2 restar
            contador--;
        }
        return contador;
    }

}
