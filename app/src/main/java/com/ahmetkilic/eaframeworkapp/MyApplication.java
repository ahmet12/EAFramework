package com.ahmetkilic.eaframeworkapp;


import com.ahmetkilic.eaframework.EAApplication;

/**
 * Created by Ahmet Kılıç on 18.12.2018.
 * Copyright © 2018, Ahmet Kılıç. All rights reserved.
 * <p>
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */
public class MyApplication extends EAApplication {
    @Override
    public void onCreate() {
        super.onCreate();
     //   initRealm("app_realm");
        initChannels("app_chn", "App Notification Channel", "Channel for this apps notifications");
    }
}
