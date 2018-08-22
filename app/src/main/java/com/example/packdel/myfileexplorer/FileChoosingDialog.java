package com.example.packdel.myfileexplorer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.view.Window;

public class FileChoosingDialog extends Dialog{

    public FileChoosingDialog(@NonNull Context context, Activity activity) {
        super(context);

        this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        this.getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        setContentView(com.nbsp.materialfilepicker.R.layout.activity_file_picker);
    }

    public void setup() {
    }
}
