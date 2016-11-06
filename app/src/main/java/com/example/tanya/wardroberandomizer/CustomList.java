package com.example.tanya.wardroberandomizer;

/**
 * Created by tanya on 11/6/16.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {
    private Integer[] imageid;
    private Activity context;

    public CustomList(Activity context, Integer[] imageid) {
        super(context, R.layout.list_view, new String[imageid.length]);
        this.context = context;
        this.imageid = imageid;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_view, null, true);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);

        image.setImageResource(imageid[position]);
        return listViewItem;
    }
}