package com.tendy.designpattern.framwork;

import android.support.v4.app.Fragment;
import android.widget.Toast;


public class BaseFragment extends Fragment {
    private void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
