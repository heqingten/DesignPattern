package com.tendy.designpattern.singleton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tendy.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SingletonEActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_e);
        ButterKnife.bind(this);
        tvTitle.setText("SingletonE");

    }

    @OnClick(R.id.iv_back)
    public void onClick() {
        finish();
    }
}
