package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class PresenterImpl implements Presenter {
    private Model model;



    public PresenterImpl(){
        model = new Model();

    }


    public void Sumar(){
        Integer numero=model.Suma();
        onDisplay(numero);

    }
    public void Restar(){
        Integer numero= model.Resta();
        onDisplay(numero);


    }
    public void onDisplay (Integer numero){
        MainView.onDisplay(numero);
    }
}
