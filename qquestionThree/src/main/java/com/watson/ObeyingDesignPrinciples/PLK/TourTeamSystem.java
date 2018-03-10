package com.watson.ObeyingDesignPrinciples.PLK;

import com.watson.BreakingDesignPrinciples.PLK.TourTeam;
import com.watson.BreakingDesignPrinciples.PLK.Tours;
import java.util.List;

public class TourTeamSystem {

    List<TourTeam> team;
    TourTeam tt = new TourTeam();

    public void addTours(Tours t)
    {
        tt.addTours(t);
    }

    public void removeTours(Tours t)
    {
        tt.removeTours(t);
    }

    public void replaceTeam(String name)
    {
        tt.setTourTeam(name);
    }

    public void changeDestination(String newDestination)
    {
        tt.setDestination(newDestination);
    }
}
