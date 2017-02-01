package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fuguBook on 9/7/16.
 */
public class ToDoPopulatorImageAdapterClass extends ArrayAdapter<ToDoPopulator> {

    public ToDoPopulatorImageAdapterClass(Activity context, int position, ArrayList<ToDoPopulator> toDoPopulatorArrayList) {
        super(context, 0, toDoPopulatorArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        ToDoPopulator currentToDoItem = getItem(position);

//        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_toDoName);
//        nameTextView.setText(currentToDoItem.toString("subject"));
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_img);
        imageView.setImageResource(currentToDoItem.toImage(R.drawable.acai_hdpi));

        return listItemView;
    }
}