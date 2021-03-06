package com.mogujie.tt.config;

import android.os.Environment;

/**
 * @author : yingmu on 15-3-16.
 * @email : yingmu@mogujie.com.
 */
public class UrlConstant {

    // 头像路径前缀
    public final static String AVATAR_URL_PREFIX = "";

    // access 地址
    public final static String ACCESS_MSG_ADDRESS = "http://101.200.189.127:8080/msg_server";

    // 头像目录
    public final static String TOUXIANG_ADD = "file://" + Environment.getExternalStorageDirectory() + "/YUNXS/touxiang/";
    public final static String TOUXIANG_ADD2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/YUNXS/touxiang";
}
