package com.tendy.designpattern.factory_method;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.tendy.designpattern.R;
import com.tendy.designpattern.factory_method.code.BMW;
import com.tendy.designpattern.factory_method.code.FactoryBMW530;
import com.tendy.designpattern.factory_method.code.FactoryBMW750;
import com.tendy.designpattern.framwork.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class FMCustomerActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_750)
    TextView tv750;
    @BindView(R.id.tv_530)
    TextView tv530;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fm_customer);
        ButterKnife.bind(this);
        tvTitle.setText("工厂方法示例");
    }

    @OnClick({R.id.iv_back, R.id.bt_750, R.id.bt_530})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_750:
                FactoryBMW750 factoryBMW750 = new FactoryBMW750();
                BMW bmw750 = factoryBMW750.product();
                tv750.setText(bmw750.product());
                break;
            case R.id.bt_530:
                FactoryBMW530 factoryBMW530 = new FactoryBMW530();
                BMW bmw530 = factoryBMW530.product();
                tv530.setText(bmw530.product());
                break;
        }
    }
}
