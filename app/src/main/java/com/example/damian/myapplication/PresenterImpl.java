package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class PresenterImpl implements Presenter {
    private Model model;
    private MainView view;
    private Mediator myMediator;


    public PresenterImpl(Mediator mediador) {

        //Creamos mediador pasado por parámetro
        myMediator = mediador;
        //Definimos modelo y vista a partir del mediador
        model = myMediator.getMyModel();
        view = myMediator.getView();
    }


    //Llamada al modelo para realizar la operacion suma
    public void Sumar() {
        model.Suma();
        view.onDisplay(model.getContador());
    }

    //Llamada al modelo para realizar la operacion resta
    public void Restar() {
        model.Resta();
        view.onDisplay(model.getContador());

    }
}

