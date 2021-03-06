package com.seoulapp.ssg.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by win7-64 on 2016-09-10.
 */
public class Model {
    private int code;

    private String msg;

    @SerializedName("ssg_count")
    private int ssgCount;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getSsgCount() {
        return ssgCount;
    }

    public void setSsgCount(int ssgCount) {
        this.ssgCount = ssgCount;
    }
}

