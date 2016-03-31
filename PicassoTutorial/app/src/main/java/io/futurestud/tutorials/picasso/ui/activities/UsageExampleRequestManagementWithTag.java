package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import io.futurestud.tutorials.picasso.R;

public class UsageExampleRequestManagementWithTag extends AppCompatActivity {

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standard_imageview);
        ButterKnife.bind( this );

        // todo implement it depending on your use case
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