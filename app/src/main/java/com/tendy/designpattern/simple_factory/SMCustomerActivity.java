package com.tendy.designpattern.simple_factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.tendy.designpattern.R;
import com.tendy.designpattern.framwork.BaseActivity;
import com.tendy.designpattern.simple_factory.code.BMW;
import com.tendy.designpattern.simple_factory.code.BMWFactory;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class SMCustomerActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.et_code)
    EditText etCode;
    @BindView(R.id.tv_carinfo)
    TextView tvCarinfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sm_customer);
        ButterKnife.bind(this);
        tvTitle.setText("简单工厂示例");
    }

    @OnClick({R.id.iv_back, R.id.bt_getcar})
    public void onClick(View view) {
        hideKeyboard(view);
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_getcar:
                String carCode = etCode.getText().toString().trim();
                if (carCode.equals("")) {
                    showToast("请输入宝马汽车编号");
                    return;
                }
                BMWFactory factory = new BMWFactory();
                try {
                    BMW bmw = factory.product(Integer.parseInt(carCode));
                    String carName;
                    if (bmw == null)
                        carName = "目前只能生产530和750型号的宝马车，请输入530或750";
                    else carName = "恭喜您，成功提取    " + bmw.product();
                    tvCarinfo.setText(carName);
                } catch (Exception e) {
                    showToast("请输入宝马汽车编号");
                }
                break;
        }
    }
}
