package com.xworkz.travel.external;

import com.xworkz.travel.internal.NammaYatraDelete;

public class NammaYatraSecondRunner {
    public static void main(String[] args) {
        NammaYatraDelete nammaYatraDelete=new NammaYatraDelete();
        nammaYatraDelete.deleteByEmail("pooja.r@gmail.com");
    }
}
