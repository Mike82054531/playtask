package com.jnu.student.fragment1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class AnotherRightFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.another_right_fragment, container, false);

        // Find the CheckBox and TextView in the inflated layout
        CheckBox checkBox = view.findViewById(R.id.checkBox1);
        TextView textView = view.findViewById(R.id.textView1);

        // Set a click listener for the TextView
        textView.setOnClickListener(v -> {
            // Get the current TextView text and increment it by 1
            int currentValue = Integer.parseInt(textView.getText().toString());
            int newValue = currentValue + 1;

            // Update the TextView text
            textView.setText(String.valueOf(newValue));
        });

        return view;
    }
}
