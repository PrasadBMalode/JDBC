package com.xworkz.travel.dto;

import java.util.Objects;

public class UberDto {
    private int passengerId;
    private String passengerName;
    private String passengerEmail;
    private String carName;
    private long passengerNumber;
    private String passengerPickUpPoint;
    private String passengerDropPoint;
    private int passengerAge;
    private String passengerSurname;
    private String passengerFatherName;

    public UberDto(int passengerId, String carName, int passengerAge, String passengerDropPoint, String passengerEmail, String passengerFatherName,  String passengerName, long passengerNumber, String passengerPickUpPoint, String passengerSurname) {
        this.carName = carName;
        this.passengerAge = passengerAge;
        this.passengerDropPoint = passengerDropPoint;
        this.passengerEmail = passengerEmail;
        this.passengerFatherName = passengerFatherName;
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerNumber = passengerNumber;
        this.passengerPickUpPoint = passengerPickUpPoint;
        this.passengerSurname = passengerSurname;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerDropPoint() {
        return passengerDropPoint;
    }

    public void setPassengerDropPoint(String passengerDropPoint) {
        this.passengerDropPoint = passengerDropPoint;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getPassengerFatherName() {
        return passengerFatherName;
    }

    public void setPassengerFatherName(String passengerFatherName) {
        this.passengerFatherName = passengerFatherName;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public long getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(long passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public String getPassengerPickUpPoint() {
        return passengerPickUpPoint;
    }

    public void setPassengerPickUpPoint(String passengerPickUpPoint) {
        this.passengerPickUpPoint = passengerPickUpPoint;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UberDto)) return false;
        UberDto uberDto = (UberDto) o;
        return passengerId == uberDto.passengerId && passengerNumber == uberDto.passengerNumber && passengerAge == uberDto.passengerAge && Objects.equals(passengerName, uberDto.passengerName) && Objects.equals(passengerEmail, uberDto.passengerEmail) && Objects.equals(carName, uberDto.carName) && Objects.equals(passengerPickUpPoint, uberDto.passengerPickUpPoint) && Objects.equals(passengerDropPoint, uberDto.passengerDropPoint) && Objects.equals(passengerSurname, uberDto.passengerSurname) && Objects.equals(passengerFatherName, uberDto.passengerFatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerId, passengerName, passengerEmail, carName, passengerNumber, passengerPickUpPoint, passengerDropPoint, passengerAge, passengerSurname, passengerFatherName);
    }

    @Override
    public String toString() {
        return "UberDto{" +
                "carName='" + carName + '\'' +
                ", passengerId=" + passengerId +
                ", passengerName='" + passengerName + '\'' +
                ", passengerEmail='" + passengerEmail + '\'' +
                ", passengerNumber=" + passengerNumber +
                ", passengerPickUpPoint='" + passengerPickUpPoint + '\'' +
                ", passengerDropPoint='" + passengerDropPoint + '\'' +
                ", passengerAge=" + passengerAge +
                ", passengerSurname='" + passengerSurname + '\'' +
                ", passengerFatherName='" + passengerFatherName + '\'' +
                '}';
    }
}
