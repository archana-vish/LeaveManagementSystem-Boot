package com.av.lms.model;

import java.time.Year;
import java.util.Date;

public class MasterLeave {

    private int id;
    private Year startYear;
    private Year endYear;
    private int casualLeave;
    private int bankHolidays;
    private int carriedOver;
    private float hoursPerDay;
    private float totalHours;
    private int totalLeave;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Year getStartYear() {
        return startYear;
    }

    public void setStartYear(Year startYear) {
        this.startYear = startYear;
    }

    public Year getEndYear() {
        return endYear;
    }

    public void setEndYear(Year endYear) {
        this.endYear = endYear;
    }

    public int getCasualLeave() {
        return casualLeave;
    }

    public void setCasualLeave(int casualLeave) {
        this.casualLeave = casualLeave;
    }

    public int getBankHolidays() {
        return bankHolidays;
    }

    public void setBankHolidays(int bankHolidays) {
        this.bankHolidays = bankHolidays;
    }

    public int getCarriedOver() {
        return carriedOver;
    }

    public void setCarriedOver(int carriedOver) {
        this.carriedOver = carriedOver;
    }

    public float getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(float hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public float getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(float totalHours) {
        this.totalHours = totalHours;
    }

    public int getTotalLeave() {
        return totalLeave;
    }

    public void setTotalLeave(int totalLeave) {
        this.totalLeave = totalLeave;
    }

    @Override
    public String toString() {
        return "MasterLeave{" +
                "id=" + id +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                ", casualLeave=" + casualLeave +
                ", bankHolidays=" + bankHolidays +
                ", carriedOver=" + carriedOver +
                ", hoursPerDay=" + hoursPerDay +
                ", totalHours=" + totalHours +
                ", totalLeave=" + totalLeave +
                '}';
    }
}
