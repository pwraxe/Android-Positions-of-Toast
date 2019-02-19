package com.example.akshay.toasttype__position;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button fillT,fillVertical,fillHori,bottomT,TopT,rightT,leftT,rhgm,centerGravity,horiGravimask,defaultT,no_gravity;
    Toast t;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillT = findViewById(R.id.fill);
        fillVertical = findViewById(R.id.fill_verti);
        fillHori = findViewById(R.id.fill_hori);
        bottomT = findViewById(R.id.bottom);
        TopT = findViewById(R.id.top);
        rightT = findViewById(R.id.right);
        leftT = findViewById(R.id.left);
        rhgm = findViewById(R.id.relativeHoriGraMask);
        centerGravity = findViewById(R.id.center_gravity);
        horiGravimask = findViewById(R.id.fill_hori_GM);
        defaultT = findViewById(R.id.default_toast);
        no_gravity = findViewById(R.id.noGravity_toast);


        //getToast(v);


    }

    public void getToast(View v)
    {



        switch (v.getId())
        {
            case R.id.fill :
                t = Toast.makeText(MainActivity.this,"Fill Horizontal and Vertical",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.FILL,0,0);
                t.show();
                break;

            case R.id.fill_verti:
                t = Toast.makeText(MainActivity.this,"FILL_VERTICAL",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.FILL_VERTICAL,0,0);
                t.show();
                break;
            case R.id.fill_hori:
                t = Toast.makeText(MainActivity.this,"FILL_HORIZONTAL",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.FILL_HORIZONTAL,0,0);
                t.show();
                break;
            case R.id.bottom:
                t = Toast.makeText(MainActivity.this,"BOTTOM",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.BOTTOM,0,0);
                t.show();
                break;

            case R.id.top:
                t = Toast.makeText(MainActivity.this,"TOP",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP,0,0);
                t.show();
                break;

            case R.id.right:
                t = Toast.makeText(MainActivity.this,"RIGHT",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.RIGHT,0,0);
                t.show();
                break;
            case R.id.left:
                t = Toast.makeText(MainActivity.this,"LEFT",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.LEFT,0,0);
                t.show();
                break;
            case R.id.relativeHoriGraMask:
                t = Toast.makeText(MainActivity.this,"RELATIVE_HORIZONTAL_GRAVITY_MASK",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK,0,0);
                t.show();
                break;

            case R.id.center_gravity:
                t = Toast.makeText(MainActivity.this,"CENTER",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
                break;

            case R.id.fill_hori_GM:
                t = Toast.makeText(MainActivity.this,"HORIZONTAL_GRAVITY_MASK",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.HORIZONTAL_GRAVITY_MASK,0,0);
                t.show();
                break;

            case R.id.default_toast:
                Toast.makeText(MainActivity.this,"DEFAULT TOAST",Toast.LENGTH_SHORT).show();

                break;

            case R.id.noGravity_toast:
                t = Toast.makeText(MainActivity.this,"NO_GRAVITY",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.NO_GRAVITY,0,0);
                t.show();
                break;
        }

    }


}
