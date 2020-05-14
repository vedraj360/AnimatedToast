package com.vdx.animatedtoast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class AnimatedToast {

    public final static String STYLE_DARK = "STYLE_DARK";
    public final static int ANIMATION_PULSE = 0;
    public final static int ANIMATION_ROTATE = 1;
    public final static int ANIMATION_BLINK = 2;
    public final static int ANIMATION_FLIP = 3;

    public static void defaultToast(Context context, String message, int gravity, int duration, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            RelativeLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            setAnimation(context, toast_icon, animationType);
            background.setBackground(context.getResources().getDrawable(R.drawable.default_background));
            toast_message.setText(message);
            toast_icon.setVisibility(View.GONE);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "defaultToast: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT, ANIMATION_BLINK);
        }

    }

    public static void Success(Context context, String message, int gravity, int duration, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            RelativeLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            setAnimation(context, toast_icon, animationType);
            background.setBackground(context.getResources().getDrawable(R.drawable.success_background));
            toast_message.setText(message);
            toast_icon.setImageResource(R.drawable.ic_success_2);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Success: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT, ANIMATION_BLINK);
        }

    }


    public static void Success(Context context, String message, String description, int gravity, int duration, String themeType, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.dark_layout, null, false);
            TextView toast_message = layout.findViewById(R.id.dark_toast_message);
            TextView toast_description = layout.findViewById(R.id.dark_toast_description);
            ImageView toast_icon = layout.findViewById(R.id.dark_toast_icon);
            setAnimation(context, toast_icon, animationType);
            toast_message.setTextColor(context.getResources().getColor(R.color.success_color));
            toast_message.setText(message);
            toast_description.setText(description);
            toast_icon.setImageResource(R.drawable.ic_success_2);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Success: ", e);
        }

    }

    public static void Error(Context context, String message, int gravity, int duration, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            RelativeLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            background.setBackground(context.getResources().getDrawable(R.drawable.error_background));
            toast_message.setText(message);
            setAnimation(context, toast_icon, animationType);
            toast_icon.setImageResource(R.drawable.ic_error_2);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Error: ", e);
        }
    }

    public static void Error(Context context, String message, String description, int gravity, int duration, String themeType, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.dark_layout, null, false);
            TextView toast_message = layout.findViewById(R.id.dark_toast_message);
            TextView toast_description = layout.findViewById(R.id.dark_toast_description);
            ImageView toast_icon = layout.findViewById(R.id.dark_toast_icon);
            setAnimation(context, toast_icon, animationType);
            toast_message.setText(message);
            toast_message.setTextColor(context.getResources().getColor(R.color.error_color));
            toast_description.setText(description);
            toast_icon.setImageResource(R.drawable.ic_error_2);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Error: ", e);
        }
    }


    public static void Warning(Context context, String message, int gravity, int duration, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            RelativeLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            background.setBackground(context.getResources().getDrawable(R.drawable.warning_background));
            setAnimation(context, toast_icon, animationType);
            toast_message.setText(message);
            toast_icon.setImageResource(R.drawable.ic_warning_2);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Warning: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT, ANIMATION_BLINK);


        }
    }


    public static void Warning(Context context, String message, String description, int gravity, int duration, String themeType, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.dark_layout, null, false);
            TextView toast_message = layout.findViewById(R.id.dark_toast_message);
            TextView toast_description = layout.findViewById(R.id.dark_toast_description);
            ImageView toast_icon = layout.findViewById(R.id.dark_toast_icon);
            setAnimation(context, toast_icon, animationType);
            toast_message.setText(message);
            toast_message.setTextColor(context.getResources().getColor(R.color.warning_color));
            toast_description.setText(description);
            toast_icon.setImageResource(R.drawable.ic_warning_2);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Warning: ", e);

        }
    }

    public static void Info(Context context, String message, int gravity, int duration, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            RelativeLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            setAnimation(context, toast_icon, animationType);
            background.setBackground(context.getResources().getDrawable(R.drawable.info_background));
            toast_message.setText(message);
            toast_icon.setImageResource(R.drawable.ic_info_2);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Info: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT, ANIMATION_BLINK);
        }
    }

    public static void Info(Context context, String message, String description, int gravity, int duration, String themeType, int animationType) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.dark_layout, null, false);
            TextView toast_message = layout.findViewById(R.id.dark_toast_message);
            TextView toast_description = layout.findViewById(R.id.dark_toast_description);
            ImageView toast_icon = layout.findViewById(R.id.dark_toast_icon);
            setAnimation(context, toast_icon, animationType);
            toast_message.setText(message);
            toast_message.setTextColor(context.getResources().getColor(R.color.info_color));
            toast_description.setText(description);
            toast_icon.setImageResource(R.drawable.ic_info_2);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Info: ", e);
        }
    }


    private static void setAnimation(Context context, ImageView toast_icon, int animationType) {
        switch (animationType) {
            case ANIMATION_PULSE:
                toast_icon.setAnimation(AnimationUtils.loadAnimation(context, R.anim.pulse));
                break;
            case ANIMATION_ROTATE:
                toast_icon.setAnimation(AnimationUtils.loadAnimation(context, R.anim.rotate));
                break;
            case ANIMATION_BLINK:
                toast_icon.setAnimation(AnimationUtils.loadAnimation(context, R.anim.blink));
                break;
            case ANIMATION_FLIP:
                toast_icon.setAnimation(AnimationUtils.loadAnimation(context, R.anim.flip));
                break;
        }
    }
}
