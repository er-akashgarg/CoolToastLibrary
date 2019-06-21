package com.akashgarg.cooltoast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author akashgarg
 */

@SuppressLint("StaticFieldLeak")
public class CoolToast extends AppCompatActivity {

    private final static CoolToast INSTANCE = new CoolToast();
    //    static LayoutInflater inflater;
    static Toast toast;
    static TextView text;

    public static CoolToast successToast(Activity activity, String message) {
        Toast toast = new Toast(activity);
        toast.setDuration(Toast.LENGTH_LONG);
        View view = LayoutInflater.from(activity).inflate(R.layout.layout_cool_toast,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container), false);
        text = view.findViewById(R.id.header1);
        text.setText(message);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            view.setBackground(activity.getDrawable(R.drawable.success_corner));
        }
        toast.setView(view);
        toast.show();
        return INSTANCE;

    }

    public static CoolToast errorToast(Activity activity, String message) {
        Toast toast = new Toast(activity);
        toast.setDuration(Toast.LENGTH_LONG);
        View view = LayoutInflater.from(activity).inflate(R.layout.layout_cool_toast,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container), false);
        text = view.findViewById(R.id.header1);
        text.setText(message);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            view.setBackground(activity.getDrawable(R.drawable.error_corner));
        }
        toast.setView(view);
        toast.show();
        return INSTANCE;

    }

    public static CoolToast customToast(Activity activity, String message,
                                        int backgroundColorCode, int textColorCode) {
        Toast toast = new Toast(activity);
        toast.setDuration(Toast.LENGTH_LONG);
        View view = LayoutInflater.from(activity).inflate(R.layout.layout_cool_toast,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container), false);
        text = view.findViewById(R.id.header1);
        text.setText(message);
//        text.setTextColor(textColorCode);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            view.setBackground(activity.getDrawable(R.drawable.custom_corner));
        }

        toast.setView(view);
        toast.show();
        return INSTANCE;
    }

    public CoolToast setPositionAndOffSet(int position, int xOffset, int yOffset) {
        toast.setGravity(position, xOffset, yOffset);
        return INSTANCE;
    }

    public CoolToast setTextSize(float size) {
        text.setTextSize(size);
        return INSTANCE;
    }

    public CoolToast setPadding(int padding) {
        text.setPadding(padding, padding, padding, padding);
        return INSTANCE;
    }

    public CoolToast setFontStyle(Activity activity, int fontType) {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Typeface typeface = activity.getResources().getFont(fontType);
            text.setTypeface(typeface);
        } else {
            Typeface typeface = ResourcesCompat.getFont(activity, fontType);
            text.setTypeface(typeface);
        }
        return INSTANCE;
    }

}



















/*
*

//        inflater = activity.getLayoutInflater();
//        View layout = inflater.inflate(R.layout.layout_cool_toast,
//                (ViewGroup) activity.findViewById(R.id.custom_toast_container));
//
//        layout.setBackgroundColor(activity
//                .getResources().getColor(R.color.error_color));
//
//        text = layout.findViewById(R.id.header1);
//        text.setText(message);
//
//        toast = new Toast(activity);
//
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(layout);
//        toast.show();

* */