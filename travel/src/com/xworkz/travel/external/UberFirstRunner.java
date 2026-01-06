package com.xworkz.travel.external;

import com.xworkz.travel.dto.UberDto;
import com.xworkz.travel.internal.UberRead;

public class UberFirstRunner {
    public static void main(String[] args) {
        //UberDto uberDto= new UberDto(5,"Venue",27,"Indiranagar","kavya@gmail.com","Nagaraj","Kavya",9090909090l,"Domlur","KR Puram");
        UberRead uberRead=new UberRead();
        //uberRead.readFirstUber(uberDto);
        uberRead.readFirstUber(1);
        //System.out.println(age);


    }
}
