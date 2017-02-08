package com.tendy.designpattern.singleton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tendy.designpattern.R;
import com.tendy.designpattern.framwork.BaseActivity;
import com.tendy.designpattern.util.SkipUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SingletonIntroActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_intro);
        ButterKnife.bind(this);
        tvTitle.setText("Singleton");

    }

    @OnClick({R.id.iv_back, R.id.bt_a})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_a:
                SkipUtil.startActivity(this, SingletonAActivity.class);
                break;
        }
    }
}
