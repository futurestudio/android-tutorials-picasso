package io.futurestud.tutorials.picasso.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.futurestud.tutorials.picasso.ui.activities.OkHttp3Example;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleAdvancedListView;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleGridViewAdapter;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleImageResizing;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleListView;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleLoggingAndStats;
import io.futurestud.tutorials.picasso.ui.activities.UsageExamplePicassoBuilderBasics;
import io.futurestud.tutorials.picasso.ui.activities.UsageExamplePicassoBuilderRequestHandler;
import io.futurestud.tutorials.picasso.ui.activities.UsageExamplePlaceholdersAndErrors;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleRequestPriority;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleRotationTransformation;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleSimpleLoading;
import io.futurestud.tutorials.picasso.ui.activities.UsageExampleTargetsAndRemoteViews;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class MenuContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<>();

    static {
        addItem( new DummyItem( "0", "Simple Image Loading", UsageExampleSimpleLoading.class ) );
        addItem(new DummyItem("1", "Adapter Use - ListView", UsageExampleListView.class));
        addItem( new DummyItem( "2", "Adapter Use - GridView", UsageExampleGridViewAdapter.class ) );
        addItem( new DummyItem( "3", "Placeholder, Error & Fading", UsageExamplePlaceholdersAndErrors.class ) );
        addItem( new DummyItem( "4", "Image Resizing, Cropping and fit()", UsageExampleImageResizing.class ) );
        addItem( new DummyItem( "5", "Picasso Priority", UsageExampleRequestPriority.class ) );
        addItem( new DummyItem( "6", "Callbacks, RemoteViews & Notifications", UsageExampleTargetsAndRemoteViews.class ) );
        addItem( new DummyItem( "7", "Rotation and Transformation", UsageExampleRotationTransformation.class ) );
        addItem( new DummyItem( "8", "Influencing Image Caching", UsageExampleLoggingAndStats.class ) );
        addItem( new DummyItem( "9", "Cache Indicators, Logging & Stats", UsageExampleLoggingAndStats.class ) );
        addItem( new DummyItem( "10", "Picasso.Builder Basics", UsageExamplePicassoBuilderBasics.class ) );
        addItem( new DummyItem( "11", "Custom Request Handlers", UsageExamplePicassoBuilderRequestHandler.class ) );
        addItem(new DummyItem("12", "OkHttp3", OkHttp3Example.class));

        addItem(new DummyItem("13", "Bonus: Advanced ListView", UsageExampleAdvancedListView.class));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public Class goalClass;

        public DummyItem(String id, String content, Class goalClass) {
            this.id = id;
            this.content = content;
            this.goalClass = goalClass;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
