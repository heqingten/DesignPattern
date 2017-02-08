package com.tendy.designpattern;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tendy.designpattern.abstract_factory.AbstractFactoryActivity;
import com.tendy.designpattern.factory_method.FactoryMethodActivity;
import com.tendy.designpattern.framwork.BaseActivity;
import com.tendy.designpattern.simple_factory.SimpleFactoryActivty;
import com.tendy.designpattern.singleton.SingletonIntroActivity;
import com.tendy.designpattern.util.SkipUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.iv_back)
    ImageView iv_back;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_right)
    TextView tv_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        iv_back.setVisibility(View.GONE);
        tvTitle.setText("设计模式大全");
        tv_right.setVisibility(View.VISIBLE);
    }

    @OnClick({R.id.tv_right, R.id.tv_dl, R.id.tv_jdgc, R.id.tv_gcff, R.id.tv_cxgc})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_right:
                SkipUtil.startActivity(this, PrincipleActivity.class);
                break;
            case R.id.tv_dl:
                SkipUtil.startActivity(this, SingletonIntroActivity.class);
                break;
            case R.id.tv_jdgc:
                SkipUtil.startActivity(this, SimpleFactoryActivty.class);
                break;
            case R.id.tv_gcff:
                SkipUtil.startActivity(this, FactoryMethodActivity.class);
                break;
            case R.id.tv_cxgc:
                SkipUtil.startActivity(this, AbstractFactoryActivity.class);
                break;
        }
    }
}
