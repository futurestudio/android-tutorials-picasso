package io.futurestud.tutorials.picasso.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import io.futurestud.tutorials.picasso.R;

/**
 * Created by norman on 4/10/15.
 */
public class AdvancedImageListAdapter extends ArrayAdapter {
    private Context context;
    private LayoutInflater inflater;

    private String[] imageUrls;

    public AdvancedImageListAdapter(Context context, String[] imageUrls) {
        super( context, R.layout.listview_item_image, imageUrls );

        this.context = context;
        this.imageUrls = imageUrls;

        inflater = LayoutInflater.from( context );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = inflater.inflate( R.layout.listview_item_advanced, parent, false );
        }

        ImageView imageView = (ImageView) convertView.findViewById( R.id.listview_item_advanced_imageview );
        TextView textView = (TextView) convertView.findViewById( R.id.listview_item_advanced_text );

        textView.setText( "Position " + position );

        Picasso
                .with( context )
                .load( imageUrls[position] )
                .fit()
                .centerCrop()
                .into( imageView );

        return convertView;
    }
}
