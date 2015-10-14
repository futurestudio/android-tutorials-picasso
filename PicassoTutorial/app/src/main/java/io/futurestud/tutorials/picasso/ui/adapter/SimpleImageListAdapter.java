package io.futurestud.tutorials.picasso.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import io.futurestud.tutorials.picasso.R;

/**
 * Created by norman on 4/10/15.
 */
public class SimpleImageListAdapter extends ArrayAdapter {
    private Context context;
    private LayoutInflater inflater;

    private String[] imageUrls;

    public SimpleImageListAdapter(Context context, String[] imageUrls) {
        super(context, R.layout.listview_item_image, imageUrls);

        this.context = context;
        this.imageUrls = imageUrls;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.listview_item_image, parent, false);
        }

        Picasso
                .with(context)
                .load(imageUrls[position])
                .fit() // will explain later
                .into((ImageView) convertView);

        return convertView;
    }
}
