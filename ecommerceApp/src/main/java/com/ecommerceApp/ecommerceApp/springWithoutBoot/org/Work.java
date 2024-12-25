package com.ecommerceApp.ecommerceApp.springWithoutBoot.org;

public class Work {
    final private String deg;
    final private String technology;

    public Work(String deg, String technology) {
        this.deg = deg;
        this.technology = technology;
    }

    public String getDeg() {
        return deg;
    }

    public String getTechnology() {
        return technology;
    }
}
