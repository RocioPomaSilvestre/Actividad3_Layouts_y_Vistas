package com.rocio.poma.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Imagenes10Activity extends AppCompatActivity {
    ImageView contenedor;
    Button btnsaltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagenes10);
//PARA IR A TABLELAYOUT
        Button btntableLayout;
        btntableLayout =findViewById(R.id.btntableLayout);

        btntableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TablelayoutActivity.class);
                startActivity(i);
            }
        });
  //

  //PARA CAMBIAR 10 IMAGENES
        contenedor=(ImageView)findViewById(R.id.contenedor);
        btnsaltar=(Button)findViewById(R.id.btnsaltar);

        btnsaltar.setOnClickListener(new View.OnClickListener() {
            Integer c=0;
            @Override
            public void onClick(View v) {
                for (int i=0;i<10;i++){
                    if (c%10==0){
                        contenedor.setImageResource(R.drawable.a2);
                    }
                    else if (c%10==1){
                        contenedor.setImageResource(R.drawable.a3);
                    }
                    else if (c%10==2){
                        contenedor.setImageResource(R.drawable.a4);
                    }
                    else if (c%10==3){
                        contenedor.setImageResource(R.drawable.a5);
                    }
                    else if (c%10==4){
                        contenedor.setImageResource(R.drawable.a6);
                    }
                    else if (c%10==5){
                        contenedor.setImageResource(R.drawable.a7);
                    }
                    else if (c%10==6){
                        contenedor.setImageResource(R.drawable.a8);
                    }
                    else if (c%10==7){
                        contenedor.setImageResource(R.drawable.a9);
                    }
                    else if (c%10==8){
                        contenedor.setImageResource(R.drawable.a10);
                    }
                    else if (c%10==9){
                        contenedor.setImageResource(R.drawable.a1);
                    }
                }
                c++;
            }
        });

    }
}