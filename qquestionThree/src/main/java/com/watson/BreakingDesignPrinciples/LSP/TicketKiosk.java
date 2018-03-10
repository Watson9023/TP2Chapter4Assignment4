package com.watson.BreakingDesignPrinciples.LSP;

public class TicketKiosk {

    public double calculatePrice(Ticket t)
    {
        if(t.type == 'A')
            return t.getPrice() * t.getHours() * 0.75;
        else if(t.type == 'R')
            return t.getPrice() * t.getHours() * 0.5;
        else if (t.type == 'V')
            return t.getHours() * t.getPrice();
        else
            return t.getPrice();
    }
}
