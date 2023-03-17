package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.calculator.databinding.ActivityMainBinding;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    String data;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.clearButtonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editext.setText(null);
            }
        });

        binding.sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                //find value
                binding.editext.setText(data+"7");
            }
        });

        binding.eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"8");
            }
        });

        binding.nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"9");
            }
        });



        binding.divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"÷");
            }
        });

        binding.fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"4");
            }
        });

        binding.fiveutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"5");
            }
        });

        binding.sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"6");
            }
        });

        binding.multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"×");
            }
        });

        binding.oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"1");
            }
        });

        binding.twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"2");
            }
        });

        binding.threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"3");
            }
        });

        binding.sabtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"-");
            }
        });

        binding.zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"0");
            }
        });

        binding.pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+".");
            }
        });



        binding.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();
                binding.editext.setText(data+"+");
            }
        });

        binding.equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = binding.editext.getText().toString();

                data = data.replaceAll("÷","/");
                data = data.replaceAll("×","*");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String result="";

                Scriptable scriptable = rhino.initStandardObjects();
                result = rhino.evaluateString(scriptable, data, "Javsscript", 1, null).toString();


                binding.editext.setText(result);

            }
        });



    }
}