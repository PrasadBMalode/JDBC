package com.xworkz.travel.dto;

import java.util.Objects;

public class RapidoDto {
    private String riderName;
    private int riderId;
    private String riderEmail;
    private long riderNumber;
    private String bikeName;
    private int totalTrip;
    private int riderAge;
    private String riderLocation;
    private String fatherName;
    private float riderRank;

    public RapidoDto(int riderId,String bikeName, String fatherName, int riderAge,
                     String riderEmail,  String riderLocation, String riderName,
                     long riderNumber, float riderRank, int totalTrip) {

        this.bikeName = bikeName;
        this.fatherName = fatherName;
        this.riderAge = riderAge;
        this.riderEmail = riderEmail;
        this.riderId = riderId;
        this.riderLocation = riderLocation;
        this.riderName = riderName;
        this.riderNumber = riderNumber;
        this.riderRank = riderRank;
        this.totalTrip = totalTrip;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
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

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public String getRiderLocation() {
        return riderLocation;
    }

    public void setRiderLocation(String riderLocation) {
        this.riderLocation = riderLocation;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public long getRiderNumber() {
        return riderNumber;
    }

    public void setRiderNumber(long riderNumber) {
        this.riderNumber = riderNumber;
    }

    public float getRiderRank() {
        return riderRank;
    }

    public void setRiderRank(float riderRank) {
        this.riderRank = riderRank;
    }

    public int getTotalTrip() {
        return totalTrip;
    }

    public void setTotalTrip(int totalTrip) {
        this.totalTrip = totalTrip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RapidoDto)) return false;
        RapidoDto rapidoDto = (RapidoDto) o;
        return riderId == rapidoDto.riderId && riderNumber == rapidoDto.riderNumber && totalTrip == rapidoDto.totalTrip && riderAge == rapidoDto.riderAge && Float.compare(riderRank, rapidoDto.riderRank) == 0 && Objects.equals(riderName, rapidoDto.riderName) && Objects.equals(riderEmail, rapidoDto.riderEmail) && Objects.equals(bikeName, rapidoDto.bikeName) && Objects.equals(riderLocation, rapidoDto.riderLocation) && Objects.equals(fatherName, rapidoDto.fatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riderName, riderId, riderEmail, riderNumber, bikeName, totalTrip, riderAge, riderLocation, fatherName, riderRank);
    }

    @Override
    public String toString() {
        return "RapidoDto{" +
                "bikeName='" + bikeName + '\'' +
                ", riderName='" + riderName + '\'' +
                ", riderId=" + riderId +
                ", riderEmail='" + riderEmail + '\'' +
                ", riderNumber=" + riderNumber +
                ", totalTrip=" + totalTrip +
                ", riderAge=" + riderAge +
                ", riderLocation='" + riderLocation + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", riderRank=" + riderRank +
                '}';
    }
}
