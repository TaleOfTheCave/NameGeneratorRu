package com.taleofthecave;

public class Result {
    private String noun1;
    private String noun2;
    public int number;

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1.substring(0, 1).toUpperCase() + noun1.substring(1);
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2.substring(0, 1).toUpperCase() + noun2.substring(1);
    }

    @Override
    public int hashCode() {
        return (this.noun1 + this.noun2 + String.valueOf(number)).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        obj = (Result) obj;
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return this.getNoun1() + this.getNoun2() + String.valueOf(this.number);
    }
}
