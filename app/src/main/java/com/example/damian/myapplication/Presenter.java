package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class Presenter {
    private Model model;

    public Presenter (){
        model = new Model();
    }

    public Integer onClicked(Integer operacion){

        return model.onClicked(operacion);

    }
}
