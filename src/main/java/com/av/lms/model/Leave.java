package com.av.lms.model;

import java.time.LocalDate;

public class Leave {

    private int userId;
    private int leaveId;
    private LocalDate startDate;
    private LocalDate endDate;
    private int leaveTypeId;
    private int balanceDays;
    private float balanceHours;
    private int reasonId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(int leaveId) {
        this.leaveId = leaveId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(int leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public int getBalanceDays() {
        return balanceDays;
    }

    public void setBalanceDays(int balanceDays) {
        this.balanceDays = balanceDays;
    }

    public float getBalanceHours() {
        return balanceHours;
    }

    public void setBalanceHours(float balanceHours) {
        this.balanceHours = balanceHours;
    }

    public int getReasonId() {
        return reasonId;
    }

    public void setReasonId(int reasonId) {
        this.reasonId = reasonId;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "userId=" + userId +
                ", leaveId=" + leaveId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", leaveTypeId=" + leaveTypeId +
                ", balanceDays=" + balanceDays +
                ", balanceHours=" + balanceHours +
                ", reasonId=" + reasonId +
                '}';
    }
}
