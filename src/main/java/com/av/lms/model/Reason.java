package com.av.lms.model;

public class Reason {

    private int reasonId;
    private String reason;

    public int getReasonId() {
        return reasonId;
    }

    public void setReasonId(int reasonId) {
        this.reasonId = reasonId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Reason{" +
                "reasonId=" + reasonId +
                ", reason='" + reason + '\'' +
                '}';
    }
}
