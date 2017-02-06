package com.example.damian.myapplication;

import android.app.Application;

/**
 * Created by Damian on 02/02/2017.
 */

public class Mediator extends Application {

    private PresenterImpl myPresenter;
    private MainView myView;
    private Model myModel;

    @Override
    public void onCreate() {

        super.onCreate();
        myView= new MainView();
        myModel = new Model();
        myPresenter = new PresenterImpl(this);


    }
    public Presenter getPresenter() {
        return myPresenter;
    }

    public MainView getView() {
        return myView;
    }
    public Model getMyModel() {
        return myModel;
    }

}
