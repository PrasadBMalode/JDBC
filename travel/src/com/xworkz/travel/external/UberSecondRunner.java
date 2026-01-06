package com.xworkz.travel.external;

import com.xworkz.travel.dto.UberDto;
import com.xworkz.travel.internal.UberRead;

public class UberSecondRunner {
    public static void main(String[] args) {
        UberRead uberRead=new UberRead();
        uberRead.getNameAndPhoneByEmail("sneha@gmail.com");
    }
}
