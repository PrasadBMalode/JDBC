package com.xworkz.travel.external;

import com.xworkz.travel.dto.UberDto;
import com.xworkz.travel.internal.Uber;

public class UberRunner {
    public static void main(String[] args) {
        //UberDto uberDto=new UberDto(1,"Xuv3Xo",22,"Rajajinagar","prasad@gmail.com","Basavaraja","Prasad",6360211265l,"Mejestic","Malode");
        //UberDto uberDto=new UberDto(2,"Swift",28,"Yelahanka","rahul@gmail.com","Ramesh","Rahul",9876543210L,"Hebbal","Whitefield");
        //UberDto uberDto= new UberDto(3,"Baleno",25,"BTM","sneha@gmail.com","Suresh","Sneha",9123456780L,"Silk Board","Electronic City");
        //UberDto uberDto= new UberDto(4,"Creta",30,"Vijayanagar","arjun@gmail.com","Manjunath","Arjun",9988776655L,"Majestic","Yeshwanthpur");
        UberDto uberDto= new UberDto(5,"Venue",27,"Indiranagar","kavya@gmail.com","Nagaraj","Kavya",9090909090l,"Domlur","KR Puram");
        Uber uber=new Uber();
        uber.displayUber(uberDto);
    }
}
