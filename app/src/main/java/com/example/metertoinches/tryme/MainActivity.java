package com.example.metertoinches.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View windowview;
    private Button tryme;

    private  int[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors = new int[]{Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.RED};
        windowview = findViewById(R.id.WindowViewId);


        tryme = (Button) findViewById(R.id.tryme) ;
        tryme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length =colors.length;
                Random random = new Random();
                int randomnum = random.nextInt(length);
               // Log.d("test","tap");
                windowview.setBackgroundColor(colors[randomnum]);
            }
        });
    }
}
