package io.futurestud.tutorials.picasso.ui.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import io.futurestud.tutorials.picasso.dummy.DummyContent;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_activated_1,
                android.R.id.text1,
                DummyContent.ITEMS));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                showExampleActivity(UsageExampleSimpleLoading.class);

                break;

            case 1:
                showExampleActivity(UsageExampleAdapter.class);
                break;

            case 2:
                showExampleActivity(UsageExamplePlaceholdersAndErrors.class);
                break;

            default:

        }
    }

    private void showExampleActivity(Class targetClass) {
        startActivity(new Intent(this, targetClass));

    }
}