package com.xworkz.travel.external;

import com.xworkz.travel.dto.RapidoDto;
import com.xworkz.travel.internal.Rapido;

public class RapidoRunner {
    public static void main(String[] args) {
        //RapidoDto rapidoDto=new RapidoDto(1, "FZ", "Basavaraja", 24, "prasad@gmail", "Bangalore", "Prasad", 6360211265l, 9.3f, 348);
        //RapidoDto rapidoDto=new RapidoDto(2, "X-Pulse", "Vinod", 24, "vinod@gmail", "Bangalore", "Praksh", 9876786546l, 9.3f, 221);
        //RapidoDto rapidoDto=new RapidoDto(3, "Bulet", "Gururaj", 23, "pavan@gmail", "Bangalore", "pavan", 88767686546l, 8.9f, 331);
        //RapidoDto rapidoDto=new RapidoDto(4, "RX-100", "Shivraj", 22, "suhas@gmail", "Bangalore", "Suhas", 7865478976l, 8.2f, 124);
        RapidoDto rapidoDto=new RapidoDto(5, "Kawasaki", "Meghnath", 21, "kumar@gmail", "Bangalore", "Kumar", 9480295666l, 9.2f, 111);

        Rapido rapido=new Rapido();
        rapido.displayRapido(rapidoDto);


    }
}
