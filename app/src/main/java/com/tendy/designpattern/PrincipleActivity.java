package com.tendy.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrincipleActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principle);
        ButterKnife.bind(this);
        tvTitle.setText("设计模式概述");
    }

    @OnClick(R.id.iv_back)
    public void onClick() {
        finish();
    }
}
