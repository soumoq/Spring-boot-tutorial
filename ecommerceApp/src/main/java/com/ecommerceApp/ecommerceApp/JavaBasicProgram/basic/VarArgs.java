package com.ecommerceApp.ecommerceApp.JavaBasicProgram.basic;

public class VarArgs {
    public static void main(String... args) {
        Product product1 = new Product(1, "p1");
        Product product2 = new Product(2, "p2");

        orderProduct(new Product[]{product1, product2});
    }

    private static void orderProduct(Product[] products) {
        for (Product product : products) {
            System.out.println("id: " + product.getId());
            System.out.println("name: " + product.getName());
        }
    }
}

class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}

class Drink {
    private int id;

}
