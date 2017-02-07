package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class PresenterImpl implements Presenter {

    private Mediator myMediator;


    public PresenterImpl(Mediator mediador) {

        //Creamos mediador pasado por parámetro
        myMediator = mediador;
        

    }


    //Llamada al modelo para realizar la operacion suma
    public void Sumar() {
        getModel().Suma();
        getView().onDisplay(getModel().getContador());
    }

    //Llamada al modelo para realizar la operacion resta
    public void Restar() {
        getModel().Resta();
        getView().onDisplay(getModel().getContador());

    }
    private MainView getView() {
        return myMediator.getView();
    }
    private Model getModel(){
        return  myMediator.getMyModel();
    }
}

