package com.vdx.animatedtoastdemo;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.vdx.animatedtoast.AnimatedToast;

public class MainActivity extends AppCompatActivity {
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dark();
    }

    private void light() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                switch (i) {
                    case 0:
                        AnimatedToast.Success(getApplicationContext(), "Success", Gravity.TOP, Toast.LENGTH_SHORT, AnimatedToast.ANIMATION_ROTATE);
                        break;
                    case 1:
                        AnimatedToast.Error(getApplicationContext(), "Error", Gravity.CENTER, Toast.LENGTH_SHORT, AnimatedToast.ANIMATION_BLINK);
                        break;

                    case 2:
                        AnimatedToast.Info(getApplicationContext(), "Info", Gravity.BOTTOM, Toast.LENGTH_SHORT, AnimatedToast.ANIMATION_FLIP);
                        break;

                    case 3:
                        AnimatedToast.Warning(getApplicationContext(), "Warning", Gravity.CENTER, Toast.LENGTH_SHORT, AnimatedToast.ANIMATION_PULSE);
                        break;
                    default:
                        break;

                }
                i++;
            }
        }, 1000);
    }

    private void dark() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                switch (i) {
                    case 0:
                        AnimatedToast.Success(getApplicationContext(), "Success", "Hello this is demo success!", Gravity.TOP, Toast.LENGTH_LONG, AnimatedToast.STYLE_DARK, AnimatedToast.ANIMATION_ROTATE);
                        break;
                    case 1:
                        AnimatedToast.Error(getApplicationContext(), "Error", "Hello this is demo error!", Gravity.CENTER, Toast.LENGTH_LONG, AnimatedToast.STYLE_DARK, AnimatedToast.ANIMATION_BLINK);
                        break;

                    case 2:
                        AnimatedToast.Info(getApplicationContext(), "Info", "Hello this is demo info!", Gravity.BOTTOM, Toast.LENGTH_LONG, AnimatedToast.STYLE_DARK, AnimatedToast.ANIMATION_FLIP);
                        break;

                    case 3:
                        AnimatedToast.Warning(getApplicationContext(), "Warning", "Hello this is demo warning!", Gravity.CENTER, Toast.LENGTH_LONG, AnimatedToast.STYLE_DARK, AnimatedToast.ANIMATION_PULSE);
                        break;
                    default:
                        break;

                }
                i++;
            }
        }, 1000);
    }
}
