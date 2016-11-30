package org.t_robop.kishimoto.testtextbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int random;
    boolean count = false;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        button.setText(R.string.button1);

        textView.setBackgroundResource(R.drawable.illust4783);

    }

    public void onClick(View v) {

        if (count == false) {

            int num = Secret.RandomNumber(random);

            switch (num) {

                case 0:
                    textView.setText("大吉");

                    break;

                case 1:
                    textView.setText("中吉");

                    break;

                case 2:
                    textView.setText("小吉");

                    break;

                case 3:
                    textView.setText("吉");
                    break;
                case 4:
                    textView.setText("凶");
                    break;

            }

            button.setText(R.string.Return);
            count = true;
        }

        else if (count == true) {

            textView.setText("おみくじ");

            button.setText(R.string.button1);

            count = false;
        }

    }

}

