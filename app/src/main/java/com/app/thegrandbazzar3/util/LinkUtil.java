package com.app.thegrandbazzar3.util;

import android.net.Uri;
import com.app.thegrandbazzar3.Home;
import com.app.thegrandbazzar3.R;

public class LinkUtil {

    public static String checkUniversalLink(Home activity){
        Uri data = activity.getIntent().getData();
        if(data != null) {
            String strData = data.toString();
            if (strData.startsWith(activity.getString(R.string.universalLink))) {
                LogUtil.loge("app opened by url clicked somewhere outside the app");
                LogUtil.loge("link: " + strData);
                return strData;
            }
        }
        return null;
    }
}
