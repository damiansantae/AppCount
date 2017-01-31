package com.example.damian.myapplication;

/**
 * Created by Damian on 29/01/2017.
 */

public class PresenterImpl implements Presenter {
    private Model model;
    private MainView view;


    public PresenterImpl(MainView mainView) {
        model = new Model();
        view = mainView;


    }


    public void Sumar() {
        model.Suma();
        view.onDisplay(model.getContador());

    }

    public void Restar() {
        model.Resta();
        view.onDisplay(model.getContador());

    }
}

