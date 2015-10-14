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
        ViewHolder viewHolder;

        if (null == convertView) {
            convertView = inflater.inflate( R.layout.listview_item_advanced, parent, false );

            viewHolder = new ViewHolder();
            viewHolder.text = (TextView) convertView.findViewById( R.id.listview_item_advanced_text );
            viewHolder.icon = (ImageView) convertView.findViewById( R.id.listview_item_advanced_imageview );

            convertView.setTag( viewHolder );
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.text.setText( "Position " + position );

        Picasso
                .with( context )
                .load( imageUrls[position] )
                .fit()
                .centerCrop()
                .into( viewHolder.icon );

        return convertView;
    }

    static class ViewHolder {
        TextView text;
        ImageView icon;
    }
}
