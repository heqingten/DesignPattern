package com.tendy.designpattern.simple_factory;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tendy.designpattern.R;
import com.tendy.designpattern.framwork.BaseActivity;
import com.tendy.designpattern.simple_factory.code.CustomerActivity;
import com.tendy.designpattern.util.SkipUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SimpleFactoryActivty extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        ButterKnife.bind(this);
        tvTitle.setText("Demo源码");
    }

    @OnClick({R.id.iv_back, R.id.bt_demo})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_demo:
                SkipUtil.startActivity(this, CustomerActivity.class);
                break;
        }
    }
}
