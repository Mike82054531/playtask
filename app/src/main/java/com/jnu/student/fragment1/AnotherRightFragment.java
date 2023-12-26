package com.jnu.student.fragment1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class AnotherRightFragment extends Fragment implements View.OnClickListener {

    private CheckBox checkBox;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.another_right_fragment, container, false);

        // Find the CheckBox and TextView in the inflated layout
        checkBox = view.findViewById(R.id.checkBox1);
        textView = view.findViewById(R.id.textView1);

        // Set a click listener for the TextView
        textView.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView1:
                if (!checkBox.isChecked()) {
                    // 如果方框没有被选中，扣除50
                    deductAmount(50);
                }
                break;
            default:
                break;
        }
    }

    private void deductAmount(int amount) {
        // 在这里添加扣除金额的逻辑，可以更新用户的账户余额或其他数据
        // 示例：假设有一个变量 currentBalance 表示当前余额
        int currentBalance = 100; // 你的初始余额
        if (currentBalance >= amount) {
            currentBalance -= amount;
            // 在这里更新用户的余额信息，可以调用相应的方法或接口
        } else {
            // 提示用户余额不足，或执行其他逻辑
            Toast.makeText(requireContext(), "余额不足，无法扣除金额", Toast.LENGTH_SHORT).show();
        }
    }
}
