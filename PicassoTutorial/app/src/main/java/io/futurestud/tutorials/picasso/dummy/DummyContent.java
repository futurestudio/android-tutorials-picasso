package io.futurestud.tutorials.picasso.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "Simple Image Loading"));
        addItem(new DummyItem("2", "ListView Adapters"));
        addItem(new DummyItem("3", "Placeholder, Error & Fading"));
        addItem(new DummyItem("4", "Cropping, fit()"));
        addItem(new DummyItem("5", "Picasso Priority"));
        addItem(new DummyItem("6", "External Targets (Remoteview)"));
        addItem(new DummyItem("7", "Image Manipulation"));
        addItem(new DummyItem("8", "Transformations"));
        addItem(new DummyItem("9", "Picasso Builder"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
