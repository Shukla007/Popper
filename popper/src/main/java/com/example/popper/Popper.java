package com.example.popper;

import android.content.Context;
import android.widget.Toast;

public class Popper {
    public static void simplePop(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
