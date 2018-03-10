package com.watson.SRPFix;

public class Email implements ContentInterface,EmailInterface {

    private String sender;//mails
    private String receiver;
    private String content;

    public String toStirng() {

        return String.format("Sender: %s\n Receiver: %s\n Message: %s", getSender(),getReceiver(),getContent());
    }

    public void setSender(String sender) {

        this.sender = sender;
    }

    public void setReciever(String receiver) {

        this.receiver = receiver;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public String getSender()
    {
        return sender;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public String getContent()
    {
        return content;
    }

}
