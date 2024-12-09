package com.mireia.checkbuttonejercicio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBoxApple = findViewById(R.id.checkBoxApple);
        CheckBox checkBoxBanana = findViewById(R.id.checkBoxBanana);
        CheckBox checkBoxOrange = findViewById(R.id.checkBoxOrange);
        CheckBox checkBoxPineapple = findViewById(R.id.checkBoxPineapple);

        TextView textViewResult = findViewById(R.id.textViewResult);

        Button buttonEat = findViewById(R.id.buttonEat);

        buttonEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder selectedFruits = new StringBuilder();

                if (checkBoxApple.isChecked()) {
                    selectedFruits.append("Manzana, ");
                }
                if (checkBoxBanana.isChecked()) {
                    selectedFruits.append("Plátano, ");
                }
                if (checkBoxOrange.isChecked()) {
                    selectedFruits.append("Naranja, ");
                }
                if (checkBoxPineapple.isChecked()) {
                    selectedFruits.append("Piña, ");
                }

                if (selectedFruits.length() > 0) {
                    selectedFruits.setLength(selectedFruits.length() - 2);
                } else {
                    selectedFruits.append("No seleccionaste ninguna fruta.");
                }

                textViewResult.setText(selectedFruits.toString());
            }
        });
    }
}