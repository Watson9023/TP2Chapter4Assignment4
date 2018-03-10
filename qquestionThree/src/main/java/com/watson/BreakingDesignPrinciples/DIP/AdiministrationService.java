package com.watson.BreakingDesignPrinciples.DIP;

public class AdiministrationService {

    public double calculateSalary(Person p, String type)
    {
        if(type=="Management")
            return new Management(p).calculateSalary();
        else
            return new Employee(p).calculateSalary();
    }
}
