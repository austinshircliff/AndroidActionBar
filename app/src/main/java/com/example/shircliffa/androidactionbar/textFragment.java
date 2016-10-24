package com.example.shircliffa.androidactionbar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class textFragment extends Fragment {
    public TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);
        text = (TextView) view.findViewById(R.id.txt);
        String menu = getArguments().getString("Menu");
        text.setText(menu);
        return view;
    }
}
