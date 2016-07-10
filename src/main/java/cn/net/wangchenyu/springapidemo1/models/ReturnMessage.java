package cn.net.wangchenyu.springapidemo1.models;

/**
 * Created by cheneyveron on 7/7/16.
 */
public class ReturnMessage {
    private int id;//返回代码标示
    private String message;//返回信息

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
