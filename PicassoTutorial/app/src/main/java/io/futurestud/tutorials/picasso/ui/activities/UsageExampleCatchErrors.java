package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.futurestud.tutorials.picasso.R;

public class UsageExampleCatchErrors extends AppCompatActivity {

    @BindView(R.id.standard_list_imageview1) ImageView imageView1;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standard_imageview);
        ButterKnife.bind(this);

        loadImageCatchErrors();
    }

    private void loadImageCatchErrors() {
        // create Picasso.Builder object
        Picasso.Builder picassoBuilder = new Picasso.Builder(context);

        // Picasso.Builder creates the Picasso object to do the actual requests
        Picasso picasso = picassoBuilder.listener(new Picasso.Listener() {
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                // log errors
            }
        }).build();

        // instead of Picasso.with(Context context) you directly use this picasso object
        picasso
                .load(UsageExampleListView.eatFoodyImages[0])
                .into(imageView1);
    }
}
