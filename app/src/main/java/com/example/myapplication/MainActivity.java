package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private int count = 0;
        private Button button;
        private TextView textView;
        final String LOG_TAG = "myLogs";

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
        Log.d(LOG_TAG, "onSaveInstanceState");
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("count");
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = findViewById(R.id.button);
            textView = findViewById(R.id.textView2);
        }

        public void onButtonClick(View view) {

            //увеличиваем переменную счетчик
            count++;
            textView.setText(Integer.toString(count));

        }
            @Override
            protected void onStart() {
                Toast toast = Toast.makeText(getApplicationContext(),"onStart()", Toast.LENGTH_SHORT);
                toast.show();
                super.onStart();
            }

            @Override
            protected void onStop() {
                Toast toast = Toast.makeText(getApplicationContext(),"onStop()", Toast.LENGTH_SHORT);
                toast.show();
                super.onStop();
            }


            @Override
            protected void onDestroy() {
                Toast toast = Toast.makeText(getApplicationContext(),"onDestroy()", Toast.LENGTH_SHORT);
                toast.show();
                super.onDestroy();
            }

            @Override
            protected void onPause() {
                Toast toast = Toast.makeText(getApplicationContext(),"onPause()", Toast.LENGTH_SHORT);
                toast.show();
                super.onPause();
            }

            @Override
            protected void onResume() {
                Toast toast = Toast.makeText(getApplicationContext(),"onResume()", Toast.LENGTH_SHORT);
                toast.show();
                super.onResume();
            }
        }



