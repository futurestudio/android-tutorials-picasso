package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.futurestud.tutorials.picasso.R;
import io.futurestud.tutorials.picasso.okhttp.CustomOkHttp3Downloader;

public class OkHttp3Example extends ActionBarActivity {

    @Bind(R.id.standard_list_imageview1) ImageView imageView1;
    @Bind(R.id.standard_list_imageview2) ImageView imageView2;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standard_imageview);
        ButterKnife.bind(this);

        loadImageWithJakeWhartonsOkHttp3Downloader();
        loadImageWithCustomOkHttp3Downloader();
    }

    private void loadImageWithJakeWhartonsOkHttp3Downloader() {
        okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
        Picasso picasso = new Picasso.Builder(context)
                .downloader(new CustomOkHttp3Downloader(client))
                .build();

        // the url could be any image URL, which is accessible with a normal HTTP GET request
        String internetUrl = "http://i.imgur.com/DvpvklR.png";
        picasso
                .with(context)
                .load(internetUrl)
                .into(imageView1);
    }


    private void loadImageWithCustomOkHttp3Downloader() {
        okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
        Picasso picasso = new Picasso.Builder(context)
                .downloader(new CustomOkHttp3Downloader(client))
                .build();

        // the url could be any image URL, which is accessible with a normal HTTP GET request
        String internetUrl = "http://i.imgur.com/DvpvklR.png";
        picasso
                .with(context)
                .load(internetUrl)
                .into(imageView2);
    }

}
