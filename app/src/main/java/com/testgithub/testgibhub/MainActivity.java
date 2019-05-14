package com.testgithub.testgibhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "mensaje para ver diferenciasss", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "segundo mensaje de prueba", Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "tercer mensaje de prueba ", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "cuarto mensaje de pruebass", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "quinto mensaje pruebas", Toast.LENGTH_SHORT).show();
    }

    private void procedimientoTest(){
        Toast.makeText(this, "procedimiento de prueba", Toast.LENGTH_SHORT).show();
    }



}
