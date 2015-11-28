package com.cours644_1.maa_bom.ittrainingapp.Settings;

import com.cours644_1.maa_bom.ittrainingapp.R;

/**
 * Created by Maximilien on 23.11.2015.
 */
public enum FontStyle {
    Small(R.style.FontStyle_Small, "Small"),
    Medium(R.style.FontStyle_Medium, "Medium"),
    Large(R.style.FontStyle_Large, "Large");

    private int resId;
    private String title;

    public int getResId() {
        return resId;
    }

    public String getTitle() {
        return title;
    }

    FontStyle(int resId, String title) {
        this.resId = resId;
        this.title = title;
    }
}