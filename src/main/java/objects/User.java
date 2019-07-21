package main.java.objects;

import main.java.enums.Teams;

import java.time.LocalDate;

public class User {
    private String email;
    private LocalDate loginDate;
    private Teams team;

    public User(String email, LocalDate loginDate, Teams team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public Teams getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", loginDate=" + loginDate +
                ", team=" + team +
                '}';
    }
}
