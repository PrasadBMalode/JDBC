package com.xworkz.travel.external;

import com.xworkz.travel.dto.RapidoDto;
import com.xworkz.travel.internal.RapidoUpdate;

public class RapidoUpdateFourthRunner {
    public static void main(String[] args) {
        RapidoDto rapidoDto = new RapidoDto(6, "Yamaha", "Suresh", 25, "suresh@gmail.com", "Mysore", "Reddy", 9876543210L, 8.7f, 222);

        RapidoUpdate rapidoUpdate=new RapidoUpdate();
        rapidoUpdate.updateNameAndPhoneAndEmailById(rapidoDto);
    }
}
