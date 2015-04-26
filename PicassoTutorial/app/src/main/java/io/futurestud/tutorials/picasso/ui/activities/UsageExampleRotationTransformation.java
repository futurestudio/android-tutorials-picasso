package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.futurestud.tutorials.picasso.R;

public class UsageExampleRotationTransformation extends ActionBarActivity {


    @InjectView(R.id.standard_list_imageview1) ImageView imageViewSimpleRotate;
    @InjectView(R.id.standard_list_imageview2) ImageView imageViewComplexRotate;
    @InjectView(R.id.standard_list_imageview3) ImageView imageView3;
    @InjectView(R.id.standard_list_imageview4) ImageView imageView4;
    @InjectView(R.id.standard_list_imageview5) ImageView imageView5;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standard_imageview);
        ButterKnife.inject(this);

        loadImageWithSimpleRotate();
        loadImageWithComplexRotate();
    }

    private void loadImageWithSimpleRotate() {
        Picasso
                .with(context)
                .load(UsageExampleListViewAdapter.eatFoodyImages[0])
                .rotate(90f)
                .into(imageViewSimpleRotate);
    }

    private void loadImageWithComplexRotate() {
        Picasso
                .with(context)
                .load(R.drawable.floorplan)
                .rotate(45f, 200f, 100f)
                .into(imageViewComplexRotate);
    }

}
