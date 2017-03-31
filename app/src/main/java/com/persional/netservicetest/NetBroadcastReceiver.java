package com.persional.netservicetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

//import static com.persional.netservicetest.BaseActivity.evevt;


/**
 * Created by duoqi.tao on 2017/3/23.
 */

public class NetBroadcastReceiver extends BroadcastReceiver {

    public NetEvevt evevt = BaseActivity.evevt;
//    private NetEvevt netEvevt;

//    public void setNetEvent(NetEvevt netEvevt){
//        this.netEvevt = netEvevt;
//
//    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        // 如果相等的话就说明网络状态发生了变化
        if (intent.getAction().equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            int netWorkState = NetUtil.getNetWorkState(context);
            // 接口回调传过去状态的类型
            evevt.onNetChange(netWorkState);
//            if(null != netEvevt){
//                netEvevt.onNetChange(netWorkState);
//            }
        }
    }

    // 自定义接口
    public interface NetEvevt {
        public void onNetChange(int netMobile);
    }
}
