package com.ecommerceApp.ecommerceApp.springWithoutBoot.org;

public class Emp {
    private int id;
    private Salary salary;
    private Work work;

    public Emp(int id, Salary salary, Work work) {
        this.id = id;
        this.salary = salary;
        this.work = work;
    }

    @Override
    public String toString() {
        System.out.println("id : " + id);
        System.out.println("Salary : " + salary.getAmount());
        System.out.println("Bank : " + salary.getBank().getName());
        System.out.println("Deg : " + work.getDeg());
        System.out.println("Tec : " + work.getTechnology());
        return super.toString();
    }
}
