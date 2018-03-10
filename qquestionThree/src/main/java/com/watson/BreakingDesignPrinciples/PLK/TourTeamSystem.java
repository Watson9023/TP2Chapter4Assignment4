package com.watson.BreakingDesignPrinciples.PLK;

import java.util.List;

public class TourTeamSystem {

    List<TourTeam> team;
    TourTeam tt = new TourTeam();

    public void addTours(Tours t)
    {
       tt.addTours(t);
    }

    public void replaceGuide(String name)
    {
        tt.setTourTeam(name);
    }
}
