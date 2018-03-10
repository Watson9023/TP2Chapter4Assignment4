package com.watson.PLKViolation;

public class plkVL {

    public void process(Arrange arr)
    {
        Message msg = arr.getMessage();
        msg.arrange(); //Violation - should have asked parameter to arrange message
        ((Message) arr.getMessage).arrange(); //Violation - should have used a temporary variable

    }
}
