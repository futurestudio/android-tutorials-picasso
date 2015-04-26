package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.futurestud.tutorials.picasso.R;

public class UsageExampleTargetsAndRemoteViews extends ActionBarActivity {


    @InjectView(R.id.standard_list_imageview1) ImageView imageViewPlaceholder;
    @InjectView(R.id.standard_list_imageview2) ImageView imageViewError;
    @InjectView(R.id.standard_list_imageview3) ImageView imageViewFade;
    @InjectView(R.id.standard_list_imageview4) ImageView imageViewCombined;
    @InjectView(R.id.standard_list_imageview5) ImageView imageViewNoPlaceholder;

    private Context context = this;
    private Target target = new Target() {
        @Override
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
            // loading of the bitmap was a success
            // TODO do some action with the bitmap
        }

        @Override
        public void onBitmapFailed(Drawable errorDrawable) {
            // loading of the bitmap failed
            // TODO do some action/warning/error message
        }

        @Override
        public void onPrepareLoad(Drawable placeHolderDrawable) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standard_imageview);
        ButterKnife.inject(this);

        loadImageBitmapWithTarget();
    }

    private void loadImageBitmapWithTarget() {
        Picasso
                .with(context)
                .load(UsageExampleListViewAdapter.eatFoodyImages[0])
                .into(target);
    }

}
