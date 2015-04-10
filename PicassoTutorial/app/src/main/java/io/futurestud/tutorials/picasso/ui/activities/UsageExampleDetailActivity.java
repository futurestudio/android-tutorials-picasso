package io.futurestud.tutorials.picasso.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import io.futurestud.tutorials.picasso.R;
import io.futurestud.tutorials.picasso.ui.fragments.UsageExampleDetailFragment;
import io.futurestud.tutorials.picasso.ui.fragments.UsageExampleSimpleLoading;


/**
 * An activity representing a single UsageExample detail screen. This
 * activity is only used on handset devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link UsageExampleListActivity}.
 * <p/>
 * This activity is mostly just a 'shell' activity containing nothing
 * more than a {@link UsageExampleDetailFragment}.
 */
public class UsageExampleDetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usageexample_detail);

        // Show the Up button in the action bar.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            UsageExampleSimpleLoading fragment = new UsageExampleSimpleLoading();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.usageexample_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            NavUtils.navigateUpTo(this, new Intent(this, UsageExampleListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
