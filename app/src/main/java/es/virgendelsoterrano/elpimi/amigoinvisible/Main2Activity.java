package es.virgendelsoterrano.elpimi.amigoinvisible;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.TextView;
import android.widget.Toast;



public class Main2Activity extends AppCompatActivity {
    private TextView TvTituloapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Intent intent =new Intent(Main2Activity.this, MainActivity.class);


        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                Main2Activity.this.finish();
            }
        });

        //Localizar los controles
        TvTituloapp = (TextView)findViewById(R.id.tituloapp2);

        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        TvTituloapp.setText(bundle.getString("TITULOAPP"));
    }
}

