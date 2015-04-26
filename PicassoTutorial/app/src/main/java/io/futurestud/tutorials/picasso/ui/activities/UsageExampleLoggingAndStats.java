package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.StatsSnapshot;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.futurestud.tutorials.picasso.R;

public class UsageExampleLoggingAndStats extends ActionBarActivity {

    @InjectView(R.id.standard_list_imageview1) ImageView imageViewFromMemory;
    @InjectView(R.id.standard_list_imageview2) ImageView imageViewFromDisk;
    @InjectView(R.id.standard_list_imageview3) ImageView imageViewFromNetwork;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standard_imageview);
        ButterKnife.inject(this);

        Picasso
                .with(context)
                .setIndicatorsEnabled(true);

        Picasso
                .with(context)
                .setLoggingEnabled(true);

        loadImageBitmapFromMemory();
        loadImageBitmapFromDisk();
        loadImageBitmapFromNetwork();

        printPicassoStatsSnapshot();
    }

    private void loadImageBitmapFromMemory() {
        Picasso.with(context).load(UsageExampleListViewAdapter.eatFoodyImages[0]).fetch(new Callback() {
            @Override
            public void onSuccess() {
                Picasso
                        .with(context)
                        .load(UsageExampleListViewAdapter.eatFoodyImages[0])
                        .into(imageViewFromMemory);
            }

            @Override
            public void onError() {

            }
        });
    }

    private void loadImageBitmapFromDisk() {
        Picasso.with(context).load(UsageExampleListViewAdapter.eatFoodyImages[1]).fetch(new Callback() {
            @Override
            public void onSuccess() {
                Picasso
                        .with(context)
                        .load(UsageExampleListViewAdapter.eatFoodyImages[1])
                        .memoryPolicy(MemoryPolicy.NO_CACHE)
                        .into(imageViewFromDisk);
            }

            @Override
            public void onError() {

            }
        });
    }

    private void loadImageBitmapFromNetwork() {
        Picasso
                .with(context)
                .load(UsageExampleListViewAdapter.eatFoodyImages[2])
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .networkPolicy(NetworkPolicy.NO_CACHE)
                .into(imageViewFromNetwork);
    }

    private void printPicassoStatsSnapshot() {
        StatsSnapshot picassoStats = Picasso.with(context).getSnapshot();

        Log.d("Picasso Stats", picassoStats.toString());
    }
}
