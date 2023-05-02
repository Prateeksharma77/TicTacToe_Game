package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);
        TextView congrats=findViewById(R.id.congratulations_textview);
        Button btn=findViewById(R.id.play_again_button);
        Intent i = getIntent();
        String name= i.getStringExtra("playerName");
        String namesend=i.getStringExtra("name1");
        String namesend2=i.getStringExtra("name2");
        congrats.setText("Congratulations!  "+ name );
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),game.class);
                intent.putExtra("name1",namesend);
                intent.putExtra("name2",namesend2);

                startActivity(intent);
            }
        });

    }
}
