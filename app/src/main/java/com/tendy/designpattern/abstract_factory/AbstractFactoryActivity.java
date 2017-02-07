package com.tendy.designpattern.abstract_factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.tendy.designpattern.R;
import com.tendy.designpattern.framwork.BaseActivity;
import com.tendy.designpattern.util.SkipUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class AbstractFactoryActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        ButterKnife.bind(this);
        tvTitle.setText("Abstract factory");
    }

    @OnClick({R.id.iv_back, R.id.bt_demo})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_demo:
                SkipUtil.startActivity(this, ABSFacCustomerActivity.class);
                break;
        }
    }
}
