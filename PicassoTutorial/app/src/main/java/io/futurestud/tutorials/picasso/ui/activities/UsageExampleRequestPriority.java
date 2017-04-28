package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.futurestud.tutorials.picasso.R;

public class UsageExampleRequestPriority extends AppCompatActivity {

    @BindView(R.id.activity_request_priority_hero) ImageView imageViewHero;
    @BindView(R.id.activity_request_priority_low_left) ImageView imageViewLowPrioLeft;
    @BindView(R.id.activity_request_priority_low_right) ImageView imageViewLowPrioRight;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_request_priority);
        ButterKnife.bind( this );

        loadImageWithHighPriority();
        loadImagesWithLowPriority();
    }

    private void loadImageWithHighPriority() {
        Picasso
                .with(context)
                .load(UsageExampleListView.eatFoodyImages[0])
                .fit()
                .priority(Picasso.Priority.HIGH)
                .into(imageViewHero);
    }

    private void loadImagesWithLowPriority() {
        Picasso
                .with(context)
                .load(UsageExampleListView.eatFoodyImages[1])
                .fit()
                .priority(Picasso.Priority.LOW)
                .into(imageViewLowPrioLeft);

        Picasso
                .with(context)
                .load(UsageExampleListView.eatFoodyImages[2])
                .fit()
                .priority(Picasso.Priority.LOW)
                .into(imageViewLowPrioRight);
    }
}