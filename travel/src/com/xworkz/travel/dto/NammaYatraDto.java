package com.xworkz.travel.dto;

import java.util.Objects;

public class NammaYatraDto {
    private int riderId;
    private String riderName;
    private String riderEmail;
    private String autoName;
    private long riderMobile;
    private String pickUpLocation;
    private String dropLocation;
    private int riderAge;
    private String riderSurname;
    private String riderGuardianName;

    public NammaYatraDto(int riderId,String autoName, String dropLocation, String pickUpLocation, int riderAge, String riderEmail, String riderGuardianName,  long riderMobile, String riderName, String riderSurname) {
        this.autoName = autoName;
        this.dropLocation = dropLocation;
        this.pickUpLocation = pickUpLocation;
        this.riderAge = riderAge;
        this.riderEmail = riderEmail;
        this.riderGuardianName = riderGuardianName;
        this.riderId = riderId;
        this.riderMobile = riderMobile;
        this.riderName = riderName;
        this.riderSurname = riderSurname;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public int getRiderAge() {
        return riderAge;
    }

    public void setRiderAge(int riderAge) {
        this.riderAge = riderAge;
    }

    public String getRiderEmail() {
        return riderEmail;
    }

    public void setRiderEmail(String riderEmail) {
        this.riderEmail = riderEmail;
    }

    public String getRiderGuardianName() {
        return riderGuardianName;
    }

    public void setRiderGuardianName(String riderGuardianName) {
        this.riderGuardianName = riderGuardianName;
    }

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public long getRiderMobile() {
        return riderMobile;
    }

    public void setRiderMobile(long riderMobile) {
        this.riderMobile = riderMobile;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public String getRiderSurname() {
        return riderSurname;
    }

    public void setRiderSurname(String riderSurname) {
        this.riderSurname = riderSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NammaYatraDto)) return false;
        NammaYatraDto that = (NammaYatraDto) o;
        return riderId == that.riderId && riderMobile == that.riderMobile && riderAge == that.riderAge && Objects.equals(riderName, that.riderName) && Objects.equals(riderEmail, that.riderEmail) && Objects.equals(autoName, that.autoName) && Objects.equals(pickUpLocation, that.pickUpLocation) && Objects.equals(dropLocation, that.dropLocation) && Objects.equals(riderSurname, that.riderSurname) && Objects.equals(riderGuardianName, that.riderGuardianName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riderId, riderName, riderEmail, autoName, riderMobile, pickUpLocation, dropLocation, riderAge, riderSurname, riderGuardianName);
    }

    @Override
    public String toString() {
        return "NammaYatraDto{" +
                "autoName='" + autoName + '\'' +
                ", riderId=" + riderId +
                ", riderName='" + riderName + '\'' +
                ", riderEmail='" + riderEmail + '\'' +
                ", riderMobile=" + riderMobile +
                ", pickUpLocation='" + pickUpLocation + '\'' +
                ", dropLocation='" + dropLocation + '\'' +
                ", riderAge=" + riderAge +
                ", riderSurname='" + riderSurname + '\'' +
                ", riderGuardianName='" + riderGuardianName + '\'' +
                '}';
    }
}
