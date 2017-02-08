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

public class SingletonCActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_c);
        ButterKnife.bind(this);
        tvTitle.setText("SingletonC");
    }

    @OnClick({R.id.iv_back, R.id.bt_d})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_d:
                SkipUtil.startActivity(this, SingletonDActivity.class);
                break;
        }
    }
}
