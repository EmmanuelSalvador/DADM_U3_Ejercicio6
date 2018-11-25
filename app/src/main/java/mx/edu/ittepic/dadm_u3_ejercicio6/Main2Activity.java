package mx.edu.ittepic.dadm_u3_ejercicio6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = getIntent().getExtras().getInt("Opcion");
        setContentView(new Lienzo2(this,i));
    }
}
