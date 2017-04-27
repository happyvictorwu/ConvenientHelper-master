package com.tjnu.xuan.convenienthelper.ui;


/*
 *  项目名：  com.tjnu.xuan.convenienthelper.ui
 *  包名：    ConvenientHelper
 *  文件名:   BaseActivity
 *  创建者:   happy_yuxuan
 *  创建时间:  17/4/27 下午5:01
 *  描述：    Activity基类
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * 主要做的事情：
 * 1.统一的属性
 * 2.统一的接口
 * 3.统一的方法
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //显示返回键(左上角)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //菜单栏操作
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
