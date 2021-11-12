package org.campus02;

import java.util.Objects;

public class Incidence {
    private String state;
    private String date;
    private int number;

    // Code-Generate-Constructor
    public Incidence(String state, String date, int number) {
        this.state = state;
        this.date = date;
        this.number = number;
    }

    // Code-Generate-getter
    public String getState() {
        return state;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    // Code Generate equals/hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incidence incidence = (Incidence) o;
        return Objects.equals(state, incidence.state) && Objects.equals(date, incidence.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, date);
    }

    // Code Generate toString
    @Override
    public String toString() {
        return "Incidence{" +
                "state='" + state + '\'' +
                ", date='" + date + '\'' +
                ", number=" + number +
                '}';
    }
}
