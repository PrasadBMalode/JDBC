package com.xworkz.travel.external;

import com.xworkz.travel.internal.NammaYatraDelete;

public class NammaYatraThirdRunner {
    public static void main(String[] args) {
        NammaYatraDelete nammaYatraDelete=new NammaYatraDelete();
        nammaYatraDelete.deleteByNameAndPhone("Mahesh",9090909090l);
    }
}
