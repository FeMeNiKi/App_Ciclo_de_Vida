package com.example.life_cycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.i("Ciclo de Vida","Método onCreate ativado.");
       btnAbrir = (Button) findViewById(R.id.cmdAbrir);
       btnAbrir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
               startActivity(intencao);
           }
       });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de Vida","Método onStart ativado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo de Vida","Método onResume ativado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo de Vida", "Método onPause ativado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo de Vida","Método onStop ativado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo de Vida", "Método onRestart ativado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo de Vida","Método onDestry ativado");
    }
}