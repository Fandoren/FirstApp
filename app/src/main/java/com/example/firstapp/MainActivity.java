package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "hello";

    Button button;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv= (ImageView)findViewById(R.id.country_flag);
        iv.setImageResource(R.drawable.unitedkingdom);
        TextView sometext = (TextView)findViewById(R.id.SomeText);
        if(Locale.getDefault().getDisplayLanguage().equals("русский"))
            iv.setImageResource(R.drawable.russia);
        if(Locale.getDefault().getDisplayLanguage().equals("український"))
            iv.setImageResource(R.drawable.ukrain);

        button = (Button)findViewById(R.id.btnshow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                iv.startAnimation(animation);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.basic_menu, menu);
        return true;
    }

}