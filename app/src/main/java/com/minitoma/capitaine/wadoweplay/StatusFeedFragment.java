package com.minitoma.capitaine.wadoweplay;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StatusFeedFragment extends Fragment {
    private String title;

    public static StatusFeedFragment newInstance(String title) {
        StatusFeedFragment fragment = new StatusFeedFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getArguments().getString("title");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.status_feed_layout, container, false);

        TextView tvLabel = (TextView) RootView.findViewById(R.id.title2);
        tvLabel.setText(title);

        return RootView;
    }
}
