package com.example.user.volleylist3;

/**
 * Created by User on 13/04/2018.
 */

public class Scoreboard_Item {

    String Username, Team1, Team2, Sport, Status;


    public Scoreboard_Item(String username, String team1, String team2, String sport, String status) {
        this.setUsername(username);
        this.setTeam1(team1);
        this.setTeam2(team2);
        this.setSport(sport);
        this.setStatus(status);
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }

    public String getSport() {
        return Sport;
    }

    public void setSport(String sport) {
        Sport = sport;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
