package com.xworkz.travel.external;

import com.xworkz.travel.dto.NammaYatraDto;
import com.xworkz.travel.internal.NammaYatra;

public class NammaYatraRunner {

    public static void main(String[] args) {

        //NammaYatraDto nammaYatraDto = new NammaYatraDto(1, "Auto XL", "Rajajinagar", "Jayanagar", 22, "Shivakumar@gmail.com", "Manoj", 9876501234L, "Shivkumar", "Kumar");
        //NammaYatraDto nammaYatraDto = new NammaYatraDto(2, "Auto Mini", "BTM Layout", "Electronic City", 18, "rahul.k@gmail.com", "Rahul", 9123456789L, "Ramesh", "Shetty");
       // NammaYatraDto nammaYatraDto = new NammaYatraDto(3, "Auto XL", "Yelahanka", "Hebbal", 30, "anita.s@gmail.com", "Praksha", 9988776655l, "Suresh", "Patil");
        //NammaYatraDto nammaYatraDto = new NammaYatraDto(4, "Auto Regular", "Whitefield", "Marathahalli", 12, "kiran.m@gmail.com", "Kiran", 9090909090L, "Mahesh", "Naik");
        NammaYatraDto nammaYatraDto = new NammaYatraDto(5, "Auto Mini", "Malleshwaram", "Majestic", 31, "pooja.r@gmail.com", "Mallappa", 9012345678l, "Ravi", "Kumar");


        NammaYatra nammaYatra = new NammaYatra();
        nammaYatra.saveNammaYatra(nammaYatraDto);
    }
}
