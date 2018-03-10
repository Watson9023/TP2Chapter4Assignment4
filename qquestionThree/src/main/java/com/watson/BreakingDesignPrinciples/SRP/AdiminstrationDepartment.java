package com.watson.BreakingDesignPrinciples.SRP;

public class AdiminstrationDepartment extends UncorrectPrinciple{

    String name = "Watson", surname = "Matunhire";

    public void saveEmployeeDetails(){
        addEmployee(name, surname);
    }

    public void updateEmployee(String name, String surname)
    {
        updateName(name);
        updateSurname(surname);
    }
}
