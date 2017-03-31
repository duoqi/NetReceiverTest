package com.persional.netservicetest;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    private static final String TAG = "RxAndroidSamples";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isNetConnect()){
            System.out.println("有网络");
        }else{
            System.out.println("无网络");
        }

    }

//    @Override
//    public void onNetChange(int netMobile) {
//        if (netMobile == 1) {
//            System.out.println("inspectNet：连接wifi");
//        } else if (netMobile == 0) {
//            System.out.println("inspectNet:连接移动数据");
//        } else if (netMobile == -1) {
//            System.out.println("inspectNet:当前没有网络");
//
//        }
//
//    }

}
