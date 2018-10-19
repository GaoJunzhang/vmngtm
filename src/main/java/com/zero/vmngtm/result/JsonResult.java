package com.zero.vmngtm.result;
/**
* class_name: JsonResult
* package: com.zgj.study.result
* describe: 定义api的返回对象格式
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2018/3/20
* creat_time: 9:43
**/
public class JsonResult {
    private String errcode;
    private String errmsg;
    private Object data;

    public JsonResult() {
        this.setErrcode(ResultCode.SUCCESS);
        this.setErrmsg("成功！");

    }

    public JsonResult(ResultCode errcode) {
        this.setErrcode(errcode);
        this.setErrmsg(errcode.msg());
    }

    public JsonResult(ResultCode errcode, String errmsg) {
        this.setErrcode(errcode);
        this.setErrmsg(errmsg);
    }

    public JsonResult(ResultCode errcode, String errmsg, Object data) {
        this.setErrcode(errcode);
        this.setErrmsg(errmsg);
        this.setData(data);
    }
    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(ResultCode errcode) {
        this.errcode = errcode.val();
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
