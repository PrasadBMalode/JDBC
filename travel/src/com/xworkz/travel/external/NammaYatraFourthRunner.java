package com.xworkz.travel.external;

import com.xworkz.travel.internal.NammaYatraDelete;

public class NammaYatraFourthRunner {
    public static void main(String[] args) {
        NammaYatraDelete nammaYatraDelete=new NammaYatraDelete();
        nammaYatraDelete.deleteByNameAndPhoneAndEmail("Suresh",9988776655l,"anita.s@gmail.com");
    }
}
