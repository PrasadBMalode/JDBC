package com.xworkz.travel.external;

import com.xworkz.travel.internal.NammaYatraDelete;

public class NammaYatraFirstRunner {
    public static void main(String[] args) {
        NammaYatraDelete nammaYatraDelete=new NammaYatraDelete();
        nammaYatraDelete.deleteById(1);
    }
}
