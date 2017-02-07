package com.tendy.designpattern.abstract_factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.tendy.designpattern.R;
import com.tendy.designpattern.abstract_factory.code.BMW530Factory;
import com.tendy.designpattern.abstract_factory.code.BMW750Factory;
import com.tendy.designpattern.abstract_factory.code.Engine;
import com.tendy.designpattern.abstract_factory.code.Tyre;
import com.tendy.designpattern.framwork.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class ABSFacCustomerActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_750)
    TextView tv750;
    @BindView(R.id.tv_530)
    TextView tv530;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_factory_customer);
        ButterKnife.bind(this);
        tvTitle.setText("抽象工厂示例");
    }

    @OnClick({R.id.iv_back, R.id.bt_750, R.id.bt_530})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_750:
                BMW750Factory bmw750Factory = new BMW750Factory();
                Engine engine750 = bmw750Factory.createEngine();
                Tyre tyre750 = bmw750Factory.createTyre();
                String str750 = engine750.showEngine() + ":" + tyre750.showTyre();
                tv750.setText(str750);
                break;
            case R.id.bt_530:
                BMW530Factory bmw530Factory = new BMW530Factory();
                Engine engine530 = bmw530Factory.createEngine();
                Tyre tyre530 = bmw530Factory.createTyre();
                String str530 = engine530.showEngine() + ":" + tyre530.showTyre();
                tv530.setText(str530);
                break;
        }
    }
}
