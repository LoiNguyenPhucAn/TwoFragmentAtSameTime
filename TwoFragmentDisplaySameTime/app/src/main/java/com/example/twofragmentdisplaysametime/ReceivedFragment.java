package com.example.twofragmentdisplaysametime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ReceivedFragment extends Fragment {

    private static ReceivedFragment instance;

    private TextView textReceived;

    public static ReceivedFragment getInstance() {
        if (instance == null) {
            instance = new ReceivedFragment();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2, container, false);
        textReceived = view.findViewById(R.id.text_receive);
        return view;
    }

    public void getText(String text) {
        textReceived.setText(text);
    }
}
