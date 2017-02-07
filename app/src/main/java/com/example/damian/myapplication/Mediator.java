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

    }


    public Presenter getPresenter() {

        if (myPresenter==null){
           myPresenter= new PresenterImpl(this);
        }
        return myPresenter;
    }

    public MainView getView() {
        return myView;
    }
    public Model getMyModel() {
        if (myModel==null){
            myModel= new Model();
        }
        return myModel;

    }

    public void setMyView(MainView view){
        this.myView=view;
    }

}
