package io.futurestud.tutorials.picasso.ui.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.File;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.futurestud.tutorials.picasso.R;

public class UsageExampleSimpleLoading extends Fragment {

    public static final String ANDROID_RESOURCE = "android.resource://";
    public static final String FOREWARD_SLASH = "/";

    @InjectView(R.id.simple_loading_internet) ImageView imageViewInternet;
    @InjectView(R.id.simple_loading_resource) ImageView imageViewResource;
    @InjectView(R.id.simple_loading_file) ImageView imageViewFile;
    @InjectView(R.id.simple_loading_uri) ImageView imageViewUri;

    public UsageExampleSimpleLoading() {
    }

    /**
     * helper method which creates an Uri for a resourceId
     */
    public static Uri resourceIdToUri(Context context, int resourceId) {
        return Uri.parse(ANDROID_RESOURCE + context.getPackageName() + FOREWARD_SLASH + resourceId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_usageexample_detail, container, false);
        ButterKnife.inject(this, rootView);

        getActivity().setTitle("Simple Loading Example");

        loadImageByInternetUrl();
        loadImageByResourceId();
        loadImageByFile();
        loadImageByUri();

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    private void loadImageByInternetUrl() {
        // the url could be any image URL, which is accessible with a normal HTTP GET request
        String internetUrl = "http://i.imgur.com/DvpvklR.png";
        Picasso
                .with(getActivity())
                .load(internetUrl)
                .into(imageViewInternet);
    }

    private void loadImageByResourceId() {
        int resourceId = R.mipmap.ic_launcher;
        Picasso
                .with(getActivity())
                .load(resourceId)
                .into(imageViewResource);
    }

    private void loadImageByFile() {
        // this file probably does not exist on your device. However, you can use any file path, which points to an image file
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Running.jpg");
        Picasso
                .with(getActivity())
                .load(file)
                .into(imageViewFile);
    }

    private void loadImageByUri() {
        // this could be any Uri. for demonstration purposes we're just creating an Uri pointing to a launcher icon
        Uri uri = resourceIdToUri(getActivity(), R.mipmap.future_studio_launcher);
        Picasso
                .with(getActivity())
                .load(uri)
                .into(imageViewUri);
    }
}
