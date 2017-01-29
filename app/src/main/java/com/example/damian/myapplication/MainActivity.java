package com.example.damian.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView display;
    private Button boton1;
    private Button boton2;
    private Presenter presenter;





    class MyButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {

//            switch (view.getId()){
//            case R.id.button1:
//            counter++;
//            case R.id.button2:
//              counter--;
//            }
            Integer counter = 0;

            if((view.getId())==(R.id.button1)){
                counter=presenter.onClicked(1);
            }else {
                counter= presenter.onClicked(2);
            }

            display.setText(counter.toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.display);
        boton2.setOnClickListener(new MyButtonListener());

        boton1.setOnClickListener(new MyButtonListener());
        presenter = new Presenter();



    }

}
