package io.futurestud.tutorials.picasso.ui.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.GridView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.futurestud.tutorials.picasso.R;
import io.futurestud.tutorials.picasso.ui.adapter.SimpleImageListAdapter;

public class UsageExampleGridViewAdapter extends ActionBarActivity {

    @InjectView(R.id.usage_example_gridview) GridView gridView;

    public UsageExampleGridViewAdapter() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_usage_example_gridview);
        GridView gridView = (GridView) findViewById( R.id.usage_example_gridview );
        ButterKnife.inject(this);

        gridView.setAdapter( new SimpleImageListAdapter( UsageExampleGridViewAdapter.this, UsageExampleListViewAdapter.eatFoodyImages ) );
    }
}