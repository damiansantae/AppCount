package com.example.damian.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainView extends Activity {

    private static TextView display;
    private Button boton1;
    private Button boton2;
    private PresenterImpl presenter;
    private Mediator mediator;


    //Listener para el boton de suma
    class MyButtonListener1 implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            presenter.Sumar();
        }
    }

    //Listener para el boton de resta
    class MyButtonListener2 implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            presenter.Restar();
        }
    }

    //Metodo que actualiza el TextView con el numero acumulado
    public void onDisplay(Integer numero){

        display.setText(numero.toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Asignamos los objetos a los diferentes elementos en pantalla
        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.display);

        //Configuramos un listener para cada boton
        boton2.setOnClickListener(new MyButtonListener2());
        boton1.setOnClickListener(new MyButtonListener1());


        //Creamos objeto mediador
       mediator = (Mediator) getApplication();
        //mediante el mediador obtenemos nuestro presentador
        presenter = (PresenterImpl) mediator.getPresenter();

    }

}
