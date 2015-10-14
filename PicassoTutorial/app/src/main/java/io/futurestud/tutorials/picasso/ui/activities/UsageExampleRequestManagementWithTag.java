package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.futurestud.tutorials.picasso.R;

public class UsageExampleRequestManagementWithTag extends ActionBarActivity {

    @Bind(R.id.standard_list_imageview1) ImageView imageViewResize;
    @Bind(R.id.standard_list_imageview2) ImageView imageViewResizeCenterCrop;
    @Bind(R.id.standard_list_imageview3) ImageView imageViewResizeCenterInside;
    @Bind(R.id.standard_list_imageview4) ImageView imageViewResizeScaleDown;
    @Bind(R.id.standard_list_imageview5) ImageView imageViewFit;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standard_imageview);
        ButterKnife.bind( this );

        // todo implement this
    }

    public void buyButtonClicked(View v) {
        // display ProgressDialog
        // ...

        // stop image requests
        Picasso
                .with(context)
                .cancelTag("ShoppingCart");

        // make 'buy'-request to server
        // ...
    }
}