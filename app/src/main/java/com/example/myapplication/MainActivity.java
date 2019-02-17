package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button secScrn;

    public void switchCat(View view){
        ImageView catFemale = findViewById(R.id.catMale_ID);
        TextView  displayText = findViewById(R.id.displayTxt);
        String message = getString(R.string.female_cat_description);
        displayText.setText(message);
        catFemale.setImageResource(R.drawable.cat_female);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secScrn = findViewById(R.id.nxtScrn_btn_ID);
        secScrn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                secondScreen();
            }
        });
    }
    
    //create an intent within the secondScreen method to fetch the new screen
    public void secondScreen(){
        Intent intent = new Intent(this, DisplaySecondScreen.class);
        startActivity(intent);

    }
}
