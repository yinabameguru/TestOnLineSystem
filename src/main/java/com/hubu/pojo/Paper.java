package com.hubu.pojo;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private int code;

    private String msg;

    private Map<String,Object> extend = new HashMap<String,Object>();

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

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public Paper success(){
        Paper result = new Paper();
        result.code = 100;
        result.setMsg("处理成功！");
        return  result;
    }

    public Paper fail(){
        Paper result = new Paper();
        result.code = 200;
        result.setMsg("处理失败！");
        return  result;
    }

    public Paper add(String key, Object value){
        this.getExtend().put(key,value);
        return this;
    }
}
