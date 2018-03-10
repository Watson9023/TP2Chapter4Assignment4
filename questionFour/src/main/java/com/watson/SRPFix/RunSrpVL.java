package com.watson.SRPFix;

public class RunSrpVL {

    public static void main(String[] args)
    {
        EmailInterface email = new Email();
        ContentInterface emailContent = new Email();
        email.setSender("wmatunhire@gmail.com");
        email.setReciever("213215004@mycput.ac.za");
        email.setContent("This is a test email");
        System.out.println(emailContent.toString());
    }
}
