package com.example.android.tourguideapp;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by fuguBook on 9/7/16.
 */
public class ToDoPopulator {

    private String mToDoName;
    private int mDrawable;

    public ToDoPopulator(String toDoName) {
        mToDoName = toDoName;
    }

    public ToDoPopulator(int drawable) {
        mDrawable = drawable;
    }

    public String toString(String string) {
       return mToDoName;
    }

    public int toImage(int drawable) {
        return mDrawable;
    }
}
