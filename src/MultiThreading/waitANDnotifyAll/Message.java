package MultiThreading.waitANDnotifyAll;

public class Message {

    private String msg;

    Message(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return this.msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
