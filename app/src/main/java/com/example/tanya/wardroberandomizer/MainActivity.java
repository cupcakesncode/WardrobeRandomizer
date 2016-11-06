package com.example.tanya.wardroberandomizer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class MainActivity extends ActionBarActivity{
    Button addCloset, viewCloset, enter;
    int temp;
    boolean isADress;
    private EditText temperature;
    String top, bottom, dress, shoes, coat, acc;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wardrobe_randomizer);
        imageView = (ImageView) findViewById(R.id.img_outfit);
        temperature = (EditText) findViewById(R.id.editText);
        enter = (Button) findViewById(R.id.Enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Integer.parseInt(temperature.getText().toString());
                if (temp > 90){
                    imageView.setImageResource(R.drawable.stay_home);

                }
                else if (temp > 85){
                    Random random = new Random();
                    int value = random.nextInt(1);
                    if (value == 1){
                        imageView.setImageResource(R.drawable.dress_outfit);
                    } else {
                        imageView.setImageResource(R.drawable.shorts_outfit);
                    }
                }
                else if (temp > 80){
                    Random random = new Random();
                    int value = random.nextInt(1);
                    if (value == 1){
                        imageView.setImageResource(R.drawable.dress_outfit);
                    } else {
                        imageView.setImageResource(R.drawable.eighty_degrees);
                    }
                }
                else if (temp > 75){
                    Random random = new Random();
                    int value = random.nextInt(1);
                    if (value == 1){
                        imageView.setImageResource(R.drawable.dress_outfit);
                    } else {
                        imageView.setImageResource(R.drawable.seventyfive_degrees);
                    }
                }
                else if (temp > 70){
                    imageView.setImageResource(R.drawable.seventy_degrees);
                }else if (temp > 65){
                    imageView.setImageResource(R.drawable.sixtyfive_degrees);
                }
                else if (temp >= 60){
                    imageView.setImageResource(R.drawable.sixty_degrees);
                } else if (temp >= 55){
                    imageView.setImageResource(R.drawable.fiftyfive_degrees);
                } else if (temp >= 50){
                    imageView.setImageResource(R.drawable.fifty_degrees);
                } else if (temp >= 45){
                    imageView.setImageResource(R.drawable.fourtyfive_degrees);
                } else if (temp >= 40){
                    imageView.setImageResource(R.drawable.fourty_degrees);
                } else if (temp >= 35){
                    imageView.setImageResource(R.drawable.thirtyfive_degrees);
                } else if (temp >= 30){
                    imageView.setImageResource(R.drawable.thirty_degrees);
                } else if (temp >= 25){
                    imageView.setImageResource(R.drawable.twentyfive_degrees);
                } else {
                    imageView.setImageResource(R.drawable.stay_home);
                }


            }
        });
        addCloset = (Button) findViewById(R.id.addCloset);
        addCloset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddClothesActivity.class);
                startActivity(intent);
            }
        });
        viewCloset = (Button) findViewById(R.id.viewCloset);
        viewCloset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ViewClosetActivity.class);
                startActivity(intent);
            }
        });

    }

}